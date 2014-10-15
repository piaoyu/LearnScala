package com.piaoyu.scala.learn.funtional

/**
 * Power Of Function Programing
 * Created by piaoyu on 14-10-15.
 */
object FunctionPower {

  val list = List(1,2,3,4)

  def containsOdd(list:List[Int]): Boolean ={
    for (i<-list){
      if(i%2 == 1){
        return true
      }
    }
    return false
  }

  def containsWithFunction(list:List[Int]):Boolean ={
    list.exists(_ % 2 == 1)
  }

  def main (args: Array[String]) {
    println(containsOdd(list))
    println(containsWithFunction(list))
  }

}
