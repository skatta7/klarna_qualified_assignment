import scala.util.Try


object ExpressionEvaluator extends App {

def calculate(nums:List[String]):Double = {
    nums.last match {
           case "+" => nums(0).toDouble + nums(1).toDouble
           case "-" => nums(0).toDouble - nums(1).toDouble
           case "*" => nums(0).toDouble * nums(1).toDouble
           case "/" => nums(0).toDouble / nums(1).toDouble
         }
}
def evaluate(expr: String, acc:Double = 0): Double = {
     regEx.findFirstMatchIn(expr) match {
       case None => acc
       case Some(i) => {
         val r = calculate(i.toString.split(" ").toList)
         evaluate(expr.replace(i.toString, r.toString),r)
      }
    }
}
}