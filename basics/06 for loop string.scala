object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		val randLetters = "ASBAJHFKJAHSDAKJSDKASDH"

		for(i <- 0 until randLetters.length)
			println(randLetters(i))
	}
}

// note we're not using curly brackets here