object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		def printPrimes(){
			val primeList = List(1,2,3,5,7,11)
			for(i <- primeList){
				if(i == 11){
					return
				}

				if(i !=1){
					println(i)
				}
			}
		}
	}
}