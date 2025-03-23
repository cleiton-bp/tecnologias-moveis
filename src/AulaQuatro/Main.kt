fun main() {
    // exemplo de lista de numeros para as funcoes
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosDuplicados = listOf(1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 10)
    val strings = listOf("kotlin", "java", "c#")

    // 1 - calcular media
    val media = calcularMedia(numeros.map { it.toDouble() })
    println("media: $media")

    // 2 - filtrar numeros pares
    val pares = filtrarPares(numeros)
    println("numeros pares: $pares")

    // 3 - remover duplicados
    val unicos = removerDuplicados(numerosDuplicados)
    println("numeros unicos: $unicos")

    // 4 - encontrar ultimo impar
    val ultimoImpar = encontrarUltimoImpar(numeros)
    println("ultimo impar: $ultimoImpar")

    // 5 - converter strings para maiusculas
    val maiusculas = converterParaMaiusculas(strings)
    println("strings em maiusculas: $maiusculas")

    // 6 - usar funcao de extensao para deixar todas as letras maiusculas
    val texto = "exemplo de texto"
    println("texto em maiusculas: ${texto.todasMaiusculas()}")

    // 7 - usar funcoo de extensao para adicionar R$ aos numeros
    val valor = "100.50"
    println("valor com R$: ${valor.adicionarRS()}")
}

// 1 - Funcao que recebe uma lista de numeros e retorna a média aritmetica.
fun calcularMedia(lista: List<Double>): Double {
    var soma = 0.0
    for (numero in lista) {
        soma += numero
    }
    return soma / lista.size
}

// 2 - funcao que recebe uma lista de numeros e retorna apenas os numeros pares.
fun filtrarPares(lista: List<Int>): List<Int> {
    val pares = mutableListOf<Int>()
    for (numero in lista) {
        if (numero % 2 == 0) {
            pares.add(numero)
        }
    }
    return pares
}

// 3 - funcao que remove numeros inteiros duplicados.
fun removerDuplicados(lista: List<Int>): List<Int> {
    val unicos = mutableListOf<Int>()
    for (numero in lista) {
        if (numero !in unicos) {
            unicos.add(numero)
        }
    }
    return unicos
}

// 4 - funcao que encontra o ultimo elemento ímpar em uma lista de inteiros.
fun encontrarUltimoImpar(lista: List<Int>): Int? {
    var ultimoImpar: Int? = null
    for (numero in lista) {
        if (numero % 2 != 0) {
            ultimoImpar = numero
        }
    }
    return ultimoImpar
}

// 5 - funcao que recebe uma lista de strings e retorna uma nova lista com todas as strings em maiusculas.
fun converterParaMaiusculas(lista: List<String>): List<String> {
    val maiusculas = mutableListOf<String>()
    for (str in lista) {
        val resultado = StringBuilder()
        for (char in str) {
            resultado.append(char.uppercaseChar())
        }
        maiusculas.add(resultado.toString())
    }
    return maiusculas
}

// 6 - funcao de extensao que deixa todas as letras maiusculas.
fun String.todasMaiusculas(): String {
    val resultado = StringBuilder()
    for (char in this) {
        resultado.append(char.uppercaseChar())
    }
    return resultado.toString()
}

// 7 - funcao de extensao que concatena o R$ aos numeros.
fun String.adicionarRS(): String {
    return "R$ $this"
}