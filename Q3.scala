package FP_Prac06

object Q3 {

    def printfibonacci(numbers: Int): Unit = {
      for (i <- 0 until numbers) {
        println(fibonacci(i) + " ")

      }
    }

    def fibonacci(n: Int): Int = {
      if (n <= 1) {
        n
      } else {
        fibonacci(n - 1) + fibonacci(n - 2)
      }
    }

    def main(args: Array[String]): Unit = {

      val n = 10
      println(s"fibonacci sequence for first $n numbers :")

      printfibonacci(n)

    }


}
