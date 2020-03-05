import model.Auto

var listaAutos = listOf<Auto>()
var auto = Auto()

var modelo = ""
var marca = ""
var caract = listOf<String>()
var caractEsp = listOf<String>()

fun main(){
    SalirCiclo@ do {
        val menuPrincipal = """
        1.Ensamblar auto nuevo
        2.Ver autos ensamblados
        3.Salir
    """.trimIndent()
        println(menuPrincipal)
        val response:String? = readLine()
        when(response)
        {
            "1" -> ensamblarAuto()
            "2" -> verAutos()
            "3"-> break@SalirCiclo
        }
    }while (1 == 1)

}

fun ensamblarAuto(){
    auto = Auto()
    caract = listOf<String>()
    caractEsp = listOf<String>()
    println("Marca:")
    menuMarca()
    println("Modelo: ")
    menuModelo()
    println("Agregue las caracteristicas:")
    menuCaract()
    println("Agregue las caracteristicas especiales:")
    menuCaractEsp()
    listaAutos += auto
    println("Se ha agregado un nuevo auto")
}

fun menuMarca(){
    val listaMarcas = """
        1.Kia
        2.Ford
        3.Chevroled
    """.trimIndent()
    println(listaMarcas)
    val response:String? = readLine()

    when(response)
    {
        "1" -> auto.setMarca("Kia")
        "2" -> auto.setMarca("Ford")
        "3"-> auto.setMarca("Chevroled")
    }
}

fun menuModelo() {
    val modelo:String?  = readLine()
    auto.setModelo(modelo as String)
}

fun menuCaract(){
    val listaCaract = """
        1.Transmision manual
        2.Aire acondicionado
        3.Frenos
    """.trimIndent()
    do
    {
        println(listaCaract)
        val caracteristica:String? = readLine()

        when(caracteristica)
        {
            "1" -> caract+="Transmision manual"
            "2" -> caract+="Aire acondicionado"
            "3"-> caract+="Frenos"
        }
        println("""
            Desea agregar otra caracteristica?
            1.Si
            2.No
        """.trimIndent())
        val masCaract:String? = readLine()
    }while (masCaract != "2")
    auto.setCaract(caract)
}
fun menuCaractEsp(){
    val listaCaract = """
        1.Faros niebla
        2.Faros LED
        3.Asientos de piel
    """.trimIndent()
    do
    {
        println(listaCaract)
        val caracteristica:String? = readLine()

        when(caracteristica)
        {
            "1" -> caractEsp+="Faros niebla"
            "2" -> caractEsp+="Faros LED"
            "3"-> caractEsp+="Asientos de piel"
        }
        println("""
            Desea agregar otra caracteristica?
            1.Si
            2.No
        """.trimIndent())
        val masCaract:String? = readLine()
    }while (masCaract != "2")
    auto.setCaractEsp(caractEsp)
}

fun verAutos()
{
    for (a in listaAutos)
    {
        println(a.toString())
    }
    println("La cantidad de autos son: ${listaAutos.count()}")
}