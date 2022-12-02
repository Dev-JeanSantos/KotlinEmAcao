package `capitulo-um`

class CapituloUm {

    data class Pessoa(
        val nome: String,
        val idade: Int? = null
    )

}
fun main(args: Array<String>){
    val pessoas = listOf(
            CapituloUm.Pessoa("Jean"),
            CapituloUm.Pessoa("Francisco", 42),
            CapituloUm.Pessoa("Maria", 30)
    )

    val maiVelho = pessoas.maxBy { it.idade ?: 0 }
    println("O Pessoa mais velho(a) é a $maiVelho")
}