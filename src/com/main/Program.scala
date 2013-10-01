package com.main

import scala.collection.immutable.Map
import scala.collection.mutable.LinkedList

object Program extends App {
  
  override def main(args : Array[String]) : Unit = {
		var folders = new LinkedList[FolderInfo]()
		folders = folders :+ (new FolderInfo("a", 1, 0))
		folders = folders :+ (new FolderInfo("b", 2, 0))
		folders = folders :+ (new FolderInfo("c", 3, 0))
		folders = folders :+ (new FolderInfo("d", 4, 0))
		folders = folders :+ (new FolderInfo("e", 5, 0))
		folders = folders :+ (new FolderInfo("f", 6, 0))
		folders = folders :+ (new FolderInfo("g", 7, 0))
		folders = folders :+ (new FolderInfo("a2", 11, 1))
		folders = folders :+ (new FolderInfo("a3", 12, 1))
		folders = folders :+ (new FolderInfo("b2", 13, 2))
		folders = folders :+ (new FolderInfo("b4", 14, 2))
		folders = folders :+ (new FolderInfo("b3", 15, 2))
		folders = folders :+ (new FolderInfo("e5", 16, 5))
		folders = folders :+ (new FolderInfo("e6", 17, 5))
		folders = folders :+ (new FolderInfo("e1", 18, 5))
		folders = folders :+ (new FolderInfo("f2", 19, 6))
		folders = folders :+ (new FolderInfo("a23", 111, 11))
		folders = folders :+ (new FolderInfo("a34", 122, 11))
		folders = folders :+ (new FolderInfo("b23", 113, 13))
		folders = folders :+ (new FolderInfo("b41", 114, 13))
		folders = folders :+ (new FolderInfo("b32", 115, 14))
		folders = folders :+ (new FolderInfo("e51", 116, 16))
		folders = folders :+ (new FolderInfo("e60", 117, 13))
		folders = folders :+ (new FolderInfo("e19", 118, 11))
		folders = folders :+ (new FolderInfo("f22", 119, 12))
		
		println(folders.size)
		val manager = new FolderManager(folders)
		manager.print
    
		println("End")
    
    
		  //Duck typing
//		  def quackTheDuck( quackable: {def quack:String }) = {  
//			  println(s"What does a duck say? " + quackable.quack)
//		  }  
//		  class RealDuck { def quack = "Quack!" }    
//		  class ImposterDuck { def quack = "Qwaack!" }
//		  quackTheDuck(new RealDuck)    
//		  quackTheDuck(new ImposterDuck)
//		  
//		  //Define implicit class, like extension method in C#
//		  implicit class SuperInt(val i:String) {      
//			  def double = i * 2     
//			  def sqrt = math.sqrt(i.toInt)    
//		  }
//		  
//		  println("7".double, "49".sqrt)
//		  
//		  val map = Map(1 -> "One", 2 -> "Two")
//		  println(map)
//		  
//		  val tuple = Tuple2(2, 3)
//		  
//		  //extract value from scala
//		  val (a, b) = tuple
//		  
//		  println(s"${a} ${b}")
//		  
//		  println(s"hello")
//		  
//		  val lst = LinkedList(1)
//		  println(lst.next)
//		  
//		  // Make a list via the companion object factory
//		  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
//
//		  // Make a list element-by-element
//		  val when = "AM" :: "PM" :: List()
//
//		  // Pattern match
//		  days match {
//		  	case firstDay :: otherDays =>
//		  		println("The first day of the week is: " + firstDay)
//		  	case List() =>
//		  		println("There don't seem to be any week days.")
//		  }
  	}
}