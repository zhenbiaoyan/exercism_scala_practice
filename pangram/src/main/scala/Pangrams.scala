import scala.collection.immutable.HashSet

/**
  * Created by zyan on 3/21/17.
  */

object Pangrams {
  def isPangram(str: String): Boolean = {
    val hs = HashSet() ++ str.toLowerCase().split("[^a-z]+").flatMap(_.toCharArray)
    println(hs.mkString(" "))
    hs.size == 26
  }
}