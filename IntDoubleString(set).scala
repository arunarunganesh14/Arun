{
  var names=Set[String]()
  names+="Arun"
  println(names)
  names ++=Vector("arr","run","kumar","ganesh")
  println(names)
  
  var s = Set[Int]()
  s += 1
  println(s)
  s ++=Vector(1,2,3,4)
  println(s)
  var s1=s
  println(s1)

  var double=Set[Double]()
  var double1= double+2.0
  println(double1)
  var double2=double1+(4.0,6.0,8.0)
  println(double2)
}
