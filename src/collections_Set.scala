import scala.collection.mutable._

object mainSet extends App{


  var s =Set(1,3,4,5)
  var s2=Set(6,7,8,9,1)
  var s1 = Set("A","B","C","D")
s.foreach(println)
  println(s.tail.head)
  println(s++s1)
  println(s.min)
  println(s1.min)
  println(s.intersect(s2))

}
