/**
  * Created by zyan on 4/11/17.
  */

import util.Random

class Robot {

  val letter = Random.alphanumeric
  val number = Random.nextInt(10)
  var name = letter.filter(!_.isDigit).take(2).mkString("").toUpperCase() + Random.nextInt(10).toString() + Random.nextInt(10).toString() + Random.nextInt(10).toString()

  def reset() = {
    this.name = letter.filter(!_.isDigit).take(2).mkString("").toUpperCase() + Random.nextInt(10).toString() + Random.nextInt(10).toString() + Random.nextInt(10).toString()
  }
}