import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters
import me.shadaj.scalapy.py.seqConvertableSeqElem
import me.shadaj.scalapy.py.writableSeqElem

@main def hello(): Unit =
  println("Hello, ScalaPy!")

  // Python ranges are exclusive
  val list = py.Dynamic.global.range(1, 3 + 1)
  println(s"list = $list") // list: py.Dynamic = range(1, 4)

  // 1 + 2 + 3 == 6
  val listSum = py.Dynamic.global.sum(list)
  println(s"listSum = $listSum") // listSum: py.Dynamic = 6

  val np = py.module("numpy")
  // np: py.Module = <module 'numpy' from '/opt/buildhome/.pyenv/versions/3.7.1/lib/python3.7/site-packages/numpy/__init__.py'>

  val a = np.array(Seq(
    Seq(1, 0),
    Seq(0, 12)
  ).toPythonProxy)
  // a: py.Dynamic = [[ 1  0]
  //  [ 0 12]]
  println(s"a = $a")

  val aSquared = np.matmul(a, a)
  // aSquared: py.Dynamic = [[  1   0]
  //  [  0 144]]
  println(s"aSquared = $aSquared")