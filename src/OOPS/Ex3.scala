//class
//Imp: override def toString: String =

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x,$y)"
}

object Main3 extends App {
  val point1=new Point(2,3)
    point1.x
    println(point1.toString)
  point1.move(3,5)
  println(point1.x)
}


