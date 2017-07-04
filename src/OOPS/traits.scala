/*Scala Traits work exactly like Java interface, with some difference
 *Method need not b declared a abstract
  * an Unimplemented method is automatically assummed as abstract method
   *
* */
trait Logger{
  def log(msg: String)
}

class ConsoleLogger extends Logger with Cloneable with Serializable{
  override def log(msg: String){println(msg)}

}

