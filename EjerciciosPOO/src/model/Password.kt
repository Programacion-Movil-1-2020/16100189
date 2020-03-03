package model

import kotlin.random.Random

class Password {

    var arrMayus = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
    var arrMinus = arrayOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","e","x","y","z")


    private var longitud: Int = 0
        get() = field
        set(value) { field = value}

    private var contraseña: String= ""

    fun getContraseña():String{
        return  contraseña
    }
    constructor()
    {
        contraseña = ""
    }

    constructor(long: Int)
    {
        contraseña = generarPassword(long)
    }

    var cantMayus = 0
    var cantMinus = 0
    var cantNum = 0

    fun generarPassword(long:Int): String
    {
        var res = ""
        var i = 0
        while(i < long)
        {
            var n = Random.nextInt(1, 4)
            when (n) {
                1 -> res += asignarLetra(arrMayus)
                2 -> res += asignarLetra(arrMinus)
                3 -> res += asignarNumero()
            }
            i++
        }
        return res

    }
    fun asignarLetra(arr:Array<String>): String
    {
        var res = ""
        var n = Random.nextInt(0, 25)
        res += arr[n]
        if(arr[0] == "A")
        {
            cantMayus++
        }
        else
        {
            cantMinus++
        }
        return res
    }

    fun asignarNumero():String
    {
        var res = ""
        var n = Random.nextInt(0, 9)
        res += n.toString()
        cantNum++
        return res
    }

    fun esFuerte():Boolean
    {
        return cantMayus > 2 && cantMinus > 3 && cantNum > 5
    }

}