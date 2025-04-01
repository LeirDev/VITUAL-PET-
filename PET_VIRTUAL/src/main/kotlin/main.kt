
fun main() {

    val pet = VirtualPet()
    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    pet.nome = readln()



    while (pet.vida) {
        println("\nEscolha uma ação:")
        println("1. Alimentar ${pet.nome}")
        println("2. Brincar com ${pet.nome}")
        println("3. Levar ${pet.nome} ao banheiro")
        println("4. Levar ${pet.nome} para tomar uma ducha")
        println("5. Levar ${pet.nome} para dormir")
        println("6. Ver status")
        println("7. Sair..")

        when (readln().toIntOrNull() ?: continue) {

            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.banheiro()
            4 -> pet.tomarBanho()
            5-> pet.descansar()
            6-> pet.verificarStatus()
            7 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha inválida. Tente novamente.")
        }
        pet.deuRuim()
        pet.vivoOuMorto()
        pet.passarTempo() // Simula o tempo que passa após cada ação
    }

}