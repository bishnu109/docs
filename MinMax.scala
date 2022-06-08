import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

object minMax {
	def main(args: Array[String]) = {
		print("Enter size of Array: ")
		val n = StdIn.readInt

		val nums = ArrayBuffer[Int]()
		var min: Int = Int.MaxValue
		var max: Int = Int.MinValue

		println("\nEnter " + n + " numbers: ")
		for (i <- 0 until n) {
			nums += StdIn.readInt
			min = if (min > nums.last) nums.last else min
			max = if (max < nums.last) nums.last else max
		}

		println()
		println("Min: " + min)
		println("Max: " + max)
	}
}