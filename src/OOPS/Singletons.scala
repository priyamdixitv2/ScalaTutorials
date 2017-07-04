/*
* 1. scala doesn't have the concepts of static methods or fields
* 2. It is supported by object construct
* 3. An object defines a single instance of a class
*4. Constructor of the Singleton is executed when the object is first used
* An object have all the features of the class, except
* " Parameters can't be provided to the constructor"
* >> There is only one Instance tat is modified again and again
* */


object Reservations{
  private  var lastNum=0
  def newReservationNum()={lastNum+=1;lastNum}
}

object mainRes extends App{
  print(Reservations.newReservationNum())
  print(Reservations.newReservationNum())
  print(Reservations.newReservationNum())
}