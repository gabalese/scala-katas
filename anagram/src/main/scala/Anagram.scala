class Anagram(word: String) {
  def matches(listOfWords: Seq[String]): Seq[String] = {
    listOfWords.filter(isAnagramOf).filterNot(_.toLowerCase == word.toLowerCase)
  }

  def isAnagramOf(potentialAnagram: String): Boolean = {
    word.toLowerCase.sorted == potentialAnagram.toLowerCase.sorted
  }
}
