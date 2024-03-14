class exercicio1 {
    fun verificaPar(numero: Int): Boolean {
        return numero % 2 == 0
    }
}

fun main() {
    val main = exercicio1()

    println("10 é par? ${main.verificaPar(10)}")
    println("31 é par? ${main.verificaPar(31)}")
}
