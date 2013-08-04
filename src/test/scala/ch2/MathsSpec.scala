package ch2

import org.specs2.mutable._
import ch2.Maths.{fibonacci}

class MathsSpec extends Specification {

  "fibonacci(n) function" should {
    "return 0 for n=0" in {
      fibonacci(0) must beEqualTo(0)
    }

    "return 1 for n=1" in {
      fibonacci(1) must beEqualTo(1)
    }

    // remove once the below one passes
    "return 1 for n=2" in {
      fibonacci(1) must beEqualTo(1)
    }

    "return (n-1)+(n-2) for any n >= 2" in {
      fibonacci(3) must beEqualTo(2)
      fibonacci(4) must beEqualTo(3)
      fibonacci(5) must beEqualTo(5)
      fibonacci(6) must beEqualTo(8)
    }
  }
}
