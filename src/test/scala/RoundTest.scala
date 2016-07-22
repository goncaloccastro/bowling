import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by davidnavalho on 22/07/2016.
  */
class RoundTest extends FlatSpec with Matchers{

  "Round" should "be instantiated" in {
    Round() shouldBe a [Round]
  }

  it should "receive the dropped pins" in {
    val round = Round()
    round.throw(5)
  }
}
