/**
  * Created by pdeshpande4 on 12/20/16.
  */
object BinarySearch extends App {

  private var b:Array[Int] = Array(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)

  def set(list:Array[Int]):Unit = {
    b = list
  }

  def binarySearchIterative(min: Int, max: Int, target: Int): Int = {
    var startPos = 0
    var endPos = max
    var guess = 0
    val target = 79

    while (b(guess) != target) {
      guess = (startPos + endPos) / 2

      if (b(guess) < target) {
        startPos = guess + 1
      } else {
        endPos = guess - 1
      }
    }
    guess
  }

  def binarySearchRecursive(min: Int, max: Int, target: Int): Int = {
    if (b(max) == target) max
    else {
      val guess = (min + max) / 2
      if (b(guess) < target) binarySearchRecursive(guess + 1, max, target)
      else
        binarySearchRecursive(min, guess - 1, target)
    }
  }

  def binarySearchFunctional(min: Int, max: Int, target: Int): Int = {

    def bsf(min: Int, max: Int, target: Int): Int = {
      val guess = (min + max) / 2
      target match {
        case (v: Int) if b(max) == target => target
        case (x: Int) if b(max) < target => bsf(guess + 1, max, target)
        case (y: Int) if b(max) > target => bsf(min, guess - 1, target)
        case _ => -1
      }
    }
    bsf(min, max, target)
  }
}