package com.piaoyu.scala.learn.base

/**
 * Define Learn
 * Created by piaoyu on 14-10-17.
 */
object DefineClass {

  class Person(val firstName:String,val lastName:String){
    private var _age = 0
    def age = _age
    def age_= (newAge:Int) = _age = newAge
    def fullName() = firstName + " " + lastName

    override def toString() = fullName()

  }

  def main(args: Array[String]) {
    val obama:Person = new Person("Barack","Obama")
    println("Person:" + obama)
    println("firstName:" + obama.firstName)
    println("lastName:" + obama.lastName)
    println(obama.fullName())
    obama.age_=(51)
    println(obama.age)
  }

}
