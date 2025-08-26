package edu.unicatolica.kotlin

fun main() {
    print("Ingrese la cantidad de estudiantes: ")
    val n = readLine()!!.toInt()

    val notas = mutableListOf<Double>()



    for (i in 1..n) {
        var notaValida: Double? = null
        do {
            print("Ingrese la nota del estudiante $i (0.0 - 5.0): ")
            val input = readLine()
            val nota = input?.toDoubleOrNull()

            if (nota != null && nota in 0.0..5.0) {
                notaValida = nota
            } else {
                println("⚠️ Nota inválida. Debe estar entre 0.0 y 5.0.")
            }
        } while (notaValida == null)

        notas.add(notaValida)
    }


    val promedio = notas.average()
    val aprobados = notas.count { it >= 3.0 }
    val reprobados = notas.count { it < 3.0 }
    val notaMax = notas.maxOrNull()
    val notaMin = notas.minOrNull()



    val clasificacion = when {
        promedio >= 4.5 -> "Excelente"
        promedio >= 4.0 -> "Muy bien"
        promedio >= 3.0 -> "Aprobado"
        else -> "Reprobado"
    }


    println("\n📊 Resultados:")
    println("Promedio general: %.2f".format(promedio))
    println("Estudiantes aprobados: $aprobados")
    println("Estudiantes reprobados: $reprobados")
    println("Nota más alta: $notaMax")
    println("Nota más baja: $notaMin")
    println("Clasificación del promedio: $clasificacion")
}
