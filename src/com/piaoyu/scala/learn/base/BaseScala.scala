package com.piaoyu.scala.learn.base

import java.io.File
import java.util.Scanner

/**
 * http://zh.scala-tour.com/#/basics-contents
 * Created by piaoyu on 14-10-13.
 */
object BaseScala {

  val helloworld = "hello" + "world";

  def square(a:Int) = a*a

  def squareWithBlock(a:Int):Int = {
    a*a
  }

  val squareValue = (a:Int)=> a*a;
  def addOne(f:Int=> Int,arg:Int) = f(arg) + 1


  def main(args: Array[String]) {
    println(helloworld)
    println(square(2))
    println(squareWithBlock(2))
    println(addOne(squareValue,2))
  }

}
