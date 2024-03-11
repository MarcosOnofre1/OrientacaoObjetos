class Pessoa(val anoNascimento: Int, var nome: String) {

    // podemos definir atributos dentro da classe, onde essa variavel, pentence a classe como um todo.
    var olhos: String = ""

    fun acordar() {

    }

    fun dormir() {

    }
}

fun main() {
    // class -  comportamento e atributos

    // classe (instancia) -> objetos
    val pessoa: Pessoa = Pessoa(2005, "Fulano")

    // podemos usar atributos ou metodos da classe.
    pessoa.dormir()
    pessoa.acordar()
    // aqui podemos ou atribuir um valor ou usar "pessoa.olhos" normalmente.
    pessoa.olhos = "asdasdasdas"


}