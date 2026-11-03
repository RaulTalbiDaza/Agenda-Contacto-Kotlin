fun añadirContacto(agenda: MutableList<Contacto>) {

    // Regex para depurar el número de teléfono (formato español) y el email

    val regexTelefono = Regex("[6-9][0-9]{8}")
    val regexEmail = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")

    // Estas dos variables son

    var telValido = false
    var emValido = false

    println("Introduce el nombre del contacto: ")
    val nombre : String = readln()


}