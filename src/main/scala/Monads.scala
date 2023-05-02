object Monads extends App {
  
  // Options
  val anOption: Option[Int] = Option(40) // Some(40)
  val emptyOption: Option[Int] = Option.empty // None

  val anOption2 = anOption.map(x => x * 10) // Some(400)

  val anOption3 = anOption.map(x => Option(x * 10)) // Some(Some(400))

  val anOption4 = anOption.flatMap(x => Option(x * 10)) // Some(400)

  val chainedOption: Option[Int] = emptyOption.orElse(anOption)

  def getValue(op: Option[Int]) = op.getOrElse(1)

  val value = getValue(anOption) // 40
  val value2 = getValue(emptyOption) // 1 default value

  val combine = for {
    first <- Option(40)
    second <- Option(null)
  } yield first + second // None

  val combineValue = combine.getOrElse("error") // error

  val combine1 = for {
    first <- Option(40)
    second <- Option(10)
  } yield first + second // 50

  val combine1Value = combine1.getOrElse(0) // 50
  
  println(combine1Value)

}
