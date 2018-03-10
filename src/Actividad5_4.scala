import scala.collection.mutable.ListBuffer


object Actividad5_4 {
	def main(args: Array[String]): Unit = {
			val Palabras = new ListBuffer[String]()
					val Palabras2 = new ListBuffer[String]()
					var option = 0
					println("Ingresa las palabras de la primera lista")
					do{
						println("Seleciona\n1)Agregar Palabra\n2)Salir")
						option= readByte()
						if(option == 1){
							println("Ingresa la Palabra")
							Palabras += readLine()
						}else
							println("Saliendo")
					}while(option!=2)
						var option2 = 0
						println("Ingresa las palabras de la segunda lista")
						do{
							println("Seleciona\n1)Agregar Palabra\n2)Salir")
							option2= readByte()
							if(option2 == 1){
								println("Ingresa la Palabra")
								Palabras2 += readLine()
							}else
								println("Saliendo")
						}while(option2!=2)
							println("Palabras Antes de eliminar "+ Palabras)
							println(Palabras2)
							for(e <- 0 until Palabras2.length-1 ){
								if(e< Palabras2.length){
									for(i <- 0 until Palabras.length-1){
										if(Palabras(i).equals(Palabras2(e))){
											Palabras.remove(i)
										}
									}
								}
							}
			println("Primera lIsta "+Palabras)
	}
}