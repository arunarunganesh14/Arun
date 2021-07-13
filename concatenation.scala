object myObject { 
    def main(args:Array[String]) { 
        val list1 = List("C++", "java", "Python")
        val list2 = List("Scala", "C#")
        
        println("List concatenated using ++ operator : " +  ( list1 ++ list2 ) )
        println("List concatenated using ::: operator : " + ( list1 ::: list2 ) )
    }
}
