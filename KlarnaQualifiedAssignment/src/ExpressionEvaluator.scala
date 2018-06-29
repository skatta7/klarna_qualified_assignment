
object ExpressionEvaluator extends App {

def calculate(nums:List[String]):Double = {
    val first = nums.head.toDouble
    val second = nums.tail.head.toDouble
    nums.last match {
           case "+" => first + second
           case "-" => first - second
           case "*" => first * second
           case "/" => first / second
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