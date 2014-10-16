package com.piaoyu.scala.learn.practice

import org.apache.commons.beanutils.BeanUtils

import scala.beans.BeanProperty

/**
 * Learn UsingJava
 * Created by piaoyu on 14-10-16.
 */
object UsingJava {

  class SimpleBean(@BeanProperty var name: String ){

  }

  def main(args: Array[String]) {
    val bean = new SimpleBean("foo")
    bean.setName("hello")
    println(bean.getName())
    println(BeanUtils.describe(bean))
  }

}
