package Assigments

/**
  * Created by PD on 4/7/17.
  */
class AccountInfo {
var balance=0;
  def deposit(ammount:Int) = {
    balance.+=(ammount);
    println("Current Balance: "+balance)
  }
  def withdraw(ammount:Int) = {
    balance.-=(ammount);
    println("Current Balance: "+balance)
  }

}

object AccountInfo_Main extends App{
  var user1 =new AccountInfo
  user1.deposit(100);
  user1.withdraw(10)


}

