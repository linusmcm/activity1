#! /bin/sh -x

#set -e
#### variables
inputFolder="/wc/in_folderName1"
outputFolder="/wc/out_folderName1"
reducerScala="reducer.scala"
mapperScala="mapper.scala"
#########################
if [ -d $outputFolder ]
  then
    hadoop fs -rm -r $outputFolder
    hadoop fs -rm -r $inputFolder
fi
#########################
### make a directory in hadoop
hadoop fs -mkdir -p $inputFolder
### load text files into to HDFS
hadoop fs -put *.txt $inputFolder
### make all scala files executable
chmod +x *.scala
### run code - check output directory name
# hadoop jar -mapper $mapperScala -reducer $reducerScala -input $inputFolder/* -output $outputFolder
hadoop jar /home/user/hadoop-2.7.3/share/hadoop/tools/lib/hadoop-streaming-2.7.3.jar -mapper $mapperScala -reducer $reducerScala -input $inputFolder/* -output $outputFolder
### check output for success
hadoop fs -ls $outputFolder
### read the output:
hadoop fs -cat $outputFolder/part-00000