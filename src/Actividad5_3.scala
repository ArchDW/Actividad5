import scala.collection.mutable.ListBuffer


object Actividad5_3 {
	def main(args: Array[String]): Unit = {
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

						println("Ingresa la palabra a cambiar")
						val PalabraBuscada = readLine()

						println("Ingresa la palabra nueva")
						val Palabranueva = readLine()
						for(e <- 0 until Palabras.length ){
							if(Palabras(e).equals(PalabraBuscada)){
								Palabras.remove(e)
							}
						}
			println(Palabras)
	}

}