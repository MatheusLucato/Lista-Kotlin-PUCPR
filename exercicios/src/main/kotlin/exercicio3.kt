class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoas = listOf(
        Pessoa("Pz", 24),
        Pessoa("Fasola", 20),
        Pessoa("Lucato", 35)
    )

    val pessoasOrdenadas = pessoas.sortedBy { it.nome }

    println("Lista de pessoas ordenada por nome:")
    pessoasOrdenadas.forEach { pessoa ->
        println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
    }
}