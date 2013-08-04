package ch2

import scala.annotation.tailrec

object Maths {

  def fibonacci(n: Int): Int = {

    @tailrec
    def fibonacci_aux(n: Int, next: Int, result: Int): Int =
      n match {
        case 0 => result
        case _ => fibonacci_aux(n - 1, result + next, next)
      }

    fibonacci_aux(n, 1, 0)
  }
}