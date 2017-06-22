class Ctr{
  var value =0
  def incr(){value +=1}
  def curr()=value
}



object ctr extends App{
  val c=new Ctr
  c.incr
  c.curr
  println(c.value)
}
