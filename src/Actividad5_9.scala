import sun.applet.Main
import scala.collection.mutable.ListBuffer
import java.util.concurrent.ThreadLocalRandom


object Actividad5_9 {
	def main(args: Array[String]): Unit = {
			val List = new ListBuffer[Int]()
					for(e <- 0 until 50){
						List += ThreadLocalRandom.current().nextInt(0, 50 + 1)}
			Primos(List)
			SumProm(List)
			for(e <- 0 until List.length-1){
			  println(Factorial(List(e)))
			}
	}

	def Primos(List: ListBuffer[Int]): Unit={
	  val List2 = new ListBuffer[Int]()
	  for(e <- 0 until List.length-1 ){
	    if(List(e)%2== 1){
	      List2+= List(e)
	    }
	  }
	   println(List2) 
	}//Primos
	def SumProm(List: ListBuffer[Int]): Unit={
	  var sum = 0
	  for(e <- 0 until List.length-1){
	    sum = sum + List(e)
	  }
	  
	  println("La sumatoria es: " + sum)
	  println("El promedio es: " + (sum/List.length))
	}//Sumatoria y Prims
	def Factorial(fac: Int): Int ={
    if (fac == 0 )
		{
			return 1;
		}
		else
		{
		 return fac * Factorial(fac - 1);
		}
  }//end the Factorial
}