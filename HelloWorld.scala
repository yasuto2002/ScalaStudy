
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val p1 = new BPrinter
    p1.print()
  }

  class APrinter {
    def print(): Unit = {
      println(1)
    }
  }

  class BPrinter extends APrinter {
    override def print(): Unit = {
      println(2)
    }
  }

  }