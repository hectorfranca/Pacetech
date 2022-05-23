algoritmo "aumentoSalario"
// Autor : Héctor França
// Data : 14/05/2022
var
   salario, novoSalario : real
   verificar : literal
inicio
      verificar <- "sim"
      verificar <- minusc(verificar)

      escreval("Bem vindo ao programa de aumento de salário em 30%")

      enquanto ((verificar = "sim") ou (verificar = "s")) faca
         escreval("Insira o valor do seu salário:")
         leia(salario)

         novoSalario <- salario * 1.3

         escreval("Seu salário com o aumento de 30% é: R$", novoSalario)

         escreval("Deseja realizar novo aumento? Insira 'Sim'/'Nao'")
         leia(verificar)
         verificar <- minusc(verificar)

         enquanto ((verificar <> "sim") e (verificar <> "s") e (verificar <> "nao") e (verificar <> "n")) faca
            escreval("Opção inválida.")
            escreval("Deseja realizar novo aumento? Insira 'Sim'/'Nao'")
            leia(verificar)
            verificar <- minusc(verificar)
         fimenquanto
      fimenquanto

      escreval ("Obrigado por utilizar nosso sistema!")
fimalgoritmo
