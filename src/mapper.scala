
 //val src = io.Source.fromFile("C:/Users/linus/Documents/scala/datasets/temp.csv")
 //val src = io.Source.fromFile("C:\\Users\\linus\\IdeaProjects\\Activity1\\src\\first.txt")
  //for(lines <- src.getLines)
 for (line <- scala.io.Source.stdin.getLines)
 {
    //println(lines)
    var linesLower = lines.toLowerCase()
    //linesLower = linesLower.replaceAll("""[\p{Punct}&&[^.]]""", "")
    linesLower = linesLower.replaceAll("""[\p{Punct}]""", "")
    //println(linesLower)
    linesLower.split(" ").foreach(x => println(s"$x\t1"))

  }

 for (line <- scala.io.Source.stdin.getLines)
 {
   line.split(" ").foreach(x => println(s"$x\t1"))
 }



 //C:\Users\linus\IdeaProjects\Activity1\src\first.txt