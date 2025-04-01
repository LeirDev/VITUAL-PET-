# Virtual Pet

## Descrição
Simulador de animal de estimação virtual com atributos e comportamentos interativos que evoluem ao longo do tempo.

Este projeto foi desenvolvido no **PROA** como parte do aprendizado de **Programação Orientada a Objetos (POO)**, explorando conceitos fundamentais e métodos.

---

## Atributos do Pet
- **Nome**: Identificação do bichinho virtual.
- **Fome**: Nível de fome (quanto maior, mais fome).
- **Felicidade**: Nível de felicidade (quanto maior, mais feliz).
- **Cansaço**: Nível de cansaço (aumenta ao brincar).
- **Idade**: Idade do bichinho (aumenta com o tempo).

---

## Comportamentos (Métodos)
- **Alimentar**: Reduz o nível de fome.
- **Brincar**: Aumenta o nível de felicidade, mas aumenta o cansaço.
- **Descansar**: Reduz o nível de cansaço.
- **Verificar Status**: Exibe Nome, Idade, Fome, Felicidade e Cansaço.

---

## Regras do Jogo
1. O objetivo é alcançar a idade **50**.
2. Se o nível de **fome** ou **cansaço** chegar a 100, o jogador perde.
3. Felicidade não pode cair a **0**, ou o jogador perde.
4. A cada dia:
   - **Fome** e **Cansaço** aumentam.
   - **Felicidade** diminui.
   - **Idade** aumenta.

---

## Sugestões de Melhorias
- Descanso completo em 8 horas.
- Medidor de **sujeira** (aumenta ao brincar).
- Medidor de **vontade de ir ao banheiro** (aumenta ao alimentar).
- Perdas relacionadas à sujeira ou necessidade extrema de banheiro.

---
