package com.piaoyu.scala.learn.base

/**
 * DuckType Learning
 * Created by piaoyu on 14-10-17.
 */
object DuckType {

  class Connection{
    def close() = println("close connection")
  }

  def withClose(closeAble:{def close():Unit},op:{def close():Unit} => Unit) = {
    try{
      op(closeAble)
    }finally{
      closeAble.close();
    }
  }

  def main(args: Array[String]) {
    val conn:Connection = new Connection()
    withClose(conn,conn=>println("do something with Connection"))
  }

}
