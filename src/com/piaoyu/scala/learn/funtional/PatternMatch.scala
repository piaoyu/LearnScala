package com.piaoyu.scala.learn.funtional

/**
 * PatternMatch Learn
 * Created by piaoyu on 14-10-15.
 */
object PatternMatch {

  /**
   *
   * @param in
   * @return
   */
  def fibonacci(in:Any):Int = in match {
    case 0 => 0
    case 1 => 1
    case n:Int if(n>1) =>  fibonacci(n-1) +  fibonacci(n-2)
    case _ => 0
  }

  def main(args: Array[String]) {
    println(fibonacci(3))
  }

}
