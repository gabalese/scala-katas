class DNA(sequence: String) {
  require(sequence.forall("ACGT".contains(_)))

  def count(nucleotide: Char): Int = {
    require("ACGT".contains(nucleotide))
    sequence.filter(_ == nucleotide).length
  }

  def nucleotideCounts: Map[Char, Int] = {
    val startMap = Map('A' -> 0, 'T' -> 0, 'C' -> 0, 'G' -> 0)
    sequence.foldLeft(startMap){
      case (acc, key) => acc + (key -> (acc.getOrElse(key, 0) + 1))
    }
  }

}
