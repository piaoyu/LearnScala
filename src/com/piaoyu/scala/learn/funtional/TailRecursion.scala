package com.piaoyu.scala.learn.funtional

/**
 * Tail Recursion Learn
 *
 * Created by piaoyu on 14-10-15.
 */
object TailRecursion {

  val list = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordCount(str:String):Int = str.split(" ").count("msg"==_)

  //TODO
//  def foldLeft(list:List[Int]) = {
//    list match {
//      case List() => init
//      case head::tail =>
//    }
//
//  }

}
