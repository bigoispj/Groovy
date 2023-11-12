// Exemplo de DSL simples para configuração
def config = Configuracao {
    servidor {
        endereco = "localhost"
        porta = 8080
    }
    bancoDeDados {
        tipo = "MySQL"
        url = "jdbc:mysql://localhost:3306/meubanco"
    }
}
