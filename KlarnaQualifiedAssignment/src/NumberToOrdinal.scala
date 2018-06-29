

object NumberToOrdinal extends App {

 def fromNumber(i: Int): String = {
    val ordinalNum = i.toString match {
      case "0" => "0"
      case a if(a.endsWith("1") && (!a.endsWith("11"))) => a+"st"
      case b if(b.endsWith("2") && (!b.endsWith("12"))) => b+"nd"
      case c if(c.endsWith("3") && (!c.endsWith("13"))) => c+"rd"
      case _ => i+"th"
    }
  ordinalNum.toString
  }
}