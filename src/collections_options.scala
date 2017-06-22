import scala.collection.mutable._

object Demo {
  def main(args: Array[String]) {
    val a: Option[Int] = None
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(2))
    println("b.getOrElse(10): " + b.getOrElse(10))
  }

}