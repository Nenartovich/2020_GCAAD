@file:Suppress("UNUSED_PARAMETER")

package lesson8.task1

import java.lang.IllegalArgumentException
import kotlin.math.abs
import kotlin.math.max


/**  ***************************** -1 *************************************
 * Точка (гекс) на шестиугольной сетке.
 * Координаты заданы как в примере (первая цифра - y, вторая цифра - x)
 *
 *       60  61  62  63  64  65
 *     50  51  52  53  54  55  56
 *   40  41  42  43  44  45  46  47
 * 30  31  32  33  34  35  36  37  38
 *   21  22  23  24  25  26  27  28
 *     12  13  14  15  16  17  18
 *       03  04  05  06  07  08
 *
 * В примерах к задачам используются те же обозначения точек,
 * к примеру, 16 соответствует HexPoint(x = 6, y = 1), а 41 -- HexPoint(x = 1, y = 4).
 *
 * В задачах, работающих с шестиугольниками на сетке, считать, что они имеют
 * _плоскую_ ориентацию:
 *  __
 * /  \
 * \__/
 *
 * со сторонами, параллельными координатным осям сетки.
 *
 * Более подробно про шестиугольные системы координат можно почитать по следующей ссылке:
 *   https://www.redblobgames.com/grids/hexagons/
 */
data class HexPoint(val x: Int, val y: Int) {
    /**
     * Средняя******************************* 01 **************************************
     *
     * Найти целочисленное расстояние между двумя гексами сетки.
     * Расстояние вычисляется как число единичных отрезков в пути между двумя гексами.
     * Например, путь межу гексами 16 и 41 (см. выше) может проходить через 25, 34, 43 и 42 и имеет длину 5.
     */
    // ok 19.02.2020 16:01 от Афалины
    fun distance(other: HexPoint): Int =
        if ((this.y - other.y) * (this.x - other.x) > 0)
            abs(this.y - other.y) + abs(this.x - other.x)
        else max(abs(this.y - other.y), abs(this.x - other.x))

    override fun toString(): String = "$y.$x"
}

/**  ***************************** -1 *************************************
 * Правильный шестиугольник на гексагональной сетке.
 * Как окружность на плоскости, задаётся центральным гексом и радиусом.
 * Например, шестиугольник с центром в 33 и радиусом 1 состоит из гексов 42, 43, 34, 24, 23, 32.
 */
data class Hexagon(val center: HexPoint, val radius: Int) {

    /**
     * Средняя ******************************* 02 **************************************
     *
     * Рассчитать расстояние между двумя шестиугольниками.
     * Оно равно расстоянию между ближайшими точками этих шестиугольников,
     * или 0, если шестиугольники имеют общую точку.
     *
     * Например, расстояние между шестиугольником A с центром в 31 и радиусом 1
     * и другим шестиугольником B с центром в 26 и радиуоом 2 равно 2
     * (расстояние между точками 32 и 24)
     */
    fun distance(other: Hexagon): Int = this.center.distance(other.center) - (this.radius + other.radius)

    /**
     * Тривиальная ******************************* 03 **************************************
     *
     * Вернуть true, если заданная точка находится внутри или на границе шестиугольника
     */
    fun contains(point: HexPoint): Boolean = this.center.distance(point) <= this.radius

    // От ДО - Вернуть List из Гексов Углов шестиугольника
    fun angles(): List<HexPoint> = Direction.values().filter { it != Direction.INCORRECT }
        .map { center.move(it, radius) }

    // От ДО - Вернуть List из HexSegments сторон шестиугольника
    fun sides(): List<HexSegment> = Direction.values().filter { it != Direction.INCORRECT }
        .map { HexSegment(center.move(it, radius), center.move(it.next(), radius)) }

    // От ДО - Вернуть List Гексов контура шестиугольника
    fun kontur(): List<HexPoint> {
        val kontList: MutableList<HexPoint> = arrayListOf()
        for (s in sides())
            kontList.addAll(pathBetweenHexes(s.begin, s.end))
        val a = sides().map { s-> pathBetweenHexes(s.begin, s.end)}//.flatMap {  }
        return kontList
    }
}
/**
 * Прямолинейный отрезок между двумя гексами
 */
class HexSegment(val begin: HexPoint, val end: HexPoint) {
    /**
     * Простая ******************************* 04 **************************************
     *
     * Определить "правильность" отрезка.
     * "Правильным" считается только отрезок, проходящий параллельно одной из трёх осей шестиугольника.
     * Такими являются, например, отрезок 30-34 (горизонталь), 13-63 (прямая диагональ) или 51-24 (косая диагональ).
     * А, например, 13-26 не является "правильным" отрезком.
     */
    fun isValid(): Boolean = begin.x == end.x || begin.y == end.y || begin.x + begin.y == end.x + end.y

