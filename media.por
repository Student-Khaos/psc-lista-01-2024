programa {
  inteiro b1, b2, b3, b4, soma
  real media
  


  funcao inicio() {
    escreva("Digite a nota do primeiro bimestre: ")
    leia(b1)

    limpa()

    escreva("Digite a nota do segundo bimestre: ")
    leia (b2)

    limpa()

    escreva("Digite a nota do terceiro bimestre: ")
    leia(b3)

    limpa()

    escreva("Digite a nota do quarto bismestre: ")
    leia(b4)

    soma = b1 + b2 + b3 + b4
    media = soma / 4

    limpa()

    escreva("A média do seu bimestre esse ano foi: ", media)

  }
}