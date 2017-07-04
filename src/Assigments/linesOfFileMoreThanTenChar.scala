package Assigments

/**
  * Created by Priyam on 4/7/17.
  */
class linesOfFileMoreThanTenChar {



//  \\s+ >> meaning >> s means white spaces and + means any thing more than one
  def display(i: Int): Any = {val lines = scala.io.Source.fromFile("file.txt").mkString.split("\\s+").map(a=> if ( a.length>10)println(a))
  }

}

object reversesTheLinesOfFile_Main extends App{
  var user1 =new linesOfFileMoreThanTenChar
  user1.display(100)



}
