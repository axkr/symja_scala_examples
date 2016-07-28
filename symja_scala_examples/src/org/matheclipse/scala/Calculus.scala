package org.matheclipse.scala

import org.matheclipse.core.basic.Config
import org.matheclipse.core.eval.ExprEvaluator
import org.matheclipse.core.expression.F._
import org.matheclipse.parser.client.math.MathException

object Calculus {

  def main(args: Array[String]) {
    //    Config.PARSER_USE_LOWERCASE_SYMBOLS = true;
    try {
      val util = new ExprEvaluator(false, 100);
      var scalaForm = util.toScalaForm("D(sin(x)*cos(x),x)");
      println(scalaForm);
      var result = util.evaluate(D(Sin(x) * Cos(x), x));
      println(result);

      scalaForm = util.toScalaForm("Integrate(sin(x)^5,x)");
      println(scalaForm);
      result = util.evaluate(Integrate(Power(Sin(x), 5), x));
      println(result);
      
      result = util.evaluate(NIntegrate(Cos(x), List(x, C0, Pi)));
      println(result);
    } catch {
      case e: Exception => println("exception caught: " + e);
    }
  }
}