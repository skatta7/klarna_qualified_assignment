

object MaskCreditCard extends App {

  def mask(creditCardNumber: String): String = {
    if (creditCardNumber.length < 6) {
      creditCardNumber
    } else {
      val firstChar = creditCardNumber.take(1)
      val last4Chars = creditCardNumber.takeRight(4)
      val middleStr = creditCardNumber.splitAt(1)._2.reverse.splitAt(4)._2.reverse
      val maskedStr = middleStr.map(c => if (c.isLetter) c else "#").mkString

      s"$firstChar$maskedStr$last4Chars"
    }
  }
}