class Pessoal(val anoNascimento: Int, var nome: String) {

    // na classe, a variavel precisa de um valor padrao para ser instaciada na main. Ouseja, temos 2 saidas, ou "String? = null" ou " String = "" ".
    var doc: String = ""
    /*
        qnd criamos esse constructor, estamos criando um constructor secundario, pois na propria classe ja existe o primario.
        Mas, quando temos um constructor secundario, ele exige que voce chame o constructor primario, pq o primario é quem manda
        em tudo, entao voce tem que chama o primario.

        - conflito overloads - quando tem 2 assinaturas iguais. Ou seja, ta batendo a mesma coisa da instancia da classe com o constructor.

        - var ou val no constructor secundario nao é permitido!

        - diferença de usar um doc no constructor e usar no na propria classe, seria que, no constructor, podemos ter logica, ja na propria classe, nao. Ali é um valor padrao e pronto.
     */
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome){
        /* this. se refere a instacia da classe. Ou seja, this.doc é a variavel da classe. Estamos fazendo desse jeito,
        para nao criar uma confusao saber de quem é o doc que estamos chamando. */
        this.doc = doc

    }

    fun acordar() {

    }

    fun dormir() {

    }

}

/*
 private constructor é um conceito bacana de se usar, pois nao tem como eliminar uma classe, mas tem como "fechar" a classe. Assim,
 faz com que a classe nao seja instanciada "()". Lembrando que esse é um dos exemplos de constructor.
*/
class Vazia private constructor()

fun main() {

    // class -  comportamento e atributos

    // classe (instancia) objetos
    val pessoa: Pessoal = Pessoal(2005, "Fulano", "621651651")

    // this - se refere ao objeto da classe
    pessoa.dormir()
    pessoa.acordar()
    pessoa.doc

    // a Exception, ela é aceita com ou sem paramentros.
    throw Exception()
    Exception("Mensagem de erro")

}