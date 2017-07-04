class CompAcc{
  val id =CompAcc.newNum()
  val bal=0;
  def balance =bal
}

object CompAcc{
  private var lastNum=0 //Static member
  private def newNum()={lastNum+=1;lastNum}
}

object CompAccDemo extends App{
  val r1=new CompAcc
  val r2=new CompAcc



  println(r1.balance +""+r1.id)
  println(r2.balance +""+r2.id)
}