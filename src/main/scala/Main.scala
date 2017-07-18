/**
  * Created by Administrator on 18/07/2017.
  */
object Main extends App {

  println("Enter a number: ")
  val input = scala.io.StdIn.readLine()
  println(input)
  val number = input.toLong
  var outlineL = "Long Scale: "
  var outlineS = "Short Scale: "

  output(number)

  println(outlineL)
  println(outlineS)

  def output(num: Long): Any = {

    num match {
      case num if(num < 0) => outlineL += "Negative "; outlineS += "Negative "; output(-num)
      case num if(num >= 1000000000000L) => outlineL += s"${num / 1000000000000L} billion "; outlineS += s"${num / 1000000000000L} trillion "; output(num % 1000000000000L)
      case num if(num >= 1000000000) => outlineL += s"${num / 1000000000} milliard "; outlineS += s"${num / 1000000000} billion "; output(num % 1000000000)
      case num if(num >= 1000000) => outlineL += s"${num / 1000000} million "; outlineS += s"${num / 1000000} million ";output(num % 1000000);
      case num if(num >= 1000) => outlineL += s"${num / 1000} thousand ";outlineS += s"${num / 1000} thousand "; output(num % 1000);
      case num if(num >= 100) =>  outlineL += s"${num / 100} hundred "; outlineS += s"${num / 100} hundred "; output(num % 100);
      case num if(num >= 20) => (num / 10) match {
                               case 2 => outlineL += "twenty "; outlineS += "twenty "; output(num%10)
                               case 3 => outlineL += "thirty "; outlineS += "thirty "; output(num%10)
                               case 5 => outlineL += "fifty "; outlineS += "fifty "; output(num%10)
                               case n@_ => output(n); outlineL += "ty "; outlineS += "ty "; output(num%10) }
      case 0 => outlineL  += "zero"; outlineS  += "zero";
      case 1 => outlineL += "one"; outlineS += "one";
      case 2 => outlineL += "two"; outlineS += "two";
      case 3 => outlineL += "three"; outlineS += "three";
      case 4 => outlineL += "four"; outlineS += "four";
      case 5 => outlineL += "five"; outlineS += "five";
      case 6 => outlineL += "six"; outlineS += "six";
      case 7 => outlineL += "seven";outlineS += "seven";
      case 8 => outlineL += "eight";outlineS += "eight";
      case 9 => outlineL += "nine"; outlineS += "nine";
      case 10 => outlineL += "ten"; outlineS += "ten";
      case 11 => outlineL += "eleven"; outlineS += "eleven";
      case 12 => outlineL += "twelve"; outlineS += "twelve";
      case 13 => outlineL += "thirteen"; outlineS += "thirteen";
      case 15 => outlineL += "fifteen"; outlineS += "fifteen";
      case n@_ => output(n-10); outlineL += "teen"; outlineS += "teen";
    }


  }

/*
  def output(num: Int, printZero: Boolean = true): String = {
  case 0 => if (printZero) "zero" else ""
*/

}
