package `capitulo-dois`

import java.util.*

class CapituloDois {

    class Pessoa(
        val nome: String, //val => Apenas GET
        var isCasado: Boolean //Var => GET e SETTER
    )

    data class Retangulo(val altura: Int, val largura: Int){
        val isRetangulo: Boolean
            get(){
                return altura != largura
            }
    }

    enum class Cores(
        val r: Int, val g: Int, val b: Int
    ){
        VERDE (255, 0, 0),
        AZUL(0, 0, 255),
        AMARELO(255, 255, 0),
        BRANCO(255,0,255);

        fun rgb() = (r * 256 + g) * 256 + b
    }
}

fun main(args: Array<String>){
    println("Olá, Mundo!")
    println("*******Teste1*******")
    println(teste1(a= 100, b=10))
    teste2()
    teste3()
    teste4()
    teste5()
    println("*******Teste6*******")
    println(teste6(CapituloDois.Cores.BRANCO))
}

fun teste1(a: Int, b: Int): Int = if (a > b ) a else b


fun teste2(){
    val pessoa = CapituloDois.Pessoa("Jean", true)
    pessoa.isCasado = false
    println("*******Teste2*******")
    println(pessoa.nome)
    println(pessoa.isCasado)
}

fun teste3(){
    val retangulo = CapituloDois.Retangulo(41, 42)
    println("*******Teste3*******")
    println(retangulo.isRetangulo)
}

fun teste4(): CapituloDois.Retangulo {
    val randomico = Random()
    println("*******Teste4*******")
    val retangulo = CapituloDois.Retangulo(randomico.nextInt(), randomico.nextInt())
    println(retangulo)
    return retangulo
}

fun teste5(){
    println("*******Teste5*******")
    println(CapituloDois.Cores.AZUL.rgb())
}

fun teste6(cor: CapituloDois.Cores) =
    when (cor){
        CapituloDois.Cores.AZUL   -> "circulo"
        CapituloDois.Cores.AMARELO-> "losango"
        CapituloDois.Cores.VERDE  -> "retangulo"
        CapituloDois.Cores.BRANCO -> "linha"
    }