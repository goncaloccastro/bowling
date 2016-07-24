import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by davidnavalho on 22/07/2016.
  */
class RoundsTest extends FlatSpec with Matchers{

  "Rounds" should "be instantiated" in {
    Rounds() shouldBe a [Rounds]
  }

/*  it should "have a list of rounds" in {
    val rounds = Rounds(List[Round])
  }*/
}
