object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		var evenList = for { i <- 1 to 20
			if (i % 2) == 0
		} yield i

		for(i <- evenList)
			println(i)
	}
}