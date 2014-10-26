package com.piaoyu.scala.learn.practice

import scala.util.matching.Regex

/**
 * Extractor Learn
 * Created by piaoyu on 14-10-24.
 */
object Extractor {

  object Email{
    def unapply(str:String)= new Regex("""(.*)@(.*) """).unapplySeq(str).get match{
      case user::domain::Nil => Some(user,domain)
      case _=> None
    }
  }

  def main(args: Array[String]) {
    "user@domain.com" match{
      case Email(user,domain) => println(user + "@" + domain)
    }
  }

}
