package com.piaoyu.scala.learn.courrent

import akka.actor.ActorSystem
import akka.actor.ActorDSL._

/**
 * SimplityActor Learn
 * Created by piaoyu on 14-10-21.
 */
object SimplifyActor {


  implicit val system = ActorSystem()

  val echoServer = actor(new Act{
    become {
      case msg => println("Echo " + msg)
    }
  })

  def main(args: Array[String]) {
    echoServer ! "Hi Actor"
    system.shutdown()
  }


}
