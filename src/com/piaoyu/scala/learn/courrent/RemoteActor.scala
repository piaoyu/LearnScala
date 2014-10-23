package com.piaoyu.scala.learn.courrent

import akka.actor.{Props, Actor}

/**
 * Remote Actor Learn
 * Created by piaoyu on 14-10-23.
 */
object RemoteActor {

  class EchoServer extends Actor {
    def receive = {
      case msg: String => println("echo " + msg)
    }
  }

  def main(args: Array[String]) {
    implicit val system = akka.actor.ActorSystem("remote")
    val server = system.actorOf(Props[EchoServer], name = "echoServer")
    System.out.println(server)
    val echoClient = system
      .actorFor("akka://remote/user/echoServer")
    echoClient ! "Hi Remote"

    system.shutdown
  }


}
