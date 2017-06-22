//Higher-order Fuctions
//Scala allows the definition of higher-order functions. These are functions that take other functions as parameters, or whose result is a function.

//def apply(f: Int => String,v:Int)=f(v)

class Decorator(left: String, right:String){
  def layout[A](x:A) = left + x.toString()+right
}

object FunTest extends App{
  def apply(f: Int => String, v:Int)=f(v)
  val decorator=new Decorator("[","]")
  println(apply(decorator.layout,7))
  //println(apply(decorator.layout,7))
}
