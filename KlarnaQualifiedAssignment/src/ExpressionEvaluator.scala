import scala.util.Try


object ExpressionEvaluator extends App {

 def evaluate(expr: String): Double = {
     val last2 = expr.split(" ").takeWhile(s => Try { s.toDouble }.isSuccess).takeRight(2)
    val  nextOpr = expr.split(" ").dropWhile(s => Try { s.toDouble }.isSuccess).take(1).mkString
    last2.size match{
    	case 0 => 0
    	case 1 =>  expr.toDouble
        case a if nextOpr.size==0 => last2(1).toDouble
    	case _ => {    		
      	val res = nextOpr match {
        	case "+" => last2(0).toDouble + last2(1).toDouble
        	case "-" => last2(0).toDouble - last2(1).toDouble
        	case "*" => last2(0).toDouble * last2(1).toDouble
        	case "/" => last2(0).toDouble / last2(1).toDouble
      	}
     		evaluate(expr.replace(s"${last2.mkString(" ")} $nextOpr", res.toString()))
    	}
    }
  }
 println(evaluate("2 3 +"))
}