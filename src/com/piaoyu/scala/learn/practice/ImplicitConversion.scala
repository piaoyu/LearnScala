package com.piaoyu.scala.learn.practice

import java.text.SimpleDateFormat

/**
 * ImplicitConversion Learn
 * Created by piaoyu on 14-10-24.
 */
object ImplicitConversion {

  implicit def strToDate(str:String) = new SimpleDateFormat("yyyy-MM-dd").parse(str)


  val time = new SimpleDateFormat("yyyy-MM-dd");

  def main(args: Array[String]) {
    println("2013-01-01 unix time: " + time.parse("2013-01-01").getTime);
    println("2013-01-01 unix time: " + "2013-01-01".getTime)
  }

}
