import org.scalatest.{FeatureSpec, Matchers}

/**
  * Created by rufoseverino on 22/07/2016.
  */

class PlayerTest extends FeatureSpec with Matchers{
  "Player" should "be instanciated" in {
    Player() shouldBe a [Player]
  }
}
