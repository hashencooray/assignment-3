object fibbonachchi{
  fibo(10)

  def fibo(num: Int): Unit = {
    num > 0 match {
      case true => print(" " + fib(num)); fibo(num - 1)
      case false => print(" " + 0)
    }
  }

  def fib(num: Int): Int = {

    num match {

      case num if num == 1 => return 1;
      case num if num == 0 => return 0;
      case _ => return fib(num - 1) + fib(num - 2);

    }

    return num;
  }

}
