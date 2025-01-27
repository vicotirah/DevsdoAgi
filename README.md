# Devs do Agi 🚀👩‍💻

## Algorimos 🧩
### Aula 1 - 22/01
**1) Crie um algoritmo em Portugol para verificar se um cliente tem idade suficiente para abrir uma conta bancária (idade mínima: 18 anos)**
```portugol
Inicio
  Escreva "Digite sua idade:"
  Leia idade
  Se idade >= 18 então
    Escreva "Idade Suficiente"
  Senão 
    Escreva "Idade Insuficiente"
  FimSe
Fim
```
**2) Crie um algoritmo em Portugol para calcular e mostrar para o cliente o limite da conta, através do seu saldo. O limite de conta deverá ser 20% do seu saldo**
```portugol
Inicio
  Escreva "Insira seu saldo"
  Leia saldo
  Se saldo>0 então
    Real saldo_limite = saldo *0,2
    Escreva "Seu limite é: ", saldo_limite
  Senão
    Escreva "Não há limite liberado"
  FimSe
Fim
```
**3) Crie um algoritmo em Portugol que verifique  se o cliente consegue abrir o novo empréstimo. Para conseguir um novo empréstimo, o valor do empréstimo deve ser menor que 40% da sua média de saldo dos últimos 12 meses. Entre com o valor desejado do empréstimo e com a média do saldo**
```portugol
Inicio
  Escreva "Insira a média do saldo: "
  Leia media_saldo
  Escreva "Insira o valor de empréstimo desejado"
  Leia valor_desejado
  Se valor_desejado <= (media_saldo*0.4) então
    Escreva "Empréstimo aprovado!"
  Senão
    Escreva "Empréstimo negado"
  FimSe
Fim
```
##
### Aula 2 - 23/01
**1) Crie um algoritmo em Portugol para calcular o saldo de uma conta bancária após 12 meses, com um depósito mensal fixo**
```portugol
Inicio
  Escreva "O valor inicial do saldo"
  Leia saldo_inicial
  Escreva "Insira o valor do depósito mensal fixo: "
  Leia dp_mensal
  saldo_final = saldo_inicial
	
  inteiro i 	
  Para i de 1 até 12 faça
    saldo_final = saldo_final + dp_mensal
  FimPara

  Escreva "Seu saldo final é:", saldo_final
Fim
```

**2) Crie um algotirmo em Portugol para calcular o saldo de uma conta bancária com depósito mensal variável**
```portugol
Inicio
  Escreva "O valor inicial do saldo"
  Leia saldo

  inteiro i 	
  Para i de 1 até 12 faça
    Escreva "Insira o valor do depósito do mês " + i + " : "
    Leia dp_mensal
    saldo = saldo + dp_mensal
  FimPara

  Escreva "Seu saldo final é:" + saldo_final
Fim
```

