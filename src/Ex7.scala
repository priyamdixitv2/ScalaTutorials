/*
* Mixins are the trait which are used to compose a class
* */

abstract class A{
  val message: String
}

class B extends A{
  val message ="I'm an instance of class B"
}

trait C extends A{
  def loudMessage= message.toUpperCase()
}

class D extends B with C


object Main8 extends App {
  val d= new D

  println(d.loudMessage)
  println(d.message)

}