class Factorial {
  def factorial(number: Int): BigInt = {
    def factorial_tailRecursion(number: Int, accumulator: BigInt): BigInt = {
      //try clause
      try{
        if(number.isNaN) {
          throw new NumberFormatException
        }
      }
        //catch clause
      catch{
        case exception: NullPointerException=>{
          exception.getMessage

        }
      }
      if (number <= 1) accumulator

      else factorial_tailRecursion(number - 1, accumulator * number)
    }
    //tail recursive function

    factorial_tailRecursion(number, 1)

  }
}
