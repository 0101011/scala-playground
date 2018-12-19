object ScalaTutorial {
	def main(args: Array[String]){
		var i = 0

		while(i <=10){
			println(i)
			i += 1
		}
	}
}

// 1. curly brackets are optional. For those hardcore java folks out there brackets are a must
// 2. to compile type:
// scalac ScalaTutorial.scala
// or
// scala ScalaTutorial.scala
// it's all the same