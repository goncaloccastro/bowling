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
    val pins1 = round.throwBall(5, Nil) shouldBe List(5)
    val pins2 = round.throwBall(5, List(5)) shouldBe List(5,5)
  }

  it should "show if the round is over" in {
    val round = Round()
    val pins1 = round.throwBall(5, Nil)
    val pins2 = round.throwBall(5, pins1)
    round.isRoundOver(pins2) shouldBe true
  }

  it should "show if the player can throw another ball" in {
    val round = Round()
    val pins1 = round.throwBall(5, Nil)
    val pins2 = round.throwBall(5, pins1)
    round.canThrow(pins2) shouldBe false
  }

}
