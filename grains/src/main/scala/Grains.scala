/**
  * Created by zyan on 4/13/17.
  */

object Grains {
  private val range = 0 to 63
  private val grainMap: Map[Int, BigInt] = range.map(elem => elem + 1 -> BigInt(2).pow(elem)).toMap

  def square(num: Int): Option[BigInt] = {
    if (num <= 0) None
    else grainMap.get(num)
  }

  val total: BigInt = grainMap.values.sum
}

