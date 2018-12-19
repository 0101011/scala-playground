object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		for (i <- 1 to 5; j <- 6 to 10){
			println("i: " + i)
			println("j: " + j)
		}
	}
}