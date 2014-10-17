package com.piaoyu.scala.learn.base

/**
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

  }


}
