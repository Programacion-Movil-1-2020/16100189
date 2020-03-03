package model

import kotlin.random.Random

class Persona {
    val sexoF = "M"
    private var nombre:String = ""
        set(value){
            field = value
        }
        get() = field
    private var edad:Int = 0
        set(value){
            field = value
        }
        get() = field
    private var DNI:String = generarDNI()
        set(value){
            field = value
        }
        get() = field
    private var sexo = sexoF
        set(value){
            field = value
        }
        get() = field
    private var peso = 0.0
        set(value){
            field = value
        }
        get() = field
    private var altura = 0.0
        set(value){
            field = value
        }
        get() = field

    constructor()
    {
        nombre = ""
        edad = 0
        DNI = generarDNI()
        sexo = sexoF
        peso = 0.0
        altura = 0.0
    }

    constructor(nom:String, ed:Int, s: String)
    {
        nombre = nom
        edad = ed
        DNI = generarDNI()
        sexo = comprobarSexo(s)
        peso = 0.0
        altura = 0.0
    }

    constructor(nom:String, ed:Int, s: String, p:Double, a:Double)
    {
        nombre = nom
        edad = ed
        DNI = generarDNI()
        sexo = comprobarSexo(s)
        peso = p
        altura = a
    }

    fun calcularIMC(): Int
    {
        val imc = peso/(altura * altura)
        var res = 0
        if(imc > 20)
        {
            res = -1
        }
        else if(imc >= 20 && res <= 25)
        {
            res = 0
        }
        else
        {
            res = 1
        }
        return res
    }
    fun esMayorDeEdad():Boolean
    {
        return edad >= 18
    }

    fun comprobarSexo(Sexo:String):String
    {
        if(Sexo != "H" || Sexo != "M")
        {
            return "H"
        }
        else
        {
            return Sexo
        }
    }

    override fun toString(): String {
        return "Nombre: ${nombre} Edad: ${edad} DNI: ${DNI} Sexo: ${sexo} Peso: ${peso} Altura: ${altura} Mayor de edad: ${esMayorDeEdad()} IMC: ${calcularIMC()}"
    }

    fun generarDNI(): String
    {
        var numG = ""
        for(i in 0..8)
        {
            var n = Random.nextInt(1, 9)
            numG += n.toString()
        }
        if(nombre != "")
        {
            numG += nombre.substring(0,1)
        }
        return  numG

    }



}