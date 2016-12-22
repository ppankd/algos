val b = Array( 0,1,2,3,4,5,6,7,8,9,10)





def binarySearchIterative(min:Int, max:Int, target:Int):Int = {
  var startPos = 0
  var endPos = max
  var guess = 0

  while(b(guess) != target) {
    guess = (startPos + endPos)/2
    println("startPos -->" + startPos)
    println("endPos -->" + endPos)
    println("guess -->" + guess)
    if ( b(guess) < target) {
      startPos = guess + 1
    } else {
      endPos = guess - 1
    }
  }
  guess
}
binarySearchIterative(0, b.length -1, 7)


val c = b