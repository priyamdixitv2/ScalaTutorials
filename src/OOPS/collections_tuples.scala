import scala.collection.mutable._
/*The actual type of a tuple depends upon the number and of elements it contains and the types of those elements. Thus, the type of (99, "Luftballons") is Tuple2[Int, String]. The type of ('u', 'r', "the", 1, 4, "me") is Tuple6[Char, Char, String, Int, Int, String]

Tuples are of type Tuple1, Tuple2, Tuple3 and so on. There currently is an upper limit of 22 in the Scala if you need more, then you can use a collection, not a tuple. For each TupleN type, where 1 <= N <= 22, Scala defines a number of element-access methods. Given the following definition −
* */
object mainTuples extends App{

  var t=(4,3,2,1)
  val t2 = new Tuple2("Scala", "hello")
println(t._1)
t.productIterator.foreach{i=>println("Value = "+i)}
println(t.toString())
t2.swap.productIterator.foreach(println)
}
