// Exemplo de adição dinâmica de método
class Exemplo {
    def saudacao() {
        println "Olá, sou um objeto Groovy!"
    }
}

def objeto = new Exemplo()
objeto.metodoDinamico = { println "Este é um método dinâmico!" }

objeto.saudacao()
objeto.metodoDinamico()
