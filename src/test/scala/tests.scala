import org.scalatest.{BeforeAndAfter, FunSuite}

class SmallNumberTest extends FunSuite with BeforeAndAfter {


  test("Long Output") {

    assert(Main.output(1325) == "one thousand three hundred twenty five")
  }
  test("Short Output") {

    assert(Main.output(1325)  == "one thousand three hundred twenty five")
  }

}

class MediumNumberTest extends FunSuite with BeforeAndAfter {

  test("Long Output") {
    assert(Main.output(75262734035L) == "seventy five milliard two hundred sixty two million seven hundred thirty four thousand thirty five")
  }
  test("Short Output") {
    val shortScalee = Main.output(75262734035L).replaceAll("billion", "trillion").replaceAll("milliard", "billion")
    assert(shortScalee == "seventy five billion two hundred sixty two million seven hundred thirty four thousand thirty five")
  }
}

class LongNumberTest extends FunSuite with BeforeAndAfter {



  test("Long Output") {
    assert(Main.output(11262373450325L) == "eleven billion two hundred sixty two milliard three hundred seventy three million four hundred fifty thousand three hundred twenty five")
  }
  test("Short Output") {
    assert(Main.output(11262373450325L) == "eleven trillion two hundred sixty two billion three hundred seventy three million four hundred fifty thousand three hundred twenty five")
  }
}


