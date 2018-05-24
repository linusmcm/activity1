/** create word count map type with a string and a int */
var wordCount = scala.collection.immutable.Map[String,Int]()
for (ln <- scala.io.Source.stdin.getLines)
{
  var   wordOne = ln.split("\t")
  if (wordCount.contains(wordOne(0))){
    wordCount += (wordOne(0) -> (wordCount(wordOne(0))+wordOne(1).toInt))
  } else {
    wordCount += (wordOne(0) -> wordOne(1).toInt)
  }
}

wordCount.foreach(println)


