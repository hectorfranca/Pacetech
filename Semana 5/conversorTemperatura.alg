algoritmo "conversorTemperatura"
// Autor : Héctor França
// Data : 30/05/2022

// Funções
funcao celsiusParaFahrenheit(celsius : real) : real
inicio
retorne (celsius * 1.8) + 32
fimfuncao

funcao fahrenheitParaCelsius(fahrenheit : real) : real
inicio
retorne (fahrenheit - 32) * 1.8
fimfuncao

funcao validarOpcao(opcao : literal) : logico
inicio
se ((opcao <> "1") e (opcao <> "2")) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

funcao validarHorario(horario : real) : logico
inicio
se ((horario < 0) ou (horario > 24)) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

funcao validarRepetir(repetir : literal) : logico
inicio
se ((repetir <> "sim") e (repetir <> "s") e (repetir <> "nao") e (repetir <> "n")) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

// Procedimentos
procedimento apresentarMenuProc
inicio
escreval("Conversor de temperatura:")
escreval("1- Celsius para Farenheit")
escreval("2- Fahrenheit para Celsius")
escreval("Insira o valor correspondente a opção desejada:")
leia(opcao)
verificarOpcaoProc
fimprocedimento

procedimento verificarHorarioProc
inicio
enquanto (validarHorario(temperaturas[i, 2]) = falso) faca
   escreval("Horário inválido. O horário deve ser entre 0h e 24h.")
   escreval("Digite a hora em que foi registrada:")
   leia(temperaturas[i, 2])
fimenquanto
fimprocedimento

procedimento celsiusParaFahrenheitProc
inicio
escreval("Digite a temperatura em Celsius:")
leia(temperaturas[i, 1])
escreval("Digite a hora em que foi registrada:")
leia(temperaturas[i, 2])
verificarHorarioProc
temperaturas[i, 3] <- celsiusParaFahrenheit(temperaturas[i, 1])
fimprocedimento

procedimento fahrenheitParaCelsiusProc
inicio
escreval("Digite a temperatura em Fahrenheit:")
leia(temperaturas[i, 1])
escreval("Digite a hora em que foi registrada:")
leia(temperaturas[i, 2])
verificarHorarioProc
temperaturas[i, 3] <- fahrenheitParaCelsius(temperaturas[i, 1])
fimprocedimento

procedimento ordenarVetor
var
i : inteiro
j : inteiro
c : inteiro
aux : vetor[1..3] de real
inicio
para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se temperaturas[i, 1] < temperaturas[j, 1] entao
         para c de 1 ate 3 faca
            aux[c] <- temperaturas[i, c]
         fimpara
         para c de 1 ate 3 faca
            temperaturas[i, c] <- temperaturas[j, c]
         fimpara
         para c de 1 ate 3 faca
            temperaturas[j, c] <- aux[c]
         fimpara
      fimse
   fimpara
fimpara
fimprocedimento

procedimento exibirCelsiusParaFahrenheitProc
var
i : inteiro
inicio
para i de 1 ate 4 faca
   escreval("Temperatura",temperaturas[i, 1]," graus Fahrenheit, registrada as",temperaturas[i, 2],"h a",temperaturas[i, 3]," graus Celsius.")
fimpara
fimprocedimento

procedimento exibirFahrenheitParaCelsiusProc
var
i : inteiro
inicio
para i de 1 ate 4 faca
   escreval("Temperatura",temperaturas[i, 1]," graus Celsius, registrada as",temperaturas[i, 2], "h a",temperaturas[i, 3]," graus Fahrenheit.")
fimpara
fimprocedimento

procedimento verificarOpcaoProc
inicio
enquanto (validarOpcao(opcao) = falso) faca
   escreval("Opção inválida.")
   escreval("Insira o valor correspondente a opção desejada: '1'/'2')")
   leia(opcao)
fimenquanto
fimprocedimento

procedimento verificarRepetirProc
inicio
enquanto (validarRepetir(repetir) = falso) faca
   escreval("Opção inválida.")
   escreval("Deseja realizar outra conversão? 'Sim'/'Nao')")
   leia(repetir)
fimenquanto
fimprocedimento

// Main
var
temperaturas : vetor[1..4, 1..3] de real
i : inteiro
opcao : literal
repetir : literal

inicio
repita
   apresentarMenuProc
   escolha(opcao)
   caso "1"
      para i de 1 ate 4 faca
         celsiusParaFahrenheitProc
      fimpara
      ordenarVetor
      exibirCelsiusParaFahrenheitProc
   caso "2"
      para i de 1 ate 4 faca
         fahrenheitParaCelsiusProc
      fimpara
      ordenarVetor
      exibirFahrenheitParaCelsiusProc
   fimescolha
   escreval("Deseja realizar outra conversão? 'Sim'/'Nao')")
   leia(repetir)
   repetir <- minusc(repetir)
   verificarRepetirProc
ate (repetir <> "sim") e (repetir <> "s")

fimalgoritmo
