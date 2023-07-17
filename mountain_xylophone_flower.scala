import scala.collection.mutable.ArrayBuffer

object KeepItClean {
 
  // Java style for loop
  def javaStyleForLoop(): Unit = {
    for (i <- 0 to 2000) {
       println("keep it clean")
    }
  }

  // While loop
  def whileLoop(): Unit = {
    var i = 0
    while (i < 2000) {
      println("keep it clean")
      i += 1
    }
  }

  // ArrayBuffer and foreach
  def arrayBufferForeach(): Unit = {
    var arrayBuf = new ArrayBuffer[Int]()
    for (i <- 0 to 2000) {
      arrayBuf += i
    }

    arrayBuf.foreach(i => {
      println("keep it clean")
    })
  }

  // Recursive loop
  def recursiveLoop(i: Int): Unit = {
    if (i < 2000) {
      println("keep it clean")
      recursiveLoop(i + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    javaStyleForLoop()
    whileLoop()
    arrayBufferForeach()
    recursiveLoop(0)
  }
}