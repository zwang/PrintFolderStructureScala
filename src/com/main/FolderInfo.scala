package com.main



class FolderInfo(name: String, i: Int, pId: Int) {
	def folderName = name
	def id = i
	def parentId = pId
  var children : List[FolderInfo] = Nil
  
  def print(level:Int) {
		var n = level
		val sb = new StringBuilder()
		while (n > 0) {
			sb.append(" ")
			n = n - 1
		}
		sb.append(folderName)
		println(sb.toString())
		children =  children.sortBy(folder => folder.folderName)
		for (child <- children) {
			child.print(level + 1)
		}
	}
}