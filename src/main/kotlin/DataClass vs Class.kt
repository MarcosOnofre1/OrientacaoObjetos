fun main() {

    /*
    - vale lembrar que objeto por orientação a objetos, tem "equals, toString e hashCode. Por baixo dos panos, eles tem esses
    3 metodos, isso pertence ao objeto.

    - no caso "class", ali no "f1.equals(f2)", nos nao estamos comparando os valores, estamos comparando na verdade o endereço de memoria.
    Ex:
        objeto(f1) -> cria um endereço de memoria 1
        objeto(f2) -> cria um outro endereço de memoria 2

        porq ele faz isso?
        R: Se nao eles iam acessar os valores e esses objetos iriam se confundir. "De quem é esse valor aqui? esse objeto nao tem um endereço definido de memoria. Nao daria pra saber"
        eles por assim entao definem um endereço diferente para nao haver esse tipo de conflito.
     */


     /*
    /-/-/-/ um exeplo de explicar que nao existe o copy no "class" /-/-/-/

        val f1: Forma = Forma(10, 8)
        val f2: Forma

        * nao estamos instancia f1 p/ f2, isso aqui é apontar o f2, o mesmo endereço de memoria p/ f1
        f2 = f1
     */


    val f1: FormaData = FormaData(10, 8)
    val f2: FormaData

    // Se acaso por acaso, nos quiser fazer uma copia de um objt p/ outro, no "data class" é possivel, ja no "class", temos que implementar.
    f2 = f1.copy(50)


    // usando a "class", se a gente quiser ver se esses valores sao iguais, temos que implementar um codigo na "class", como assim feito ali na "class"
    println(f1.equals(f2))
    // converte um valor p/ string
    println(f1.toString())
    // hashCode é um codigo gerado pelos valores que existem dentro da classe.
    println(f1.hashCode())

    println("------------")

    println(f2.toString())
    println(f2.hashCode())

}

/*
    - pra nao ficar diferente do data class, usamos tbm o val nessa class. Mas se caso nao queira usar, pode tbm.

    - Vale lembrar que, quanto mais variaveis a gente tivesse, mais coisa a gente iria implementar no equals, toString e no hashCode.
 */
class Forma(val a: Int, val b: Int) {

    /*
    - bom, vamos ter que comprar a class Forma com que estamos recebendo, ou seja, estamos recebendo "Any", que significa, qualquer tipo de objeto, qualquer tipo de dados.

    - agora la no "f1.equals(f2)" vai dar True quando for executado, pois fizemos aqui o codigo "equals" com que eles se sejam iguais.
    */
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)

        } else {
            false
        }
    }

    // Se acaso quisessemos ver como o toString se comporta.
    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

}

/*
    - o construtor "data class" é obrigatorio ter var ou val.

    - Ja o "data class", ele faz tudo aquele codigo que foi feito no "class" por baixo dos panos, entao seria mais vantajoso usar o "data class"
    pois seria mais rapido, e ate na excução do "data class", vem de forma mais legivel na quando imprime.

    - o "data class" é bastante usando para transitar endereço.
    como assim? Ex:

            data class Endereco (val rua: String, val cep: String, val city: String)

            fun endereco(e: Endereco) {

            }

     usando dessa forma, simplifica melhor a leitura do codigo, pois a gente transita toda aquela infomação pra classe e a fun nao fica com aquele monte de paramentros.
     assim conseguimos simplificar oque a função recebe.

     - O "data class" por padrao, tambem tem mais um função, a função "copy". Tem um exemplo acima ali que mostra como funciona.
 */
data class FormaData(val a: Int, val b: Int)