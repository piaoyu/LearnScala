package com.piaoyu.scala.learn.base

/**
 * Generics Type Learn
 * Created by piaoyu on 14-10-17.
 */
object Generics {
  def withClose[A<:{def close():Unit},B](closeAble:A)(f:A=>B):B={
    try{
      f(closeAble)
    }finally{
      closeAble.close()
    }
  }

  class Connection {
    def close() = println("close")
  }

  def main(args: Array[String]) {
    val conn = new Connection
    val msg = withClose(conn){
      conn =>{
        println("do Somthing with Connection")
        123456
      }
    }
  }

}
