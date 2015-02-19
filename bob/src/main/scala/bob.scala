class Bob {
  def hey(message: String): String = {
    Phrase(message) match {
      case sentence if sentence.isShouting => "Whoa, chill out!"
      case sentence if sentence.isQuestion => "Sure."
      case sentence if sentence.isSilence => "Fine. Be that way!"
      case _ => "Whatever."
    }
  }
}

case class Phrase(phrase: String) {
  def isShouting: Boolean = {
    phrase.filter(_.isLetter) match {
      case x if x.isEmpty => false
      case x: String => x.forall(_.isUpper)
    }
  }

  def isQuestion: Boolean = {
    phrase.endsWith("?")
  }

  def isSilence: Boolean = {
    phrase.trim.isEmpty
  }
}
