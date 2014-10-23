package com.piaoyu.scala.learn.courrent

import akka.pattern.ask
import akka.actor.ActorDSL._

import scala.concurrent.Future


/**
 * Return Async Learn Just Like NIO
 * Created by piaoyu on 14-10-23.
 */
object ReturnAsync {

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
    val version:Future[Any] = fromUrl.ask(versionUrl)(akka.util.Timeout(5 * 1000))
    version onComplete{
      case msg => println(msg);system.shutdown()
    }
  }

}
