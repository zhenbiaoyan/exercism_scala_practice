/**
  * Created by zyan on 3/21/17.
  */

class Phrase(val phrase: String){
  def wordCount(): Map[String, Int] = {
    val words = phrase.split("[^0-9a-zA-Z']+")
    val counts = words.map(word => word -> 1).groupBy(_._1.toLowerCase).map({case (k, v) => (k, v.length)})
    counts
  }
}