/**
  * Created by zyan on 4/10/17.
  */

class PhoneNumber(num: String) {

  def number: Option[String] = {
    val result = num.filter(_.isDigit).toString()
    if (result.length() == 11 && result.head == '1') Some(result.drop(1))
    else if (result.length() != 10) None
    else Some(result)
  }

  def areaCode: Option[String] = {
    val numSeq = number
    numSeq match {
      case None => None
      case Some(s) => Some(s.take(3))
    }
  }

  def prettyPrint: Option[String] = {
    val numSeq = number
    numSeq match {
      case None => None
      case Some(s) => Some("(%s) %s-%s".format(s.take(3), s.drop(3).dropRight(4), s.takeRight(4)))
    }
  }
}