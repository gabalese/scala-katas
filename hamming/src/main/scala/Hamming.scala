object Hamming {
  def compute(firstStrand: String, secondStrand: String): Int = {
    (firstStrand zip secondStrand)
      .map { case (x, y) => x != y }
      .foldLeft(0) { case (int, bool) => int + (if (bool) 1 else 0) }
  }
}
