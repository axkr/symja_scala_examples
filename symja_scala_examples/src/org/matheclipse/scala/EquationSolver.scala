package org.matheclipse.scala

import org.matheclipse.core.eval.ExprEvaluator
import org.matheclipse.core.expression.F._

object Solver {

  def main(args: Array[String]) {
    try {
      // use the "low level" static methods in org.matheclipse.core.expression.F
      val result = eval(Solve(List(Equal(Sqr(x) + ZZ(11L), y), Equal(x + y, CN9)), List(x,y)));
      println(result);
      
      // generate scala input from parsed string:
      val util = new ExprEvaluator(false, 100);
      val scalaForm = util.toScalaForm("Solve({x^2+11==y, x+y==-9}, {x,y})");
      println("Scala input form: "+scalaForm);
      
      
 
    } catch {
      case e: Exception => println("exception caught: " + e);
    }
  }
}