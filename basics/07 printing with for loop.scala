object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		val aList = List(1,2,3,4,5)
		for(i <- aList){
			println("List items " + i)
		}
	}
}