
// 1 - Escreva um programa em Kotlin que recebe uma lista de 5 números inteiros
// como entrada e calcule a média desses números. Certifique-se de lidar com casos
// em que a lista pode estar vazia.

//fun main() {
//       println(listOf<Int>(10,5)?.average())
//}


//2 - Crie um programa que verifique uma variável utilizando o WHEN traduza as seguintes
// cores em inglês para o portugues: blue, red, green, yellow

fun main() {
    var color = readln()
    when (color) {
        "blue" -> println("azul")
        "red" -> println("vermelho")
        "green" -> println("verde")
        "yellow" -> println("amarelo")
    }
}
