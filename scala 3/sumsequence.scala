object sumsequence{
sumSeq(5)

  def sumSeq(num:Int)={
    println(sum(num))
  }

  def sum(num: Int): Int = {

    num match {

      case num if num == 1 => return 1;
      case num if num <= 0 => return 0;
      case _ => return num + sum(num - 1);
    }

    return num;
  }
}
