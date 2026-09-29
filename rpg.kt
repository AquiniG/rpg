fun main() {

    val dado = (1..20).random()

    println("Você tenta abrir a fechadura de uma porta antiga com uma gazua...")
    println("Você rolou o dado e tirou: $dado")

    if (dado ==1 ) {
        println("FALHA CRÍTICA! Sua gazua quebra, e o barulho aparentemente acordou algo atrás da porta... ")
    } else if (dado == 20) {
        println("ACERTO CRÍTICO! A porta abre suavemente, e um baú dourado é revelado!")
    } else if (dado >= 10) {
        println("Sucesso! Você força a porta e ela cede com um rangido.")
    } else {
        println("Você tenta forçar a fechadura mas não consegue. Talvez precise de mais habilidade...")
    }
    
}