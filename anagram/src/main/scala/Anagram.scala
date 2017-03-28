/**
  * Created by zyan on 3/22/17.
  */

class Anagram(str: String) {

  def matches(strs: Seq[String]): Seq[String] = {
    val strArray = str.toLowerCase().toCharArray().sorted

    def matchesHelper(index: Int, res: Seq[String]): Seq[String] = {
      if (index >= strs.length) res
      else {
        if (strs(index).toLowerCase().toCharArray().sorted.sameElements(strArray) && strs(index).toLowerCase() != str.toLowerCase()) matchesHelper(index + 1, res:+strs(index))
        else matchesHelper(index + 1, res)
      }
    }

    matchesHelper(0, Seq())
  }
}