    /**
     * Средняя ******************************* 05 **************************************
     *
     * Вернуть направление отрезка (см. описание класса Direction ниже).
     * Для "правильного" отрезка выбирается одно из первых шести направлений,
     * для "неправильного" -- INCORRECT.
     */
    fun direction(): Direction = when {
        begin.y == end.y && begin.x <= end.x -> Direction.RIGHT
        begin.y == end.y && begin.x >= end.x -> Direction.LEFT
        begin.y <= end.y && begin.x == end.x -> Direction.UP_RIGHT
        begin.y >= end.y && begin.x == end.x -> Direction.DOWN_LEFT
        begin.y <= end.y && begin.y + begin.x == end.y + end.x -> Direction.UP_LEFT
        begin.y >= end.y && begin.y + begin.x == end.y + end.x -> Direction.DOWN_RIGHT
        else -> Direction.INCORRECT
    }

    override fun equals(other: Any?) =
        other is HexSegment && (begin == other.begin && end == other.end || end == other.begin && begin == other.end)

    override fun hashCode() =
        begin.hashCode() + end.hashCode()
}

/** ***************************** -1 *************************************
 * Направление отрезка на гексагональной сетке.
 * Если отрезок "правильный", то он проходит вдоль одной из трёх осей шестугольника.
 * Если нет, его направление считается INCORRECT
 */
enum class Direction {
    RIGHT,      // слева направо, например 30 -> 34
    UP_RIGHT,   // вверх-вправо, например 32 -> 62
    UP_LEFT,    // вверх-влево, например 25 -> 61
    LEFT,       // справа налево, например 34 -> 30
    DOWN_LEFT,  // вниз-влево, например 62 -> 32
    DOWN_RIGHT, // вниз-вправо, например 61 -> 25
    INCORRECT;  // отрезок имеет изгиб, например 30 -> 55 (изгиб в точке 35)

    /**
     * Простая ******************************* 06 **************************************
     *
     * Вернуть направление, противоположное данному.
     * Для INCORRECT вернуть INCORRECT
     */
    fun opposite(): Direction = when (this) {
        RIGHT -> LEFT               // слева направо, например 30 -> 34
        UP_RIGHT -> DOWN_LEFT       // вверх-вправо, например 32 -> 62
        UP_LEFT -> DOWN_RIGHT       // вверх-влево, например 25 -> 61
        LEFT -> RIGHT               // справа налево, например 34 -> 30
        DOWN_LEFT -> UP_RIGHT       // вниз-влево, например 62 -> 32
        DOWN_RIGHT -> UP_LEFT       // вниз-вправо, например 61 -> 25
        INCORRECT -> INCORRECT      // отрезок имеет изгиб, например 30 -> 55 (изгиб в точке 35)
    }

    /**
     * Средняя ******************************* 07 **************************************
     *
     * Вернуть направление, повёрнутое относительно
     * заданного на 60 градусов против часовой стрелки.
     *
     * Например, для RIGHT это UP_RIGHT, для UP_LEFT это LEFT, для LEFT это DOWN_LEFT.
     * Для направления INCORRECT бросить исключение IllegalArgumentException.
     * При решении этой задачи попробуйте обойтись без перечисления всех семи вариантов.
     */
    fun next(): Direction = when (this) {
        RIGHT -> UP_RIGHT                    // слева направо, например 30 -> 34
        UP_RIGHT -> UP_LEFT                  // вверх-вправо, например 32 -> 62
        UP_LEFT -> LEFT                     // вверх-влево, например 25 -> 61
        LEFT -> DOWN_LEFT                   // справа налево, например 34 -> 30
        DOWN_LEFT -> DOWN_RIGHT             // вниз-влево, например 62 -> 32
        DOWN_RIGHT -> RIGHT                 // вниз-вправо, например 61 -> 25
        INCORRECT -> throw IllegalArgumentException()         // отрезок имеет изгиб, например 30 -> 55 (изгиб в точке 35)

    }

    /**
     * Простая ******************************* 08 **************************************
     *
     * Вернуть true, если данное направление совпадает с other или противоположно ему.
     * INCORRECT не параллельно никакому направлению, в том числе другому INCORRECT.
     */
    fun isParallel(other: Direction): Boolean = this != INCORRECT && (this == other || this == other.opposite())
}

