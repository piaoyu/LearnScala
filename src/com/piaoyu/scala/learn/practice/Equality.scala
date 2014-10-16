package com.piaoyu.scala.learn.practice

/**
 * Learn Equality
 * Created by piaoyu on 14-10-16.
 */
object Equality {

//  class Person(val name:String){
//    override  def equals(other:Any)= other match{
//      case that:Person =>name.equals(that.name)
//      case _=> false
//    }
//  }

  case class Person(val name:String){

  }

  def main(args: Array[String]) {
    println(new Person("Black") == new Person("Black"))
  }

}
