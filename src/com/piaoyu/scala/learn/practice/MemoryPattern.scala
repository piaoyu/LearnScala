package com.piaoyu.scala.learn.practice

import scala.collection.mutable

/**
 * Memory Pattern Learn
 * Created by piaoyu on 14-10-24.
 */
object MemoryPattern {

  val cache = new mutable.WeakHashMap[Int,Int]
  def memo(f:Int=> Int) = (x:Int)=> cache.getOrElseUpdate(x,f(x))

  def fibonacci_(in :Int): Int  = in match {
    case 0 => 0
    case 1 => 1
    case n:Int => fibonacci_(n-1) + fibonacci_(n-2)
  }

  val fibonacci: Int => Int = memo(fibonacci_)

  def main(args: Array[String]) {
    val t1 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t1) + "ms")

    val t2 = System.currentTimeMillis()
    println(fibonacci(40))
    println("it takes " + (System.currentTimeMillis() - t2) + "ms")
  }



}
