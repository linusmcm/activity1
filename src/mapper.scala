scala.io.Source.stdin.getLines.foreach(lines => {
  var linesLower = lines.toLowerCase()
  linesLower = linesLower.replaceAll("""[\p{Punct}]""", "")
  linesLower.split(" ").foreach(x => println(s"$x\t1"))
})