class Receita {
    /*
    - usando o lateinit, nao precisamos mais usar o String = "" ou ? = null, mas precisamos garantir que ele seja inicializado antes de fazer o acesso.

    - qual a diferença de usar o lateinit para um valor padrao? (= "")

        1ª - lateinit a variavel tem que ser var, ela nao aceita variavel val.

        2ª - a variavel ali no caso, "instrucoes" nao vai existir ate enquanto ela nao for inicializada.
        ela pode ate ser instanciada, o objeto "r" vai ser criado, mas nao vai ter endereço, nao vai ter nada salvo na memoria a respeito de "instrucoes".

        Variaveis lateinit, so sao criadas/alocadas na memoria, quando ela sao de fato inicializadas.

    */
    lateinit var instrucoes: String


    fun geraReceita() {
        instrucoes = "Lave as mãos"
    }

    /*
    - existe como verificar uma variavel lateinit ja foi inicializada? o kotlin permite isso!
    entao fazemos da seguinte maneira:

        com o "this" acessamos o objeto, usamos "::", dai usamos o "instrucoes" ".isInitialized" -> verifica se esta inicializada,
        que retorna True ou False.
    */
    fun  imprimeReceita() {
        if (!this::instrucoes.isInitialized){
            instrucoes = "lave as mãos."    
        }
    }


}

fun main() {
    var r: Receita = Receita()
    r.imprimeReceita()
    println(r.instrucoes)

}

