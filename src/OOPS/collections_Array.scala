import scala.collection.mutable.ArrayBuffer
import scala.util._
class sum{

def sum2 (array: ArrayBuffer[Int],array2: ArrayBuffer[Int]): Unit ={
  var sum=0
  //array.foreach(println)

  //array{1}=23
//  array.foreach(print)
//  println()
//  array2.foreach(print)
//  println()
//  array++=array2
//  array.foreach(print)
// // array.foreach(sum += _)
//  println("Sum :"+sum)
  println("_______________________")
//
//  for(el <-array){
//    println(el)
//  }
//  for (el <-array if el==2)yield (println(2*el))
//  println(array.max)
//  println(array.min)
//  println(array.sum)
var arr = Array(1,2,3,41,22)
  println(scala.util.Sorting.quickSort(arr))
arr.foreach(println)
  //array.foreach(println)
}}


object main extends App{
  val s =new sum
  s.sum2(ArrayBuffer[Int](1,2,32,141,50),ArrayBuffer[Int](1,2,3,4,5))
}

