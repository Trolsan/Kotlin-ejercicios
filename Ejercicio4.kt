// Basado en el siguiente menú
// 1. Saludar
// 2. Pedir Nombre de una Persona
// 3. Sumar 2 Números
// Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente.

fun main () {
    var menu = """

    MENU DE OPCIONES
    1. Saludar
    2. Pedir nombre de una persona
    3. Sumar 2 numeros
    Ingrese una opcion: 

    """
    print(menu)
    var opcion = readLine()?.toInt()
    when (opcion) {
        1 -> println("Hola, ¿como estan?")

        2 -> {
            print ("Ingresa el nombre de una persona: ")
            val name = readLine()
            println("Hola, $name")
        }

        3 -> {
            print("Ingresa el primer numero: ")
            val num1 = readLine()?.toInt()
            print("Ingresa el segundo numero: ")
            val num2 = readLine()?.toInt()
            println("La suma de $num1 y $num2 es ${(num1!! + num2!!)}")
        }
        else -> println("Opcion invalida")
    }

}