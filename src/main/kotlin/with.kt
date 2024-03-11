fun main() {

    val pessoaCriadaParaExecucaoDeTestes = Pessoa(1996, "Frank")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    /*
    - quando temos poucos metodos, nao é tao vantajoso usar "with()", mas, quando temos 4, 5 ou +, ai sim, o bom de usar o "with()".

    - ele ajuda para uma leitura melhor do codigo, como por exemplo o modo de cima, se caso tenhamos uma variavel com um nome mt grande,
    se tivermos muitos metodos, fica ruim a leitura do codigo. Ai é que entra o "with()", com ele, fica mais facil a leitura do codigo onde que
    nao muda sua funcionalidade, ela é praticamente a mesma coisa, apenas fica mais facil a leitura, entender mais facil.

    - Os 2 codigos vai executar a mesma coisa, nao existe diferença de performace ou de que vai ser executado.
    */
    with(pessoaCriadaParaExecucaoDeTestes){
        acordar()
        dormir()
        olhos
    }
}