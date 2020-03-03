package model

class Cuenta {
    private var titular: String = ""
        set(value){
            field = value
        }
        get() = field


    private var cantidad: Double = 0.0
        set(value){
            field = value
        }
        get() = field

    constructor(titul:String)
    {
        titular = titul
    }

    constructor(titul: String,cant: Double)
    {
        titular = titul
        cantidad = cant
    }

    override fun toString(): kotlin.String {
        return "Titular: ${titular}, cantidad en la cuenta: ${cantidad}"
    }

    fun Ingresar(cant:Double)
    {
        if(cant >= 0)
        {
            cantidad += cant
        }
    }

    fun Retirar(cant: Double)
    {
        cantidad -= cant
        if(cantidad < 0)
        {
            cantidad = 0.0
        }
    }
}