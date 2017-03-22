/**
  * Created by zyan on 3/20/17.
  */

class Bob {
  def hey(sentence: String):String = {
    val pattern = "[a-zA-Z]".r
    if (sentence.trim() == "") "Fine. Be that way!"
    else if (pattern.findFirstIn(sentence) != None && sentence == sentence.toUpperCase()) "Whoa, chill out!"
    else if (sentence.endsWith("?")) "Sure."
    else "Whatever."
  }
}