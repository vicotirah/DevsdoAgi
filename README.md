# Devs do Agi 🚀👩‍💻

## Aula 1 - Algoritmos (22/01) 🧩
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

## Aula 2 -  Algoritmos (23/01) 🧩
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
## Aula 3 - Fluxograma (24/01) 🧩
### Maratona 
**1)C**
```portugol
```
**6) Cálculo de Taxas Bancárias: Leia o saldo inicial de uma conta e calcule a taxa de manutenção (1% do saldo, mínimo de R$10). Exiba o saldo final após a taxa**
```portugal
```
**7)Verificação de Limite de Saque: Leia o saldo de um saque.**


