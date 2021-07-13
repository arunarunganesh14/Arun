object Even_Odd
{
  def main(args: Array[String]): Unit = 
 {
   val nums = List(1, 2, 3, 4, 5, 7, 9, 11, 14, 12, 16)
   println("List:")
   println(nums)   
   val even_nums = nums.filter(_ % 2 ==0) 
   println("Even number:")
   println(even_nums)
   val odd_nums = nums.filter(_ % 2 != 0) 
   println("Odd number:")
   println(odd_nums)   
  }
}
