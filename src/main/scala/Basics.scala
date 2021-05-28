import spinal.core._
/*
out should be replaced by ouT
in should be replaced by iN
//Simple wire
class top_module extends Component{
  val iN = in Bool
  val ouT = out Bool
  val ouT := iN

}

object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module())
  }
}
//Four wires
class top_module extends Component{
  val a,b,c = in Bool
  val w,x,y,z = out Bool
  val w := a
  val x := b
  val y := b
  val z := z

}

object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module())
  }
}
//inverter
class top_module extends Component{
  val iN = in Bool
  val ouT = out Bool
  val ouT := !iN

}

object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module())
  }
}
//AND gate, NOR gate, XNOR gate
class top_module(oper:String) extends Component{
  val a = in Bool
  val b = in Bool
  val ouT= out Bool

  oper match {
    case "and" => ouT:= a & b
    case "nor" => ouT := !(a|b)
    case "xnor" => ouT := !(a^b)
    case _ => ouT:= False
  }
}

object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module("xnor"))
  }
}
//Declaring wires
import spinal.core._
class top_module extends Component{
  val a,b,c,d = in Bool
  val ouT,out_n = out Bool

  val wire1 = Bool()
  val wire2 = Bool()

  wire1 := a&b
  wire2 := c&d

  ouT := wire2 | wire1
  out_n := ! ouT
}
object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module)
  }
}
//7458 chip
import spinal.core._
class top_module extends Component {
  val p1a, p1b, p1c, p1d, p1e, p1f = in Bool()
  val p2a, p2b, p2c, p2d = in Bool
  val p1y, p2y = out Bool

  p1y := (p1a & p1b & p1c)|(p1d & p1e & p1f)
  p2y := (p2a & p2b)|(p2c & p2d)
}

object AInst {
  def main(args: Array[String]) {
    SpinalSystemVerilog(new top_module)
  }
}
 */
