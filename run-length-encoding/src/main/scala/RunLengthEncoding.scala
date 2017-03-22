object RunLengthEncoding {

  def encode(str: String): String = {

    def encodeHelper(index: Int, count: Int, c: Char, res: String): String = {
      if (index >= str.length()) res + (if (count > 1) count else "") + c
      else {
        if (str.charAt(index) == c) encodeHelper(index + 1, count + 1, c, res)
        else encodeHelper(index + 1, 1, str.charAt(index), res + (if (count > 1) count else "") + c)
      }
    }

    if (str == "") str
    else encodeHelper(1, 1, str.charAt(0), "")
  }

  def decode(str: String): String = {
    val pattern = "[^0-9]".r
    val iter = pattern.findAllIn(str)

    def decodeHelper(start: Int, end: Int, res: StringBuilder): String = {
      if (start == end) res.append(str.charAt(end))
      else {
        res.append((for (i <- 1 to str.substring(start, end).toInt) yield str.charAt(end)).mkString(""))
      }
      if (end >= str.length() - 1) res.toString()
      else decodeHelper(end + 1, str.indexOf(iter.next(), end + 1), res)
    }

    if (str == "") str
    else decodeHelper(0, str.indexOf(iter.next()), new StringBuilder())
  }
}
