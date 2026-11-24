//Arrays

fun main() {
    val vetor = intArrayOf(1, 2, 3, 4, 5, 6)    //questão 1

    while (i < 3) {
        val aux = vetor[i]
        vetor[i] = vetor[5 - i]
        vetor[5 - i] = aux
        i++
    }

    println(vetor.contentToString())
}

//

fun main() {
    val codigos = arrayOf("A1", "A2", "A3", "A4", "A5")   //questão 2

    for (i in codigos.indices) {
        if (codigos[i] == "A3") {
            println("Posição: $i")
            break
        }
    }
}

//

fun main() {
    val temperaturas = doubleArrayOf(30.0, 32.0, 28.0, 35.0, 31.0, 29.0, 32.0)
    var soma = 0.0

    for (t in temperaturas) {
        soma += t                                            //questão 3
    }

    val media = soma / 7
    println("Média: $media")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Índice: $i")
        }
    }
}

//

fun main() {
    val vetor = IntArray(20) { it + 1 }
    var soma = 0
                                                    //questão 4
    for (i in 0..19 step 2) {
        println(vetor[i])
        soma += vetor[i]
    }

    println("Soma: $soma")
}

//

fun main() {
    val tarefas = arrayOf("Estudar", "Trabalhar", "Ler")

    for ((i, tarefa) in tarefas.withIndex()) {
        println("${i + 1} - $tarefa")                 //questão 5
    }
}


//Matrizes

fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )                                               //questão 6

    for (i in 0..2) {
        var soma = 0

        for (j in 0..3) {
            soma += matriz[i][j]
        }

        println("Soma da linha: $soma")
    }
}

//
fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)          //questão 8
    )

    var soma = 0

    for (i in 0..3) {
        for (j in 0..3) {
            print("matriz ")

            if (i == j) {
                soma += matriz[i][j]
            }
        }
        println()
    }

    println("Soma da diagonal: $soma")
}


// questões 7,9 e 10 tive dificuldades para fazer,mas aonda estou tentando responder 

