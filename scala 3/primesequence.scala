object primesequence{
  primeSeq(10)

  def primeSeq(number: Int): Unit = {

    number match {
      case x if x <= 1 => return
      case x if prime(x) => println(x); primeSeq(number - 1)
      case _ => primeSeq(number - 1)
    }
  }

  def prime(number: Int, n: Int = 2): Boolean = {

    n match {
      case x if number == n => return true
      case x if gcd(number, n) > 1 => return false;
      case _ => prime(number, n + 1)
    }
  }

  def gcd(a: Int, b: Int): Int = {

    b match {
      case 0 => return a
      case b if a % b == 0 => return b
      case _ => return gcd(b, a % b)
    }

  }
}
