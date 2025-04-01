class VirtualPet {

    // caracteristicas
    var nome = ""
    var idade = 0
    var vida = true


    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelCansaco = 0
    var nivelSujeira = 0
    var nivelPipi = 0

    //ações
    fun vivoOuMorto() {
        if (!vida) {
            println("$nome, foi para a casa de Deus")
        } else if (idade == 10) {
            println("Parabéns você ganhou!!!. $nome foi viver feliz em Curitiba")
            vida = false
        }
    }

    fun alimentar() {
        nivelDeFome -= 10
        nivelSujeira += 5
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        nivelCansaco += 10
        nivelPipi += 5
        println("$nome está brincando e se sentindo mais feliz.")

    }

    fun banheiro() {
        nivelPipi -= 30
        println("$nome, foi ao banheiro fazer sua necessidades")
    }

    fun tomarBanho() {
        nivelSujeira -= 30
        println("$nome, está limpinho agora")
    }

    fun descansar() {
        do {
            println("Quanto tempo $nome irá descansar (1-8 horas) ?")
            val tempoDescanso = readln().toIntOrNull() ?: 0

            when (tempoDescanso) {
                in 1..3 -> {
                    nivelCansaco -= 10
                    println("$nome, descansou daquele jeitão né")
                }
                in 4..6 -> {
                    nivelCansaco -= 30
                    println("$nome, descansou..")
                }
                7, 8 -> {
                    nivelCansaco = 0
                    println("$nome, está completamente renovado")
                }
                else -> {
                    println("Numero inválido informe outro paezao")
                }
            }
        } while (tempoDescanso <= 0 || tempoDescanso >= 9)

    }

    fun verificarStatus() {
        println("-----------------STATUS------------------")
        println("Status atual de $nome:")
        println("Idade atual: $idade")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço: $nivelCansaco")
        println("Nível de pipi: $nivelPipi")
        println("Nível de sujeira: ${nivelSujeira}l")
    }

    fun passarTempo() {
        if (vida) {
            nivelDeFome += 5
            nivelFelicidade -= 30
            nivelCansaco += 10
            idade += 1
            println("$nome está ficando mais faminto com o passar do tempo.")
        }
    }

    fun deuRuim() {
        if (
            nivelFelicidade == 100 ||
            nivelCansaco == 100 ||
            nivelPipi == 100 ||
            nivelSujeira == 100 ||
            nivelDeFome == 100
        ) {
            vida = false
        }
    }

}

