import org.scalatest.funsuite.AnyFunSuite

class TestFactorial extends AnyFunSuite {
    val fact = new Factorial
  test ("scala test")
  {
    //successful test cases(test case will pass)
    assert(fact.factorial(0)==1)
    assert(fact.factorial(1)==1)
    assert(fact.factorial(5)==120)
    assert(fact.factorial(10)==3628800)

  }

}
