package AulaTres

class CharGenerator(val min: Char, val max: Char) {
    fun generateChar(): Char {
        return (min..max).random()
    }
}

class Pessoa(val nome: String, val idade: Int) {
    fun caminhar() {
        println("caminhando")
    }

    fun falar() {
        println("falando")
    }
}

sealed class Result {
    class Sucesso(val data: Any) : Result()
    class Error(val message: String) : Result()
    object Loading : Result()
}

data class PessoaData(val nome: String, val idade: Int, val profissao: String, val cpf: String)

fun main() {
    val charGen = CharGenerator('a', 'z')
    println("Generated char: ${charGen.generateChar()}")

    val pessoa = Pessoa("cleiton", 25)
    pessoa.caminhar()
    pessoa.falar()

    val pessoa1 = PessoaData("cleiton 2", 22, "desenvolvedor", "12345678900")
    val pessoa2 = pessoa1.copy(nome = "cleiton 3")

    println(pessoa1)
    println(pessoa2)
}