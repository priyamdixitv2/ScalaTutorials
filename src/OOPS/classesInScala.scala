class Counter{
  private var value=0
  def increment():Int= {value +=1
  value}
  def current()=value
}

object MainCounter extends App{
  val ob=new Counter
  val ob1=new Counter

  ob.increment()
  ob1.increment()
  ob1.increment()

  println("ob"+ob.increment)
  println("ob"+ob1.current)
}