package com.piaoyu.scala.learn.funtional

/**
 * Created by piaoyu on 14-10-15.
 */
object WordCount {

  val list = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordCount(str:String):Int = str.split(" ").count("msg"==_)


  def main(args: Array[String]) {
    val num = list.map(wordCount(_)).reduceLeft(_+_)
    print(num)
  }

}
