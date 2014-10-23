package com.piaoyu.scala.learn.courrent

import akka.actor.ActorDSL._
import akka.pattern.ask

/**
 * Return Sync Learn Just Like IO
 * Created by piaoyu on 14-10-21.
 */
object ReturnSync {

  implicit val ec = scala.concurrent.ExecutionContext.Implicits.global

  implicit val system = akka.actor.ActorSystem()

  val versionUrl = "https://github.com/scala/scala/blob/2.11.x/build.number"

  val fromUrl = actor(
    new Act {
      become {
        case url: String => sender !  scala.io.Source.fromURL(url)
          .getLines().mkString("\n")
      }
    })

  def main(args: Array[String]) {
    val version = fromUrl.ask(versionUrl)(akka.util.Timeout(5 * 1000))
    version.foreach(println _)
    system.shutdown
  }

}
