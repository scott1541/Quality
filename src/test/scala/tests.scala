import org.scalatest.{BeforeAndAfter, FunSuite}

class SmallNumberTest extends FunSuite with BeforeAndAfter {

before {
  Main.outlineL = ""
  Main.outlineS = ""
  Main.output(1325)
}

  test("Long Output") {
    println(Main.outlineL)
    assert(Main.outlineL == "1 thousand 3 hundred twenty five")
  }
  test("Short Output") {
    println(Main.outlineS)
    assert(Main.outlineS == "1 thousand 3 hundred twenty five")
  }

}

class MediumNumberTest extends FunSuite with BeforeAndAfter {

  before {
    Main.outlineL = ""
    Main.outlineS = ""
    Main.output(75262734035L)
  }

  test("Long Output") {
    println(Main.outlineL)
    assert(Main.outlineL == "75 milliard 262 million 734 thousand thirty five")
  }
  test("Short Output") {
    println(Main.outlineS)
    assert(Main.outlineS == "75 billion 262 million 734 thousand thirty five")

  }
}

class LongNumberTest extends FunSuite with BeforeAndAfter {

  before {
    Main.outlineL = ""
    Main.outlineS = ""
    Main.output(11262373450325L)
  }

  test("Long Output") {
    println(Main.outlineL)
    assert(Main.outlineL == "11 billion 262 milliard 373 million 450 thousand 3 hundred twenty five")
  }
  test("Short Output") {
    println(Main.outlineS)
    assert(Main.outlineS == "11 trillion 262 billion 373 million 450 thousand 3 hundred twenty five")

  }
}


