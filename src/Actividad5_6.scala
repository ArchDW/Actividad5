import sun.applet.Main
import scala.collection.mutable.ListBuffer
import java.util.concurrent.ThreadLocalRandom


object Actividad5_6 {
	def suma(List: ListBuffer[Int]): Unit={
	  println(List)
	  for(e <- 0 until List.length){
	    if(e != 0){
	      List(e) = List(e)+ List(e-1)
	    }//if
	  }//for
	  println(List)
	}//SUma

	def main(args: Array[String]): Unit = {
			val List = new ListBuffer[Int]()
					for(e <- 0 until 5){
						List += ThreadLocalRandom.current().nextInt(0, 50 + 1)}
			suma(List)
	}//Main
}//Object