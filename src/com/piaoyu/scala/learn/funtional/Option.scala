package com.piaoyu.scala.learn.funtional

/**
 * Option Learn
 * Created by piaoyu on 14-10-20.
 */
object Option {


  def getProperty(name:String): Option[String] ={
    val value = System.getProperty(name)
    if (value != null) Some(value) else  None
  }

  def main(args: Array[String]) {
    val osName = getProperty("os.name")
    osName match {
      case Some(value) => println(value)
      case _=> println("None")
    }

    println(osName.getOrElse("None"))
    osName.foreach(print(_))
  }

}
