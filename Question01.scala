object Question01 extends App {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
    val g = gcd(n.abs, d.abs)
    val numer: Int = n/g
    val denom: Int = d/g

    def gcd(a: Int, b: Int): Int = {
      if (b == 0)
        a
      else
        gcd(b, a % b)
    }

    def neg(): String = {
      val negnum = new Rational(-numer, denom)
      ((negnum.numer).toString+"/"+(negnum.denom).toString)
    }
  }

    print("Enter Numerator: ")
    val a: Int = scala.io.StdIn.readInt()
    print("Enter Denominator: ")
    val b: Int = scala.io.StdIn.readInt()

    val num = new Rational(a, b)
    println(s"Negation of x: ${num.neg}")
}