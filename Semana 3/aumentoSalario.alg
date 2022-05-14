algoritmo "aumentoSalario"
// Autor : Héctor França
// Data : 14/05/2022
var
   salario, novoSalario : real
   verificar : literal
inicio
      verificar <- "sim"

      escreval("Bem vindo ao programa de aumento de salário em 30%")
      
      enquanto ((minusc(verificar) = "sim") ou (minusc(verificar) = "s")) faca
         escreval("Insira o valor do seu salário:")
         leia(salario)

         novoSalario <- salario * 1.3

         escreval("Seu salário com o aumento de 30% é: R$", novoSalario)

         escreval("Deseja realizar novo aumento? Insira 'Sim'/'Nao'")
         leia(verificar)
         
         enquanto ((minusc(verificar) <> "sim") e (minusc(verificar) <> "s") e (minusc(verificar) <> "nao") e (minusc(verificar) <> "n")) faca
            escreval("Opção inválida.")
            escreval("Deseja realizar novo aumento? Insira 'Sim'/'Nao'")
            leia(verificar)
         fimenquanto
      fimenquanto
      
      escreval ("Obrigado por utilizar nosso sistema!")
fimalgoritmo
