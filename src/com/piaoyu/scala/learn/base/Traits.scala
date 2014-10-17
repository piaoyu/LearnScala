package com.piaoyu.scala.learn.base

import java.util

/**
 * Created by piaoyu on 14-10-17.
 */
object Traits {

  trait ForEachAble[A]{
    def iterator:java.util.Iterator[A]
    def foreach(f:A=>Unit) = {
      val iter = iterator
      while(iter.hasNext)
        f(iter.next)
    }
  }

  trait JsonAble{
    def toJson() = scala.util.parsing.json.JSONFormat.defaultFormatter(this)
  }

  def main(args: Array[String]) {
    val list = new util.ArrayList[Int]() with ForEachAble[Int] with JsonAble
    list.add(1)
    list.add(2)
    println("For Each");list.foreach(x=>println(x))
    println(list.toJson())
  }

}
