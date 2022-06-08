import scala.io.Source
import scala.collection.mutable.Map

object wordCount {
	def main(args: Array[String]) = {
		val fileName = "./in.txt"
		val frequencyMap = Map[String, Int]()

		for (line <- Source.fromFile(fileName).getLines) {
			for (word <- line.split(" ")) {
				frequencyMap.put(word, frequencyMap.getOrElse(word, 0) + 1)
			}
		}

		println(frequencyMap.toString)
	}
}
