package ch2

import org.specs2.mutable._
import org.specs2.matcher.DataTables

import ch2.Maths.{fibonacci}

class MathsSpec extends Specification with DataTables {

  "fibonacci(n)" should {
    "return 0 for n=0" in {
      fibonacci(0) must beEqualTo(0)
    }

    "return 1 for n=1" in {
      fibonacci(1) must beEqualTo(1)
    }

    "return (n-1)+(n-2) for any n > 1" ! fibonacciSequenceExamples
  }

  def fibonacciSequenceExamples =
    "n" | "expected_result" |
     2  !   1               |
     3  !   2               |
     4  !   3               |
     5  !   5               |
     6  !   8               |
     7  !  13               |
     8  !  21               |> { (n, expected_result) =>
      fibonacci(n) must beEqualTo(expected_result)
    }
}
