package model

class Auto() {
    private var marca:String = ""
    fun setMarca(marca: String){
        this.marca = marca
    }
    fun getMarca():String{
        return marca
    }
    private var modelo:String = ""
    fun setModelo(modelo: String){
        this.modelo = modelo
    }
    private var caract= listOf<String>()
    fun setCaract(caract:List<String>){
        this.caract = caract
    }
    private var caractEsp= listOf<String>()
    fun setCaractEsp(caractEsp:List<String>){
        this.caractEsp = caractEsp
    }

    override fun toString(): String {
        val datos = """
Marca: ${marca}
Modelo:${modelo} 
Caracteristicas: ${imprimirLista(caract)}
Caracteristicas especiales: ${imprimirLista(caractEsp)}
""".trimIndent()
        return datos
    }

    fun imprimirLista(lista:List<String>):String
    {
        var res = "\n"
        for(s in lista)
        {
            res += s + "\n"
        }
        return res
    }
}