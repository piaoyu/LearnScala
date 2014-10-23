package com.piaoyu.scala.learn.courrent

/**
 * Parallel WordCount Learn
 * Created by piaoyu on 14-10-23.
 */
object ParallelWordCount {

  val file = List("warn 2013 msg", "warn 2012 msg",
    "error 2013 msg", "warn 2013 msg")

  def wordcount(str: String): Int = str.split(" ").count("msg" == _)


  def main(args: Array[String]) {
    val num = file.par.map(wordcount).par.reduceLeft(_ + _)
    println("wordcount:" + num)
  }


}
