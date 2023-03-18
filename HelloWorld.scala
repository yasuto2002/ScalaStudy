
object HelloWorld {

  class Point {
    private var a = 0
    private var b = 0
    private val bound = 100

    def x: Int = a

    def x_=(newValue: Int): Unit = {
      if (newValue < bound)
        a = newValue
      else
        printWarning()
    }

    def y: Int = b

    def y_=(newValue: Int): Unit = {
      if (newValue < bound)
        b = newValue
      else
        printWarning()
    }

    private def printWarning(): Unit =
      println("WARNING: Out of bounds")
  }
  def main(args: Array[String]): Unit = {
    val point1 = new Point()
    println(point1.x)
    point1.x = 99
    point1.y = 101
    println(point1.x)
  }


  }