/**
  * Created by zyan on 3/21/17.
  */

object Hamming {
  def compute(dna1: String, dna2:String): Option[Int] = {
    def compute(index: Int, res: Int): Int = {
      if (index >= dna1.length()) res
      else compute(index + 1, res + (if (dna1.charAt(index) == dna2.charAt(index)) 0 else 1))
    }

    if (dna1.length() != dna2.length()) None
    else Some(compute(0, 0))
  }
}