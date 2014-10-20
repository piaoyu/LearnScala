package com.piaoyu.scala.learn.funtional

/**
 * LazyInit Learn
 *
 * Created by piaoyu on 14-10-20.
 */
object LazyInit {

  class ScalaCurrentVersion(val url:String){
    lazy val source = {
      println("fething form url")
      scala.io.Source.fromURL(url).getLines().toList
    }

    lazy val mojorVersion = source.find(_.contains("version.major"))

    lazy val minorVersion = source.find(_.contains("version.minor"))

  }

  def main(args: Array[String]) {
    val version = new ScalaCurrentVersion("https://github.com/scala/scala/blob/2.11.x/build.number")
    println("get version from " + version.url)
    version.minorVersion.foreach(println(_))
    version.mojorVersion.foreach(println(_))
  }
}
