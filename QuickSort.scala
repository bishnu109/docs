import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object quickSort {
	def main(args: Array[String]) = {
		print("Enter size of array: ")
		val n = StdIn.readInt
		val arr = ArrayBuffer[Int]()

		println("\nEnter " + n + " integers: ")
		for (i <- 0 until n) {
			arr += StdIn.readInt
		}

		println("\nBefore sorting: " + arr.toString)
		println("After sorting: " + quickSort(arr).toString)
	}

	def quickSort(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
		if (arr.length < 2)	arr
		else {
			val pivot = arr(arr.length / 2)
			val sortedArray = ArrayBuffer[Int]()

			sortedArray ++= quickSort(arr.filter(_ < pivot))
			sortedArray ++= arr.filter(_ == pivot)
			sortedArray ++= quickSort(arr.filter(_ > pivot))
			sortedArray
		}
	}
}