import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

@main def hello(): Unit =
  println("Hello, ScalaPy!")

  // Python ranges are exclusive
  val list = py.Dynamic.global.range(1, 3 + 1)
  println(s"list = $list") // list: py.Dynamic = range(1, 4)

  // 1 + 2 + 3 == 6
  val listSum = py.Dynamic.global.sum(list)
  println(s"listSum = $listSum") // listSum: py.Dynamic = 6