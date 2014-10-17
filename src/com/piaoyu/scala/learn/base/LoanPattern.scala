package com.piaoyu.scala.learn.base

import java.util.Scanner

import scala.reflect.io.File


/**
 * LoanPattern  Learn
 * 借贷模式的学习
 * Created by piaoyu on 14-10-17.
 */
object LoanPattern {


  def withScanner(f:File,op:Scanner=>Unit)={
    val scanner = new Scanner(f.bufferedReader())
    try{
      op(scanner)
    }finally{
      scanner.close()
    }
  }

  def main(args: Array[String]) {
    withScanner(File("/home/piaoyu/HiveTask.py"),scanner=>println("pid is ") + scanner.next())
  }

}
