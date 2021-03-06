о
Kotlin Bootcamp для программистов 5.2: Обобщения Generics
generic classes, functions, and methods, and how they work in Kotlin
Введение в дженерики
Чтобы определить универсальный тип, поставьте T в угловых скобках <T>после имени класса.
(Вы можете использовать другую букву или более длинное имя, но условным обозначением для универсального типа является T.)
Вы можете ссылаться, T как если бы это был нормальный тип.
Тип возвращаемого значения для get()is T, а параметр to addItem() имеет тип T.
Конечно, универсальные списки очень полезны, поэтому List класс встроен в Kotlin.

Совет: файлы не обязательно должны иметь одинаковые имена с классом, и вы можете иметь несколько классов в файле.
Шаг 2: Создайте общий класс
При создании Aquarium объекта вы можете удалить угловые скобки и то,
что находится между ними, потому что у Kotlin есть вывод типа.
Так что нет смысла говорить TapWater дважды при создании экземпляра.
Тип может быть выведен по аргументу to Aquarium; это все еще сделает Aquarium тип TapWater.
Совет: используйте check()функцию, чтобы убедиться, что ваш код работает должным образом.
Вышесказанное охватывает основы дженериков.
Следующие задачи охватывают больше, но важной концепцией является то,
как объявить и использовать универсальный класс с общим ограничением.

3. Задача: узнать о входных и выходных типах
В этой задаче вы узнаете о входных и выходных типах с помощью дженериков.
in Является типом , который может быть передан только в класс, не вернулся.
out Является типом , который может быть возвращен только из класса.
Посмотрите на Aquarium класс, и вы увидите, что универсальный тип возвращается только при получении свойства waterSupply.
Нет никаких методов, которые бы принимали значение типа T в качестве параметра (кроме определения его в конструкторе).
Kotlin позволяет вам определять out типы именно для этого случая и выводить дополнительную информацию о том,
где типы безопасны для использования.
Точно так же вы можете определить in типы для универсальных типов,
которые только когда-либо передаются в методы, но не возвращаются.
Это позволяет Kotlin делать дополнительные проверки безопасности кода.
in И out типы директив для системы типа Котлин в.
Объяснение всей системы типов выходит за рамки этого буткемпа (это довольно сложно);
тем не менее, компилятор будет отмечать типы, которые не помечены in и out соответственно,
поэтому вам необходимо знать о них.
Замечания:
val и var о значениях переменных. val защищает значение переменной от изменения.
in и out о типах переменных. in и out убедитесь,
что при работе с универсальными типами только безопасные типы передаются в и из функций.
Шаг 2: Определите тип
in Тип похож на out тип, но для общих типов, которые только когда - либо проходили в функцию, не возвращается.
Если вы попытаетесь вернуть in тип, вы получите ошибку компилятора.
В этом примере вы определите in тип как часть интерфейса.

Kotlin будет использовать информацию о типах in и out для того, чтобы убедиться, что ваш код безопасно использует шаблоны.
Out и in их легко запомнить: out типы можно передавать как возвращаемые значения, in типы можно передавать как аргументы.
Совет: IntelliJ IDEA предложит вам добавить out или in к вашим универсальным типам, когда это будет правильно.
Если вы щелкнете по имени общего типа, IntelliJ IDEA поместит «лампочку намерения» в начале строки.
Если вы нажмете на лампочку, появится список предложений.

4. Задача: узнать об общих функциях
В этом задании вы узнаете об общих функциях и о том, когда их использовать.
Как правило, создание универсальной функции - хорошая идея,
когда функция принимает аргумент класса, который имеет универсальный тип.
Шаг 1: Создайте универсальную функцию

Чтобы выполнить is проверку, вы должны сообщить Kotlin,
что тип является реализованным или реальным, и его можно использовать в функции.
Для этого поместите inline перед fun ключевым словом и reified перед универсальным типом R.
Примечание. Общие типы обычно доступны только во время компиляции и заменяются фактическими типами.
Чтобы общий тип оставался доступным до времени выполнения, объявите функцию inline и создайте тип reified.

