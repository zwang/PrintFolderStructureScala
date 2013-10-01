package com.main

import scala.collection.mutable.LinkedList

class FolderManager(folders: LinkedList[FolderInfo]) {
	val map = new scala.collection.mutable.HashMap[Integer, FolderInfo]()
	val root = new FolderInfo("root", 0, -1)

  for(f <- folders){
    map.put(f.id, f)
  }

  for(f <- folders){
    if(!map.contains(f.parentId)){
      root.children = f :: root.children
    } else {
      val parent = map.get(f.parentId)
      parent match {
        case Some(pf:FolderInfo) => pf.children = f :: pf.children
        case None => println("Something is wrong")
      }
    }
  }
	
	def print {
		root.print(0);
	}
}