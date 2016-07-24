/**
  * Created by davidnavalho on 22/07/2016.
  */
case class Round() {

  def throwBall(pins: Int, listPins: List[Int]): List[Int] = {
    if(pins >= 0) {
      val plays = pins :: listPins
      return plays
    }
    Nil
  }

  def isRoundOver(plays: List[Int]): Boolean = {
    plays.size == 2
  }

  def canThrow(plays: List[Int]): Boolean = {
    return(plays.sum != 10)
  }

}
