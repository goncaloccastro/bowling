/**
  * Created by davidnavalho on 22/07/2016.
  */
case class Round() {

  var plays = 2

  def throwBall(pins: Int): Boolean = {
    if(plays>0) {
      plays -= 1;
      return true
    }
    return false
  }

  def isRoundOver(): Boolean = {
    return(plays==0)
  }

  def canThrow(): Boolean = {
    false
  }

}
