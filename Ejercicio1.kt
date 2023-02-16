// Realice un algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique que es menor de edad

fun main() {
    println("Ingrese la edad")
    val edad = readLine()!!.toInt()

    if(edad < 18) {
        println("La persona es menor de edad")
    }

    println("La edad es: $edad")

}