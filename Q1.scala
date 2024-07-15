import scala.io.StdIn

object Q1 {

  var products2 = List[String]()

    var products = List[String]()

    def getproductlist(): List[String] = {

      var num = true
      while (num) {
        println("enter the product if you want to exit type('done') :  ")
        var product = StdIn.readLine().toString
        if (product.toLowerCase == "done") {
          num = false
        }
        else {
          products = products :+ product
        }

      }
      return products
    }


    def printproductlist(lis: List[String]): Unit = {
      for (i <- lis.indices) {
        println("product is : " + lis(i) + " which is at index " + (i + 1))
      }
    }

    def totalproducts(lis: List[String]): Int = {
      return lis.length
    }

    def main(args: Array[String]): Unit = {

      products2 = getproductlist()
      printproductlist(products2)

      println("Total number of products are : " + totalproducts(products2))


    }
}
