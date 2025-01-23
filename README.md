# Devs do Agi 


## Aula 1 - Algoritmos e Fluxogramas (22/01)
Atividade 1:

```portugol
Inicio
  Escreva "Digite sua idade:"
  Leia idade
  Se idade >= 18 então
    Escreva "Idade Suficiente"
  Senão 
    Escreva "Idade Insuficiente"
```

Atividade 2:
Atividade 3:


## Aula 2 -  Algoritmos e Fluxogramas (23/01)
**Atividade 1: Crie um algoritmo em Portugol para calcular o saldo de uma conta bancária após 12 meses, com um depósito mensal fixo**
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

**Atividade 2: Crie um algotirmo em Portugol para calcular o saldo de uma conta bancária com depósito mensal variável**
```portugol
Inicio
  Escreva "O valor inicial do saldo"
  Leia saldo

  inteiro i 	
  Para i de 0 até 11 faça
    Escreva "Insira o valor do depósito do mês [i]"
    Leia dp_mensal
    saldo = saldo + dp_mensal
  FimPara

  Escreva "Seu saldo final é:", saldo_final
Fim
```

**Atividade 3: Crie um algoritmo em Portugol para calcular o valor total do investimento, considerando uma aplicação inicial de R$1000,00 e depósitos variáveis ao longo de 12 meses. Considere uma taxa de rentabilidade mensal de 0,5%**
```portugol
Inicio
  aplicação = 1000,00
  taxa = 0,005
  saldo = aplicação
  
  inteiro i
  Para i de 1 até 12 faça
    Escreva "Insira o valor do depósito do mês [i]"
    Leia dp_mensal
    saldo = saldo + saldo * taxa
    saldo = saldo + dp_mensal
  FimPara
Fim
```