/**
 * Средняя ******************************* 09 **************************************
 *
 * Сдвинуть точку в направлении direction на расстояние distance.
 * Бросить IllegalArgumentException(), если задано направление INCORRECT.
 * Для расстояния 0 и направления не INCORRECT вернуть ту же точку.
 * Для отрицательного расстояния сдвинуть точку в противоположном направлении на -distance.
 *
 * Примеры:
 * 30, direction = RIGHT, distance = 3 --> 33
 * 35, direction = UP_LEFT, distance = 2 --> 53
 * 45, direction = DOWN_LEFT, distance = 4 --> 05
 */
fun HexPoint.move(direction: Direction, distance: Int): HexPoint = when (direction) {
    Direction.RIGHT -> HexPoint(this.x + distance, this.y)                   // слева направо, например 30 -> 34
    Direction.UP_RIGHT -> HexPoint(this.x, this.y + distance)                // вверх-вправо, например 32 -> 62
    Direction.UP_LEFT -> HexPoint(this.x - distance, this.y + distance)   // вверх-влево, например 25 -> 61
    Direction.LEFT -> HexPoint(this.x - distance, this.y)                    // справа налево, например 34 -> 30
    Direction.DOWN_LEFT -> HexPoint(this.x, this.y - distance)               // вниз-влево, например 62 -> 32
    Direction.DOWN_RIGHT -> HexPoint(this.x + distance, this.y - distance) // вниз-вправо, например 61 -> 25
    Direction.INCORRECT -> throw IllegalArgumentException()                     // отрезок имеет изгиб, например 30 -> 55 (изгиб в точке 35)
}

/**
 * Сложная ******************************* 10 **************************************
 *
 * Найти кратчайший путь между двумя заданными гексами, представленный в виде списка всех гексов,
 * которые входят в этот путь.
 * Начальный и конечный гекс также входят в данный список.
 * Если кратчайших путей существует несколько, вернуть любой из них.
 *
 * Пример (для координатной сетки из примера в начале файла):
 *   pathBetweenHexes(HexPoint(y = 2, x = 2), HexPoint(y = 5, x = 3)) ->
 *     listOf(
 *       HexPoint(y = 2, x = 2),
 *       HexPoint(y = 2, x = 3),
 *       HexPoint(y = 3, x = 3),
 *       HexPoint(y = 4, x = 3),
 *       HexPoint(y = 5, x = 3)
 *     )
 */
// ОК тупо но работает шажками во все стороны 18,02,2020 22:35
fun pathBetweenHexes(from: HexPoint, to: HexPoint): List<HexPoint> //= TODO()
{   println("OK From> $from --->  TO: $to Distance: ${from.distance(to)} ")
    val rezList: MutableList<HexPoint> = mutableListOf(from)
    var mov = from
    while (mov.distance(to) > 0)
        for (dire in Direction.values())
        //if (dire == Direction.INCORRECT) continue  // необязательно - не должна туда дойти, но можно
            if (mov.move(dire,1).distance(to) == mov.distance(to) - 1) {
                mov = mov.move(dire, 1)
                rezList.add(mov)
                println("OK  ---> $mov")
                break
            }
    println(rezList)
    return rezList
}

/**
 * Очень сложная ******************************* 11 **************************************
 *
 * Дано три точки (гекса). Построить правильный шестиугольник, проходящий через них
 * (все три точки должны лежать НА ГРАНИЦЕ, а не ВНУТРИ, шестиугольника).
 * Все стороны шестиугольника должны являться "правильными" отрезками.
 * Вернуть null, если такой шестиугольник построить невозможно.
 * Если шестиугольников существует более одного, выбрать имеющий минимальный радиус.
 *
 * Пример: через точки 13, 32 и 44 проходит правильный шестиугольник с центром в 24 и радиусом 2.
 * Для точек 13, 32 и 45 такого шестиугольника не существует.
 * Для точек 32, 33 и 35 следует вернуть шестиугольник радиусом 3 (с центром в 62 или 05).
 *
 * Если все три точки совпадают, вернуть шестиугольник нулевого радиуса с центром в данной точке.
 */
fun hexagonByThreePoints(a: HexPoint, b: HexPoint, c: HexPoint): Hexagon? = TODO()
// идея брать равоудаленные от a и b и смотреть удаление ее от с

/**
 * Очень сложная ******************************* 12 **************************************
 *
 * Дано множество точек (гексов). Найти правильный шестиугольник минимального радиуса,
 * содержащий все эти точки (безразлично, внутри или на границе).
 * Если множество пустое, бросить IllegalArgumentException.
 * Если множество содержит один гекс, вернуть шестиугольник нулевого радиуса с центром в данной точке.
 *
 * Пример: 13, 32, 45, 18 -- шестиугольник радиусом 3 (с центром, например, в 15)
 */
fun minContainingHexagon(vararg points: HexPoint): Hexagon = TODO()



