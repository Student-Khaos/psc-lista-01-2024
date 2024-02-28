programa {
  
  cadeia nome
  real valor, vendido, pagamento
  


  funcao inicio() {
    escreva("Qual é o valor do litro da gasolina? ")
    leia(valor)

    limpa()

    escreva("Qual o nome do cliente que deseja consultar? ")
    leia (nome)

    limpa()

    escreva("Quantos litros foi vendido a esse cliente? ")
    leia(vendido)

    pagamento = (vendido * valor) 

    limpa()

    escreva("O valor que o/a ", nome, " deve pagar é: ", pagamento, " reais.")
    

  }
}