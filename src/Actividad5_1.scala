import scala.collection.mutable.ListBuffer
import com.sun.org.apache.bcel.internal.generic.SWITCH


object Actividad5 {

	def main(args: Array[String]): Unit = {
	  var con = 0.0
			val palabrasPruebas = List("Arch","Grapha","Señor","Dragon","del","Mundo","Oscuro","Archidemonio","Archfiend")
					/*for(e <- palabrasPruebas if e.startsWith("Arch")){
						println(e)
					}*/
	  
	  	val Palabras = new ListBuffer[String]()
	  	var option = 0
	  	do{
	  	  println("Seleciona\n1)Agregar Palabra\n2)Salir")
	  	  option= readByte()
	  	  if(option == 1){
	  	    println("Ingresa la Palabra")
	  	    Palabras += readLine()
	  	  }else
	  	    println("Saliendo")
	  	}while(option!=2)
	  	    
			println("Ingresa la palabra a buscar")
			val PalabraBuscada = readLine()
			for(e <- Palabras if e.startsWith(PalabraBuscada)){
						con += 1
					}
	  println(con)
	}//the end Main
}//The end Object