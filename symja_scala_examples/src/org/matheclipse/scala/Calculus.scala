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
      val scalaForm = util.toScalaForm("D(sin(x)*cos(x),x)");
      println(scalaForm);
      val result = util.evaluate(D(Sin(x) * Cos(x), x));
      println(result);

      val scalaForm2 = util.toScalaForm("Integrate(sin(x)^5,x)");
      println(scalaForm2);
      val result2 = util.evaluate(Integrate(Power(Sin(x), 5), x));
      println(result2);

    } catch {
      case e: Exception => println("exception caught: " + e);
    }
  }
}