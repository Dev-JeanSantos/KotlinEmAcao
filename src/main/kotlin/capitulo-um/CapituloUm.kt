package `capitulo-um`

class CapituloUm {
    data class Pessoa(
        val nome: String,
        val idade: Int? = null
    )
}

val pessoas = listOf(
        CapituloUm.Pessoa("Jean"),
        CapituloUm.Pessoa("Francisco", 42),
        CapituloUm.Pessoa("Maria", 30)
)


fun main(args: Array<String>) {
    encontrarMaisVelha()

}


fun encontrarMaisVelha() {
    val maiVelho = pessoas.maxBy { it.idade ?: 0 }
    println("O Pessoa mais velho(a) é a $maiVelho")

}