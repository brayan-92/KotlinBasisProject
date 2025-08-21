package edu.unicatolica.kotlin

fun main() {
    val name: String = "Brayan Jativa"
    val age: Int = 33
    val program: String = "Tecnologia en desarrollo de software"

    val interests = listOf(
        "desarrollo web",
        "apps mobiles",
        "servicios en la nube",
        "ciberseguridad"
    )

    val basicMessage = "Me llamo $name, tengo $age años y estudio $program."

    val interestsMessage = "Mis intereses son: ${interests.joinToString(", ")}."

    println(basicMessage)
    println(interestsMessage)
}