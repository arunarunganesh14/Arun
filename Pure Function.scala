object PureFunction {
  def main(args: Array[String]): Unit = {
    println("Mileage : " + mileageCal(225, 4))


    def mileageCal(distance: Int, fuel: Int): Float = {
      val mileage = distance / fuel
      return (mileage);
    }
  }
}
