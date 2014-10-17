package com.piaoyu.scala.learn.base

/**
 * Created by piaoyu on 14-10-17.
 */
object PassByName {

  val longEnable = true
  def log(msg:String) = if(longEnable) println(msg)
  val Msg = "prograss is running"

//  def log2(msg2:String=>String) = if(longEnable) println(msg2)

  def main(args: Array[String]) {
//    log2(Msg + 1/0)
    log(Msg + 1/0)
  }

}
