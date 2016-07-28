## Scala examples for calling the Symja Java Symbolic Math library

**Note**: this repository requires **Java 8**. 

Here you can find Scala examples how to use the computer algebra functions from Symja:
* [Symja](https://bitbucket.org/axelclk/symja_android_library)  


###Examples

```
import org.matheclipse.core.basic.Config
import org.matheclipse.core.eval.ExprEvaluator
import org.matheclipse.core.expression.F._
import org.matheclipse.parser.client.math.MathException
...


...

val util = new ExprEvaluator(false, 100);

// solve 2 equations: Solve({x^2+11==y, x+y==-9}, {x,y})
val result = util.evaluate(Solve(List(Equal(Sqr(x) + ZZ(11L), y), Equal(x + y, CN9)), List(x,y)));
println(result);


// solve D(sin(x)*cos(x),x)
result = util.evaluate(D(Sin(x) * Cos(x), x));
println(result);


// Integrate(sin(x)^5,x)
result = util.evaluate(Integrate(Power(Sin(x), 5), x));
println(result);


// NIntegrte(Cos)x,{x, 0, Pi})
result = util.evaluate(NIntegrate(Cos(x), List(x, C0, Pi)));
println(result);

```

###Contact

If you have any questions about using or developing for this project, shoot me an [email][1]!

###License

* the Symja source code is published under the LESSER GNU GENERAL PUBLIC LICENSE Version 3 

[1]: mailto:axelclk@gmail.com 
