class Phrase(value: String) {

  def wordCount: Map[String, Int] = {
    val wordsMap = words map (_ -> 1)
    wordsMap.foldLeft(Map.empty[String, Int]) {
      case (acc, (key, _)) => acc + (key -> (acc.getOrElse(key, 0) + 1))
    }
  }

  def words: Seq[String] = {
    value.toLowerCase.split("[^a-zA-Z0-9']+")
  }
}
