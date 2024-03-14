class exercicio2 {
    fun encontrarMaiorNumero(array: IntArray): Int {
        var maior = array[0]
        for (num in array) {
            if (num > maior) {
                maior = num
            }
        }
        return maior
    }

}
fun main() {
    val main = exercicio2()

    val numeros = intArrayOf(10, 5, 8, 20, 3)
    println("O maior numero -> ${main.encontrarMaiorNumero(numeros)}")
}
