package Assigments

/**
  * Created by Priyam on 4/7/17.
  */
class BankAccount(initBal: Double) {
  private var balance = initBal
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }
}


class CheckingAccount (initBal: Double) extends BankAccount(initBal: Double){

  def deposit1(amount: Double) = { deposit(amount)
  withdraw(1)}
  def withdraw1(amount: Double) = { withdraw(amount)
  withdraw(1)}

}

object CheckingAccount_Main extends App{
  var user1 =new CheckingAccount(0.0)
  println(user1.deposit1(100));
  println(user1.withdraw1(10))


}