Как только тип будет преобразован, вы можете использовать его как обычный тип
 - потому что это реальный тип после встраивания.
  Это означает, что вы можете делать is проверки, используя тип.
Если вы не используете reified здесь, тип не будет "реальным" для того, чтобы Kotlin разрешил is проверки.
Это связано с тем, что нереализованные типы доступны только во время компиляции
и не могут использоваться вашей программой во время выполнения.
Это обсуждается подробнее в следующем разделе.

Шаг 3: Сделать функции расширения
C помощью этих функций расширения, это не имеет значения , какой тип Aquarium этого является
 ( Aquariumили TowerTankили какой -либо другой подкласс), до тех пор , как это Aquarium.
  Использование синтаксиса звездной проекции - это удобный способ указать множество совпадений.
  И когда вы используете звездную проекцию, Kotlin позаботится о том, чтобы вы тоже не сделали ничего небезопасного.

Примечание. Star-проекции очень похожи на необработанные типы в языке программирования Java, но безопасны.
Чтобы использовать звездную проекцию, поставьте <*>после Aquarium.
Перейдите hasWaterSupplyOfType()к функции расширения,
потому что она на самом деле не является частью основного API Aquarium.

5. Концепция: Reified типы и стирание типа Reified types and type erasure
В предыдущем примере вы должны были пометить универсальный тип как reified и создать функцию inline,
потому что Kotlin должен знать о них во время выполнения, а не только во время компиляции.
Все общие типы используются только во время компиляции Kotlin.
Это позволяет компилятору убедиться, что вы все делаете безопасно.
Во время выполнения все общие типы стираются, отсюда и более раннее сообщение об ошибке проверки стертого типа.
Оказывается, компилятор может создать правильный код без сохранения универсальных типов до времени выполнения.
Но это означает, что иногда вы делаете что-то, например, is проверки универсальных типов,
которые компилятор не может поддерживать. Вот почему Котлин добавил утонченные или настоящие типы.
Вы можете прочитать больше о reified типах и стирании типов в документации Kotlin.

6. Резюме
Этот урок был сфокусирован на обобщениях, которые важны для того,
чтобы сделать код более гибким и простым для повторного использования.
Создайте универсальные классы, чтобы сделать код более гибким.
Добавьте общие ограничения, чтобы ограничить типы, используемые с обобщениями.
Используйте in и out типы с обобщениями, чтобы обеспечить лучшую проверку типов,
чтобы ограничить типы, передаваемые в классы или возвращаемые из них.
Создать универсальные функции и методы для работы с универсальными типами. Например:
fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) { ... }
Используйте универсальные функции расширения, чтобы добавить неосновную функциональность в класс.
Реатифицированные типы иногда необходимы из-за стирания типов.
Реализованные типы, в отличие от универсальных типов, сохраняются во время выполнения.
Используйте check()функцию, чтобы убедиться, что ваш код работает должным образом. Например:
check(!waterSupply.needsProcessing) { "water supply needs processing first" }

7. Узнайте больше
Котлинская документация
Если вам нужна дополнительная информация по какой-либо теме этого курса или вы застряли,
https://kotlinlang.org - ваша лучшая отправная точка.

Kotlin соглашения о кодировании
Котлин идиомы
Дженерики
Общие ограничения
Star-проекции
In и out типы
Уточненные параметры
Тип стирания
check() функция
Котлин учебники
Веб- сайт https://play.kotlinlang.org содержит подробные учебные пособия под названием Kotlin Koans,
веб-переводчик , а также полный набор справочной документации с примерами.

Курс Udacity
Чтобы просмотреть курс Udacity по этой теме, см. Kotlin Bootcamp for Programmers .

IntelliJ IDEA
Документацию для IntelliJ IDEA можно найти на веб-сайте JetBrains.
