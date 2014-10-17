package com.piaoyu.scala.learn.base

/**
 * Currying Learn
 * Created by piaoyu on 14-10-17.
 */
object Currying {

  def withClose(closeAble:{def close():Unit})(op:{def close():Unit}=>Unit) ={
    try{
      op(closeAble)
    }finally{
      closeAble.close()
    }
  }

  class Connection{
    def close() = println("close")
  }

  def main(args: Array[String]) {
    val conn:Connection = new Connection()
    withClose(conn)(conn=>println("do something with Connection"))
  }


}
