/*1. There are two types of constructor a) Auxiliary b) Primary
 2. aux const. in scala is called "this"
 3. aux const. must start with a call to either a previously defined aux
 or the primary const.

* */

class auxcons{
  private var size=0
  private var age=0
  def this(size: Int){
    this()
    this.size=size
    println(this.size)
  }
  def this(size: Int,age: Int){
    this(size)
    this.age=age
    println(this.size +" "+this.age)
  }
}


object mainAux extends App{
  val f=new auxcons(10,20)
}