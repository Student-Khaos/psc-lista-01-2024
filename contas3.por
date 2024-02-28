programa {
  inteiro x, y
  inteiro soma, mult, sub
  


  funcao inicio() {
    escreva("Digite um número: ")
    leia(x)

    limpa()

    escreva("Digite mais um número: ")
    leia (y)

    sub = x - y
    soma = x + y
    mult = x * y

    limpa()

    escreva("A soma de ", x, " + ", y, " = ", soma, "\n")
    escreva("A subtração de ", x, " - ", y, " = ", sub, "\n")
    escreva("A multiplicação de ", x, " x ", y, " = ", mult, "\n")

  }
}