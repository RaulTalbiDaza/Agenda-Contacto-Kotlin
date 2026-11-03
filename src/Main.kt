fun main(){
    val agenda = mutableListOf<Contacto>()

    var salir : Boolean = false
    while(!salir){
        println("\n===== AGENDA DE CONTACTOS =====")
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Eliminar contacto")
        println("5. Salir\n")
        println("Selecciona una opción")
        var opcion : String = readln()

        when (opcion) {
            "1" -> añadirContacto(agenda)
            "2" -> listarContactos(agenda)
            "3" ->
                println("3")
            "4" ->
                println("4")
            "5" ->{
                println("Saliendo...")
                salir = true
            }
            else -> println("Opcion incorrecta")
        }
    }
}