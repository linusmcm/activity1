
 //val src = io.Source.fromFile("C:/Users/linus/Documents/scala/datasets/temp.csv")
 //val src = io.Source.fromFile("C:\\Users\\linus\\IdeaProjects\\Activity1\\src\\first.txt")
  //for(lines <- src.getLines)
 for (lines <- scala.io.Source.stdin.getLines)
 {
    var linesLower = lines.toLowerCase()
    linesLower = linesLower.replaceAll("""[\p{Punct}]""", "")
    linesLower.split(" ").foreach(x => println(s"$x\t1"))

  }




 //C:\Users\linus\IdeaProjects\Activity1\src\first.txt