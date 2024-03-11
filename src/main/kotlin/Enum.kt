enum class Prioridade(val value: Int) {
    /*
    - enum é uma classe diferente, onde ela nao recebe uma variavel, ela pode somente
    ter os valores possiveis que foi listado dentro dela.

    - por baixo dos panos, o valor que esta atribuido na classe enum (baixa) tem um valor ToString, o "override"
    usamos ali pra sobrescrever o toString que ja existe, mas a diferença do Constructor, aqui estamos sobrescrevendo
    nao estamos fazendo um segundo toString. Qual o ganho de usar o toString?
    Resposta: Eu posso customizar o valor que vai ser empresso.
     */
    baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    },
    media(5), alta(10)

}


fun main() {

    /*
        PRA GENTE USAR UMA CLASSE ENUM, TEMOS QUE USAR O NOME DA CLASSE + "."(ponto) e atribuir os valores que esta listado na classe.
        -  LEMBRANDO QUE NAO PODE SE PASSAR OUTRO TIPO DE VALOR A NAO SER QUE SEJA O VALOR ATRIBUIDO NA CLASSE.

        x(Prioridade.baixa)
     */

    for (p in Prioridade.values()) {
        println(p)
    }

}