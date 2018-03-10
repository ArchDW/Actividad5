import scala.collection.mutable.ListBuffer


object Actividad5_5 {
	def main(args: Array[String]): Unit = {
			val Palabras = new ListBuffer[String]()
					val Palabras2 = new ListBuffer[String]()
					val ListaIguales = new ListBuffer[String]()
					//val ListaDiferentes1 = new ListBuffer[String]()
					val ListaTodas = new ListBuffer[String]()
					//val ListaDiferentes2 = new ListBuffer[String]()
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
							ListaTodas ++= Palabras
							ListaTodas ++= Palabras2
							for(e <- 0 until Palabras2.length ){
								if(e< Palabras2.length){
									for(i <- 0 until Palabras.length){
										if(Palabras(i).equals(Palabras2(e))){
											ListaIguales += Palabras(i)
										}//if
									}//for
								}//if
							}//for
			for(e <- 0 until Palabras2.length-1 ){
				if(e< Palabras2.length){
					for(i <- 0 until Palabras.length-1){
						if(Palabras(i).equals(Palabras2(e))){
							Palabras.remove(i)
							Palabras2.remove(e)
						}
					}
				}
			}
					println("Todas las Palabras Iguales de Ambas Listas" + ListaIguales)
					println("Todas las Palabras que solo estan en la Primer Lista" + Palabras)
					println("Todas las Palabras que solo estan en la Segunda Lista" + Palabras2)
					println("Todas las Palabras " + ListaTodas)
	}
}