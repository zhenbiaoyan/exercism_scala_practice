object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    def sumHelper(sum: Int, num: Int): Int = {
      if (num >= limit) sum
      else if (factors.filter(num % _ == 0).isEmpty) sumHelper(sum, num + 1)
      else sumHelper(sum + num, num + 1)
    }

    sumHelper(0, 1)
  }
}

