package Assigments

/**
  * Created by Priyam on 4/7/17.
  */
class reversesTheLinesOfFile {




  def display(i: Int): Any = {val lines = scala.io.Source.fromFile("file.txt").mkString.split(" ").reverse.foreach(println)}

}

object reversesTheLinesOfFile_Main extends App{
  var user1 =new reversesTheLinesOfFile
  user1.display(100)



}
