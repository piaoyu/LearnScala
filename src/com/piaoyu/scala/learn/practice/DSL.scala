package com.piaoyu.scala.learn.practice

import java.util.Date

/**
 * Created by piaoyu on 14-10-24.
 */
object DSL {

  case class Twitter(id:Long,text:String,publishedAt:Option[java.util.Date])

  val twitter = Twitter(1,"Hello Scala",Some(new Date()))



}
