package eulerProject

/*
  Problem 1: Multiples of 3 or 5
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.

  1) Find natural numbers which are multiples of 3 or 5 below 1000
  2) Calculate the sum of natural numbers from step 1

 */
object Problem1 extends App {

  def findMultiples(numbers: Int): IndexedSeq[Int] = {
    for {
      number <- 1 until numbers if (number % 3 == 0 || number % 5 == 0)
    } yield number
  }

  def sumOfMultiples(numbers: IndexedSeq[Int]): Int = {
    numbers.sum
    //Alternate way to calculate sum
    //numbers.fold(0){(sum, number) =>
    // sum + number
    //}
  }

  println("Sum of natural numbers multiples of 3 or 5 below 10 = "+ sumOfMultiples(findMultiples(10)))
  println("Sum of natural numbers multiples of 3 or 5 below 1000 = "+ sumOfMultiples(findMultiples(1000)))

}
