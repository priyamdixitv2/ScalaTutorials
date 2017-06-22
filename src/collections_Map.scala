import scala.collection.mutable._

object mainMap extends App{

  val name=Map("Priyam"->1,"Dixit"->2)
  val hobby=Map("Chess"->1,"football"->2)
//  println(name.isEmpty)
//  name +=("Kumar"->3)
//  name +=("A"->0)
//  println("Key"+name.keys)
//  println("Key"+name.values)
//
//  println("---------------------")
//
//  println(name++hobby)
//  println(hobby.++(hobby))
//  println(hobby.++(name))
   name.keys.foreach{i=>
     print("Key = "+i+" ")
     println("value = "+name(i))
   }
  println(name.size)
  name.clear()
println(name.size)
}
