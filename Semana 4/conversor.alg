algoritmo "conversor"
// Autor : Héctor França
// Data : 23/05/2022

// Funções
funcao realParaDolar(valorReal, cotacaoDolar : real) : real
inicio
retorne valorReal / cotacaoDolar
fimfuncao

funcao dolarParaReal(valorDolar, cotacaoDolar : real) : real
inicio
retorne valorDolar * cotacaoDolar
fimfuncao

funcao celciusParaFahrenheit(celcius : real) : real
inicio
retorne (celcius * 1.8) + 32
fimfuncao

funcao fahrenheitParaCelcius(fahrenheit : real) : real
inicio
retorne (fahrenheit - 32) * 1.8
fimfuncao

funcao validaOpcao(opcao : literal) : logico
inicio
se ((opcao <> "1") e (opcao <> "2")) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

funcao validaRepetir(repetir : literal) : logico
inicio
se ((repetir <> "sim") e (repetir <> "s") e (repetir <> "nao") e (repetir <> "n")) entao
   retorne falso
senao
   retorne verdadeiro
fimse
fimfuncao

// Procedimentos
procedimento realParaDolarProc
inicio
escreval("Insira o valor em Real:")
leia(valorReal)
escreval(valorReal," reais são ",realParaDolar(valorReal, cotacaoDolar)," dolares.")
fimprocedimento

procedimento dolarParaRealProc
inicio
escreval("Insira o valor em Dolar:")
leia(valorDolar)
escreval(valorDolar," dolares são ",dolarParaReal(valorDolar, cotacaoDolar)," reais.")
fimprocedimento

procedimento celciusParaFahrenheitProc
inicio
escreval("Digite o valor em Celcius:")
leia(celcius)
escreval(celcius," celcius são ",celciusParaFahrenheit(celcius)," fahrenheit.")
fimprocedimento

procedimento fahrenheitParaCelciusProc
inicio
escreval("Digite o valor em Fahrenheit:")
leia(fahrenheit)
escreval(fahrenheit," fahrenheit são ",fahrenheitParaCelcius(fahrenheit)," celcius.")
fimprocedimento

procedimento conversaoMoedaProc
inicio
escreval("Insira a cotação do dolar:")
leia(cotacaoDolar)
escreval("1- Real para Dolar")
escreval("2- Dolar para Real")
escreval("Insira o valor correspondente a opção desejada:")
leia(opcao)
verificaOpcao
escolha(opcao)
caso "1"
   realParaDolarProc
caso "2"
   dolarParaRealProc
fimescolha
fimprocedimento

procedimento conversaoTemperaturaProc
inicio
escreval("1- Celcius para Fahrenheit")
escreval("2- Fahrenheit para Celcius")
escreval("Insira o valor correspondente a opção desejada:")
leia(opcao)
verificaOpcao
escolha(opcao)
caso "1"
   celciusParaFahrenheitProc
caso "2"
   fahrenheitParaCelciusProc
fimescolha
fimprocedimento

procedimento verificaOpcao
inicio
enquanto (validaOpcao(opcao) = falso) faca
   escreval("Opção inválida.")
   escreval("Insira o valor correspondente a opção desejada: '1'/'2')")
   leia(opcao)
fimenquanto
fimprocedimento

procedimento verificaRepetir
inicio
enquanto (validaRepetir(repetir) = falso) faca
   escreval("Opção inválida.")
   escreval("Deseja realizar outra conversão? 'Sim'/'Nao')")
   leia(repetir)
fimenquanto
fimprocedimento

// Main
var
celcius : real
fahrenheit : real
valorReal : real
valorDolar : real
cotacaoDolar : real
opcao : literal
repetir : literal

inicio
repita
   escreval("Programa de Conversões:")
   escreval("1- Conversão de Moeda")
   escreval("2- Conversão de Temperatura")
   escreval("Insira o valor correspondente a opção desejada:")
   leia(opcao)
   verificaOpcao
   escolha(opcao)
   caso "1"
      conversaoMoedaProc
   caso "2"
      conversaoTemperaturaProc
   fimescolha
   escreval("Deseja realizar outra conversão? 'Sim'/'Nao')")
   leia(repetir)
   repetir <- minusc(repetir)
   verificaRepetir
ate (repetir <> "sim") e (repetir <> "s")

fimalgoritmo
