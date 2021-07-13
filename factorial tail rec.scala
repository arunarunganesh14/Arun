object Factorial
{ 
	def fact(n: Int): Int =
	{ 
		@tailrec def calFact(acc: Int, n: Int): Int  =
		{ 
			if (n <= 1) 
				acc 
			else
				calFact(n * acc, n - 1) 
		} 
		calFact(1, n) 
	} 
	def main(args:Array[String]) 
	{ 
		println("The factorial of 8 is " + fact(8)) 
	} 
} 
