// Ingrese la edad de una persona y valide si es mayor o menor de edad, adicionalmente si la persona tiene 25 años
// menciónelo.

fun main() {
    println("Ingrese la edad")
    val edad = readLine()!!.toInt()

    if(edad >= 18) {
        println("La persona es mayor de edad")
        if( edad == 25) {
            println("La persona tiene 25 años")
        }
    } else {
        println ("La persona es menor de edad")
    }

}