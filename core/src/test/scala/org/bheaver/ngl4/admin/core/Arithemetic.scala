package org.bheaver.ngl4.admin.core

class Arithemetic {

  def add(a:Int,b:Int): Unit ={
    var sum=a+b
    println(sum)
  }
  def sub(a:Int,b:Int): Unit ={
    var sub=a-b
    println(sub)
  }
  def mul(a:Int,b:Int): Unit ={
    var sum=a*b
    println(sum)
  }
  def div(a:Int,b:Int): Unit ={
    var sum=a+b
    println(sum)
  }
}
object  MainObject{
  def main (args: Array[String] ): Unit = {
    var a = new Arithemetic()
    a.add(10,20)
    a.sub(10,20)

}

}
