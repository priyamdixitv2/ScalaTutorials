class Point1{
  private var _x=0
  private var _y=0
  private val bound =100

  def x=_x
  def x_=(newValue: Int):Unit={
    if(newValue < bound) _x =newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning =println("Warning: Out of Bounds")

}



object Main6 extends App {
    val point1 = new Point1()
    point1.x=101
  println(point1.x)
    println(point1.x)  // prints 1
}