package loopingAndRangesExercise2

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  TODO()
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}