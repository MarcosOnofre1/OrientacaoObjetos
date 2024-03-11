class Animal(var especie: String) {
    /*
    - O bloco init é um bloco que vai ser executado sempre que a classe for criada. Ou seja, init é um codigo que é chamado quando a classe é instaciada.

    - Pode ter varios blocos de init, o kotlin nao sabe qual a qual iniciar, ele vai executar todos na sequencia declarados. Nao tem problema em ter varios inits.

    - podemos usar o init para verificar valores, exemplo abaixo:
    */

    var fala: String = ""

    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }

    fun falar(){
        println(fala)
    }
}

fun main() {

    Animal("cachorro").falar()
}