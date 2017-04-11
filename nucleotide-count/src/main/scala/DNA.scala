class DNA(dna: String) {

  val valid = List('A', 'C', 'T', 'G')

  def count(char: Char): Either[String, Int] = {

    def countHelper(index: Int, sum: Int): Either[String, Int] = {
      if (index >= dna.length()) Right(sum)
      else if (!valid.contains(dna.charAt(index))) Left("invalid nucleotide \'%s\'".format(dna.charAt(index)))
      else if (dna.charAt(index) == char) countHelper(index + 1, sum + 1)
      else countHelper(index + 1, sum)
    }

    if (!valid.contains(char)) Left("invalid nucleotide \'%s\'".format(char))
    else countHelper(0, 0)
  }

  def nucleotideCounts: Either[String, Map[Char, Int]] = {
    val result = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)

    def nucleotideCountsHelper(res: Map[Char, Int], index: Int): Either[String, Map[Char, Int]] = {
      if (index >= dna.length()) Right(res)
      else if (!valid.contains(dna.charAt(index))) Left("invalid nucleotide \'%s\'".format(dna.charAt(index)))
      else nucleotideCountsHelper(res + (dna.charAt(index) -> (res.apply(dna.charAt(index)) + 1)), index + 1)
    }

    nucleotideCountsHelper(result, 0)
  }
}
