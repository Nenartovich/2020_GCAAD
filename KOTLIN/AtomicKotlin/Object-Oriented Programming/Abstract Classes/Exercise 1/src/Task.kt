// Abstract/AbsExercise1.kt
package abstractClassesExercise1

import atomictest.eq

abstract class Movable {
  fun move() = "move"
}

abstract class Sleepable {
  fun sleepOn() = "sleep"
}

// class Sofa: Movable(), Sleepable()

fun main() {
/*
  val sofa = Sofa()
  sofa.move() eq "move"
  sofa.sleepOn() eq "sleep"
*/
}