// Exemplo de trabalho com JSON
def json = '{"nome": "Groovy", "versao": "3.0"}'
def objeto = new groovy.json.JsonSlurper().parseText(json)

println "Nome: ${objeto.nome}, Versão: ${objeto.versao}"
