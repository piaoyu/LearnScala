package com.piaoyu.scala.learn.funtional

/**
 * Powerful Loop
 * Created by piaoyu on 14-10-20.
 */
object PowerfulLoop {
  val strList = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordcount(str:String):Int = str.split(" ").count(_ == "msg")

  def main(args: Array[String]) {
    val count = for (line<- strList) yield wordcount(line)
    val num = count.reduceLeft(_+_)
    println(count)
    println(num)
  }

}
