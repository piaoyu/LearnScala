package com.piaoyu.scala.learn.courrent

import akka.actor.{Props, Actor, ActorSystem}


/**
 * ActorPrinciple Learn
 * Created by piaoyu on 14-10-21.
 */
object ActorPrinciple {

  implicit val system = ActorSystem()

  class EchoServer(name:String) extends Actor{
    override def receive = {
      case msg => println("server" + name + "echo" + msg + "by" + Thread.currentThread().getName)
    }
  }

  def main(args: Array[String]) {
    val echoServer = (1 to 10).map(x=> system.actorOf(Props(new EchoServer(x.toString)).withDispatcher(Thread.currentThread().getName)))

    (1 to 10).foreach(msg => echoServer(scala.util.Random.nextInt(10)) ! msg.toString)

    system.shutdown();

  }

}
