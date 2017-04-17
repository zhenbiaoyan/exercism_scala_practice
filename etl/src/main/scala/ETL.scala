/**
  * Created by zyan on 4/13/17.
  */

object ETL {
  def transform(old: Map[Int, Seq[String]]): Map[String, Int] = {
    old.flatMap{ case (k, v) => v.map(_.toLowerCase() -> k).toMap}
  }
}