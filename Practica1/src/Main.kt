var computadora = ""
var lista = ""

fun main(){
    SalirCiclo@ do {
        computadora = ""
        val menuPrincipal = """
        1.Armar nuevo equipo
        2.Ver equipos armados
        3.Salir
    """.trimIndent()
        println(menuPrincipal)
        val response:String? = readLine()
        when(response)
        {
            "1" -> menuComponentes()
            "2" -> print(lista)
            "3"-> break@SalirCiclo
        }
    }while (1 == 1)

}

fun menuComponentes(){
    println("Agregue un procesador")
        menuProcesador()
    println("Agregue una grafica")
        menuGrafica()
    println("Agregue cantidad de RAM")
        menuRAM()
    println("Se ha agregado una nueva computadora")
}

fun menuProcesador(){
        val menuCPU = """
        1.Intel Core i3
        2.Intel Core i7
        3.Intel Core i5
    """.trimIndent()
        println(menuCPU)
        val response:String? = readLine()

        when(response)
        {
            "1" -> computadora = computadora + "Intel Core i3 "
            "2" -> computadora = computadora + "Intel Core i7 "
            "3"-> computadora = computadora + "Intel Core i5 "
        }
}

fun menuGrafica(){
    val menuGraficas = """
        1.GTX 1050
        2.RX 570
        3.GTX 1060
    """.trimIndent()
    println(menuGraficas)
    val response:String? = readLine()

    when(response)
    {
        "1" -> computadora = computadora + "GTX 1050 "
        "2" -> computadora = computadora + "RX 570 "
        "3"-> computadora = computadora + "GTX 1060 "
    }
}
fun menuRAM(){
    val menuRAM = """
        1.8GB 
        2.4GB
        3.16GB
    """.trimIndent()
    println(menuRAM)
    val response:String? = readLine()

    when(response)
    {
        "1" -> computadora = computadora + "8GB "
        "2" -> computadora = computadora + "4GB "
        "3"-> computadora = computadora + "16GB "
    }
    lista = lista + computadora + "\n"
}
