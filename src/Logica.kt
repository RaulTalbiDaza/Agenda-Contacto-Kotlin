fun añadirContacto(agenda: MutableList<Contacto>) {

    // Regex para depurar el número de teléfono (formato español) y el email

    val regexTelefono = Regex("[6-9][0-9]{8}")
    val regexEmail = Regex("[A-Za-z0-9._%+-]+@gmail\\.com")

    // Estas dos variables son para comprobar si las regex encajan con lo introducido por el usuario

    var telValido = false
    var emValido = false

    var numTel = ""
    var email = ""

    println("Introduce el nombre del contacto: ")
    val nombre : String = readln()

    // Bucles while con la depuracion del telefono y del email

    while (!telValido) {
        println("Introduce el número del contacto: ")
        numTel = readln()
        if (!regexTelefono.matches(numTel)){
            println("Formato de número de teléfono incorrecto. El programa solo acepta el formato español. Ingresalo de nuevo")
        }else{
            telValido = true
        }
    }

    while (!emValido) {
        println("Introduce el e-mail del contacto: ")
        email = readln()
        if (!regexEmail.matches(email)){
            println("Formato de e-mail incorrecto. El único dominio aceptado es gmail.com. Ingresalo de nuevo")
        }else{
            emValido = true
        }
    }

    agenda.add(Contacto(nombre, numTel, email))


}

fun listarContactos(agenda: MutableList<Contacto>) {

    // Primero compruebo si la agenda está vacía

    if (agenda.isEmpty()){
        println("La agenda esta vacía \n")
    }else{

        // Aquí recorro la lista añadiéndole un índice para poder mostrar dicho índice

        for ((indice, contacto) in agenda.withIndex()){
            print("${indice + 1}. ${contacto.nombre} - ${contacto.telefono} - ${contacto.email} \n")
        }
    }
}

fun buscarContacto(agenda : MutableList<Contacto>){
    if (agenda.isEmpty()){
        println("La agenda está vacía \n")
    }else{

        // Buscamos el contacto por nombre

        println("Introduce el nombre a buscar: ")
        val nombre : String = readln()

        // Creo una nueva lista filtrada por el nombre intorducido e ignoro las mayúsculas

        val listaFiltrada = agenda.filter{ it.nombre.contains(nombre, ignoreCase = true) }

        for ((indice, contacto) in listaFiltrada.withIndex()){
            print("${indice + 1}. ${contacto.nombre} - ${contacto.telefono} - ${contacto.email} \n")
        }
    }
}

fun eliminarContacto(agenda : MutableList<Contacto>){
    if (agenda.isEmpty()){
        println("La agenda está vacía \n")
    }else{

        // Aquí busco el contacto a eliminar por el número que se le asigna como índice en la propia lista

        println("Introduce el número que ocupa el contacto en la lista: ")
        val num = readln().toIntOrNull()
        if (num != null && num in 1..agenda.size){
            println("Borrando contacto...")

            // Aquí es num - 1 porque el usuario ve del 1 para adelante, pero los índices de las listas empiezan en 0

            agenda.removeAt(num - 1)
            println("Contacto borrado correctamente.")
        }else{
            println("Número incorrecto.")
        }
    }
}