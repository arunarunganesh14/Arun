val Name = "Kumar"
  val Rank = 5
  val Totalstudent = 20
  val NameJson =
    s"""
       
       |"Name":"$Name",
       |"Rank":"$Rank",
       |"Totalstudent":"$Totalstudent"
       
      """.stripMargin
  println(NameJson)
