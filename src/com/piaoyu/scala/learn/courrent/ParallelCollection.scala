package com.piaoyu.scala.learn.courrent

/**
 * Created by piaoyu on 14-10-23.
 */
object ParallelCollection {

  val urls = List("http://scala-lang.org",
    "https://github.com/yankay/scala-tour");

  def fromURL(url:String) = scala.io.Source.fromURL(url)
    .getLines().mkString("\n")

  def main(args: Array[String]) {
    val t = System.currentTimeMillis()
    urls.par.map(fromURL(_))
    println("time: " + (System.currentTimeMillis - t) + "ms")
  }

}
