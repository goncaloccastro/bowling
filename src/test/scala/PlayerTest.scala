import org.scalatest.{FeatureSpec, FlatSpec, Matchers}

/**
  * Created by rufoseverino on 22/07/2016.
  */

class PlayerTest extends FlatSpec with Matchers{
  "Player" should "be instanciated" in {
    Player("RR", 2) shouldBe a [Player]
  }



}
