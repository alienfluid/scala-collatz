package collatz

object sequence {
	def main(args: Array[String]) = {
	  val max_a0 = Integer.parseInt(args(0))

	  def getSequence(a: Int, len: Int): Int = a match {
	    case 1 => len
	    case x => if (x % 2 == 0) getSequence(x/2, len+1) else getSequence((3*x+1)/2, len+1) 	    
	  }

	  var (max_len, longest) = (0, 0)
	  for (a <- 1 to max_a0) {
	    val n = getSequence(a, 0)
	    if (n  > max_len) {
	      longest = a
	      max_len = n
	    }	    
	  }
	  
	  println("(" + max_len + ", " + longest + ")")
	  
	}
}