/*Scala generate a class for the JVM with a private and public
getter setter methods
If the field is declared as private the getter setter
will also be private


* */

class Duck11{
  private var size1=1
  private var size=1

  def age = size //getter
  def age_=(newage: Int){if(newage> size)size=newage}
  def a = {

  }
  //getter
}

object DuckGeSe1 extends App{
  //getter
  var obja =new Duck11
obja.age_=(10)


//   //f.size_=(10)
//  print(f.size)
//  f.size =0 //f.size_=(10)
//  print(f.size)
}
