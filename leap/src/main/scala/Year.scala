/**
  * Created by zyan on 4/11/17.
  */

class Year(year: Int) {

  private def divisibleBy(divisor: Int)(num: Int): Boolean = num % divisor == 0
  private def divisibleBy4(num: Int): Boolean = divisibleBy(4)(num)
  private def divisibleBy100(num: Int): Boolean = divisibleBy(100)(num)
  private def divisibleBy400(num: Int): Boolean = divisibleBy(400)(num)

  def isLeap: Boolean = (divisibleBy4(year) && !divisibleBy100(year)) || divisibleBy400(year)
}

object Year {
  def apply(year: Int): Year = new Year(year)
}
