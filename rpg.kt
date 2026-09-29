fun main() {

    println("Digite o nome do seu personagem: ")
    val nome = readln()

    println("Escolha a sua classe (Guerreiro/Ladino/Mago): ")
    val classe = readln()

    println("=== Ficha do Personagem===")
    println("Nome: $nome")
    println("Classe: $classe")
    println("===========================")

    if (classe == "Ladino") {
        println("$nome carrega um conjunto de gazuas, ideal para abrir fechaduras.")
    } else if (classe == "Guerreiro") {
        println("$nome carrega uma massiva espada, forte o suficiente para quebrar portas.")
    } else if (classe == "Mago") {
        println("$nome carrega um grimório que contém feitiços, sendo um deles de abertura.")
    } else {
        println("Classe desconhecida... $nome seguirá como um aventureiro comum.")
    }

    println("Bem vindo, $nome!")
    println("Você está diante de uma porta antiga e trancada.")
    print("Deseja tentar abrir a fechadura com uma gazua? (Sim/Nao): ")
    val resposta = readln()

    if (resposta == "sim") {
        val dado = (1..20).random()
        println("$nome rola o dado e tira: $dado")

    
    if (dado == 1 ) {
        println("FALHA CRÍTICA! Sua gazua quebra, e o barulho aparentemente acordou algo atrás da porta... ")
    } else if (dado == 20) {
        println("ACERTO CRÍTICO! A porta abre suavemente, e um baú dourado é revelado!")
    } else if (dado >= 10) {
        println("Sucesso! Você força a porta e ela cede com um rangido, revelando um baú de madeira.")
    } else {
        println("Você tenta forçar a fechadura mas não consegue. Talvez precise de mais habilidade...")
    }
} else {
    println("$nome decide não arriscar e vira as costas para a porta.")
}
    
}