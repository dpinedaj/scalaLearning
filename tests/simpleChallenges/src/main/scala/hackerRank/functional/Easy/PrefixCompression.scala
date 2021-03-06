package hackerRank.functional.Easy

object PrefixCompression {
  def Run(x: String, y: String) {
    val common = (x zip y).takeWhile(c => c._1 == c._2).map(_._1).mkString("")
    val x1 = x.toSeq.diff(common).unwrap; val y1 = y.toSeq.diff(common).unwrap
    println(s"${common.length} $common\n${x1.length} $x1\n${y1.length} $y1")
  }
}
