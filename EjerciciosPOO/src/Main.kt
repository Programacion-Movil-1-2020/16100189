import model.Cuenta
import model.Persona
import model.Password
import kotlin.random.Random

fun main()
{
    println("--------------------------")
    println("Practica1")
    var cuenta = Cuenta("Holo",1234.56)
    println(cuenta.toString())
    cuenta.Ingresar(6.44)
    println(cuenta.toString())
    cuenta.Retirar(2000.0)
    println(cuenta.toString())

    println("--------------------------")
    println("Practica2")
    println("Ingrese el nombre de la persona")
    val nombre = readLine()?.toString() as String
    println("Ingrese la edad de la persona")
    val edad = readLine()?.toInt() as Int
    println("Ingrese el sexo de la persona")
    val sexo = readLine()?.toString() as String
    println("Ingrese el peso de la persona")
    val peso = readLine()?.toDouble() as Double
    println("Ingrese la altura de la persona")
    val altura = readLine()?.toDouble() as Double

    var persona1 = Persona(nombre, edad, sexo, peso, altura)
    var persona2 = Persona(nombre, edad, sexo)
    var persona3 = Persona()

    println(persona1.toString())
    println(persona2.toString())
    println(persona3.toString())

    println("--------------------------")
    println("Practica3")
    println("Cuantas contraseñas desea crear?")
    val cantidad = readLine()?.toInt() as Int
    var i = 0
    var j = 0
    var arrPasswords = arrayOfNulls<String>(cantidad)
    var arrBools = arrayOfNulls<Boolean>(cantidad)
    println("Longitud de la contraseña")
    val long = readLine()?.toInt() as Int
    while(i < cantidad)
    {
        var pass = Password(long)
        arrPasswords[i] = pass.getContraseña()
        arrBools[i] = pass.esFuerte()
        i++
    }

    while(j < cantidad)
    {
        println(arrPasswords[j] + " " + arrBools[j])
        j++
    }


}
