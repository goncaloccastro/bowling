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
    round.throwBall(5)
  }

  it should "show if the round is over" in {
    val round = Round()
    round.throwBall(4)
    round.throwBall(6)
    round.isRoundOver() shouldBe true
  }

  it should "show if the player can throw another ball" in {
    val round = Round()
    round.throwBall(4)
    round.throwBall(6)
    round.canThrow() shouldBe false
  }

}