**3) Crie um algoritmo em Portugol para calcular o valor total do investimento, considerando uma aplicação inicial de R$1000,00 e depósitos variáveis ao longo de 12 meses. Considere uma taxa de rentabilidade mensal de 0,5%**
```portugol
Inicio
  aplicação = 1000,00
  taxa = 0,005
  saldo = aplicação
  
  inteiro i
  Para i de 1 até 12 faça
    Escreva "Insira o valor do depósito do mês " + i + " : "
    Leia dp_mensal
    saldo = (saldo * (1 + taxa)) + dp_mensal
  FimPara
  Escreva "Saldo Final: R$" + saldo
Fim
```
## Fluxograma 🧩
### Aula 3 - 24/01
### Esquenta
**1) Cálculo de Juros: Leia o valor de um empréstimo, a taxa de juros mensal e o número de meses. Calcule e exiba o valor dos juros simples**
```portugol
Início
  Escreva "Insira o valor do emprestimo"
  Leia emprestimo
  taxa = 0,005
  Escreva "Insira a quantidade de parcelas"
  Leia mes
  valor_juros = (emprestimo/mes) * taxa
  valorParcela = emprestimo/mes + valor_juros	
  Escreva "valor do juros simples: + valor_juros
Fim
```
**2) Saldo Final Após Depósito: Leia o saldo inicial de uma conta bancária e um valor de depósito, exibindo o saldo final após o depósito**
```portugol
Início
  Escreva "Insira o saldo inicial"
  Leia saldo_i
  Escreva "Insira o valor de depósito"
  Leia deposito
  saldo_f = saldo_i + deposito
  Escreva "O saldo final é:" + saldo_f
Fim
```
**3) Verificação de Crédito: Leia o salário de uma pessoa e o valor de empréstimo solicitado. Exiba se o crédito pode ser aprovado (empréstimo <= 30% do salário)**
```portugol
Início
  Escreva "Insira o salario"
  Leia salario
  Escreva "Insira o valor do empréstimo"
  Leia empr
  Se empr <= (salario*0.3) então
    Escreva "Crédito aprovado!"
  Senão
    Escreva "Crédito negado!"
  FimSe
Fim
```
**4) Conversão de Moeda: Leia o valor em reais e a cotação atual do dólar, convertendo o valor para dólares e exibindo o resultado**
```portugol
Início
  Escreva "Insira o valor em reais: "
  Leia real
  dolar = 5.92
  conversao = real/dolar
  Escreva "O valor R$" + real + "é $" + conversao
Fim
```
**5) Cálculo de Rendimento de Investimento: Leia o valor de um investimento inicial, a taxa de rendimento mensal, e o número de meses. Calcule e exiba o valor final do investimento**
```portugol
Início
  Escreva "Insira o valor inicial investido"
  Leia investimento_i
  taxa_rend = 0.005
  Escreva "Insira a quantidade de meses"
  Leia meses
  valor_f = investimento_i
  inteiro i
  Para i de 1 até meses faça 
    valor_f = valor_f * (1 + taxa_rend)
  FimPara
  Escreva "O valor final é: R$" + valor_f
Fim
```
**6) Cálculo de Taxas Bancárias: Leia o saldo inicial de uma conta e calcule a taxa de manutenção (1% do saldo, mínimo de R$10). Exiba o saldo final após a taxa**
```portugol
Início
  Leia saldo
  taxa = 0.001
  calculo = saldo*0.001
  Se (saldo* 0.001) > 10 então
    saldo_f = saldo - calculo 
  Senão 
    saldo_f = saldo - 10
  FimSe
  Escreva "O saldo é:" + saldo_f
Fim
```
**7) Verificação de Limite de Saque: Leia o saldo de uma conta e o valor de um saque. Exiba se o saque é permitido (saldo>= valor do saque).**
```portugol
Início
  Leia o saldo
  Escreva "Qual o valor do saque?"
  Leia saque
  Se saldo >= saque então
    Escreva "Saque liberado"
  Senão 
    Escreva "Saque negado"
  FimSe
Fim
```
**8) Simulação de Pagamento Parcelado: Leia o valor de uma compra e o número de parcelas, calculando o valor de cada parcela e exibindo o total pago com juros de 2% ao mês**
```portugol
Início
  Escreva "Valor da compra:"
  Leia valor_compra
  Escreva "Número de parcelas:"
  Leia parc

  inteiro i 
  para i em 1 até parc faça
    valor_final = valor_final + (valor_compra/parc) * 0.02
  FimPara
  Escreva "Valor total" + valor_final
Fim
```
**9) Análise de Perfil de Crédito: Leia o salário e as despesas mensais de uma pessoa. Calcule a margem de crédito (salário-despesa) disponível e exiba se é seguro conceber um empréstimo**
```portugol
```
**10) Cálculo de Rendimentos Acumulados: Simule o crescimento do saldo de uma conta com depósitos fixos e rendimentos mensais considerando um período de 12 meses. Exiba o saldo final.**
```portugol
```
##
### Maratona 
