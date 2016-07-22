import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by davidnavalho on 22/07/2016.
  */
class RoundTest extends FlatSpec with Matchers{

  val round = Round()

  "Round" should "be instantiated" in {
    Round() shouldBe a [Round]
  }

  it should "receive the dropped pins" in {
    round.throwBall(5)
  }

  it should "show if the round is over" in {
    round.isRoundOver()
  }

  it should "show if the player can throw another ball" in {
    round.canThrow()
  }

}
