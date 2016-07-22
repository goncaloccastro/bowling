import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by davidnavalho on 22/07/2016.
  */
class RoundTest extends FlatSpec with Matchers{

  "Round" should "be instantiated" in {
    Round() shouldBe a [Round]
    
  }
}
