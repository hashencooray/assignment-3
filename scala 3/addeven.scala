object addeven{
  Addition(12)

  def Addition(num: Int): Unit = {
    num match {
      case num if num <= 0 => println("error")
      case num => println(evenSeq(num - 1))
    }
  }

  def evenSeq(num: Int): Int = {
    num match {
      case 0 => return 0
      case num if evenAndOdd(num) => return num + evenSeq(num - 2)
      case _ => return evenSeq(num - 1)
    }
  }

  def evenAndOdd(num: Int): Boolean = {
    num match {
      case 0 => return true
      case 1 => return false
      case _ => evenAndOdd(num % 2)
    }
  }
}
