/**
  * Created by zyan on 4/11/17.
  */

class School {
  private var database = collection.mutable.Map[Int, Seq[String]]()

  def db(): collection.mutable.Map[Int, Seq[String]] = {
    this.database
  }

  def add(name: String, grade: Int) = {
    if (database.contains(grade)) database += (grade -> (database.apply(grade) :+ name))
    else database += (grade -> Seq(name))
    db
  }

  def grade(grade: Int): Seq[String] = {
    if (database.contains(grade)) database.apply(grade)
    else Seq()
  }

  def sorted() = {
    val mapList = database.toList.sortWith(_._1 < _._1)
    val resultList = mapList.map{case (k, v) => (k, v.sortWith(_ < _))}
    resultList.toMap
  }
}