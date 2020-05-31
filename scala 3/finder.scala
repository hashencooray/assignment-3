object finder{
  check(5)
  
  def check(num: Int): Unit = {
    num match {
      case 0 => println("zero is not even or odd")
      case num if find(num) => println("even")
      case _ => println("odd")
    }
  }

  def find(num: Int): Boolean = {
    num match {
      case 0 => return true
      case 1 => return false
      case _ => find(num % 2)
    }
  }
}
