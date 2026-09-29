fun main() {

    println("Digite o nome do seu personagem: ")
    val nome = readln()

    println("Escolha a sua classe (Guerreiro/Ladino/Mago): ")
    val classe = readln()

    var vida = 20 

    println("=== Ficha do Personagem===")
    println("Nome: $nome")
    println("Classe: $classe")
    println("Vida: $vida")
    println("===========================")

    if (classe == "Ladino") {
        println("$nome carrega um conjunto de gazuas, ideal para abrir fechaduras, e duas adagas muito afiadas.")
    } else if (classe == "Guerreiro") {
        println("$nome carrega uma massiva espada, forte o suficiente para amassar seus inimigos e algumas portas.")
    } else if (classe == "Mago") {
        println("$nome carrega um grimório que pode conter diversos feitiços, mas no momento apenas um.")
    } else {
        println("Classe desconhecida... $nome seguirá como um aventureiro comum.")
    }

    println("$nome está diante de uma enorme porta antiga de metal, que está trancada.")
    print("Deseja tentar abrir a porta? (Sim/Nao): ")
    val respostaPorta = readln()

    if (respostaPorta == "Sim") {
        val dadoPorta = (1..20).random()
        println("$nome rola o dado e tira: $dadoPorta")

    
    if (dadoPorta == 1 ) {
        println("FALHA CRÍTICA! A porta desaba sem motivo aparente, e o barulho acordou algo na escuridão... ")
    } else if (dadoPorta == 20) {
        println("ACERTO CRÍTICO! $nome abre a porta abre suavemente, e um baú dourado é revelado!")
    } else if (dadoPorta >= 10) {
        println("Sucesso! $nome força a porta e ela cede com um rangido, revelando um baú de madeira.")
    } else {
        println("$nome tenta forçar a porta mas ela não se move nem um palmo.")
    }
}

    println("")
    println("Além da porta, uma rosnada aparentemente de um cachorro com os olhos brilhando na escuridão... ")
    print("Deseja enfrentá-lo? (Sim/Não): ")
    val respostaCao = readln()

    if (respostaCao == "Sim") {
        val dadoCombate = (1..20).random()
        println("$nome ataca! Um cão amaldiçoado apareceu! Rolagem: $dadoCombate")

        if (dadoCombate == 1) {
            println("FALHA CRÍTICA! O cão avança com um pulo rápido e crava suas presas no pescoço de $nome!")
            vida = vida - 20
        } else if (dadoCombate == 20) {
            println("ACERTO CRÍTICO! O cão leva apenas um golpe para morrer instantaneamente.")
        } else if (dadoCombate >= 10) {
            println("$nome acerta o cão, mas ele resiste e se prepara para revidar.")
            vida = vida -3
        } else {
            println("$nome errou o golpe! O cão se aproveita da situação!")
            vida = vida - 10
        }

        println("Vida atual de $nome: $vida")

        if (vida <= 0) {
            println("Você morreu... mas a chama ainda pode se reacender...")
        }
    } else {
        println("$nome recua, deixando o cão para trás.")
    }  
}