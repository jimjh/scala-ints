import collection.JavaConverters._
object IntOrInteger {
  def f(xs : List[Int]) : List[Int] = xs
  def g(xs : List[Integer]) : List[Integer] = xs
  def javaf(xs : java.util.List[ Int ]) : java.util.List[ Int ] = f(xs.asScala.toList).asJava
  def javag(xs : java.util.List[ Integer ]) : java.util.List[ Integer ] = g(xs.asScala.toList).asJava
  def h(x : Integer) : Integer = x
  def j(x: Int) : Int = x
}
