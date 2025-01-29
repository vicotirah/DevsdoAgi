# Devs do Agi 🚀👩‍💻

<details open>
<summary><h2>Links Importantes 🌐</h2></summary>
🔗Documentação Oficial: <a href="https://docs.oracle.com/javase/tutorial/java/index.html">Documentação em Inglês</a> <br>
🔗HackerRank - Java: <a href="https://www.hackerrank.com/domains/java">HackerRank</a><br>
🔗Site Exercism: <a href="https://exercism.org">Exercism</a> <br />
</details>

##

<details open>
<summary><h2>Algoritmos 🧩</h2></summary>
<details>
<summary><h3>Exercícios - Estruturas Condicionais</summary></h3>
	
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

</details>


<details>
<summary><h3>Exercícios - Estruturas de Repetição</summary></h3>

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
</details>
</details>

##

<details open>
<summary><h2>Fluxograma 🧩</h2></summary>

<details>
<summary><h3>Esquenta 🏋️‍♀️🏋️‍♂️🏋</h3></summary>

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
**9) Análise de Perfil de Crédito: Leia o salário e as despesas mensais de uma pessoa. Calcule a margem de crédito (salário-despesa) disponível e exiba se é seguro conceder um empréstimo**
```portugol
Início
  Leia salario, despesas
  margemSegura = 0.35 
  Se ((salario-despesas)/salario) <= margemSegura então
    Escreva "Empréstimo concedido!"
  Senão
    Escreva "Empréstimo negado"
  FimSe
Fim
```
**10) Cálculo de Rendimentos Acumulados: Simule o crescimento do saldo de uma conta com depósitos fixos e rendimentos mensais considerando um período de 12 meses. Exiba o saldo final.**
```portugol
Início
  Leia saldo, deposito, taxa
  inteiro i
  Para i de 1 até 12 faça
    saldo = saldo * (1 + taxa) + depósito
  FimPara
  Escreva "Saldo final:" + saldo 
```
</details>

<details>
<summary><h3>Maratona (Portugol e Fluxograma) 🏃‍♀️‍➡️🏃‍♂️‍➡️🏃‍➡️🏅</h3></summary>

### Economizando para uma Meta
**Descrição do problema:** Você está economizando dinheiro para comprar um item que custa um valor M. Cada mês, você consegue poupar uma quantia fixa S. Seu objetivo é calcular em quantos meses você alcançará o valor necessário para comprar o item. O programa deve exibir um número inteiro representando a quantidade de meses necessários para alcançar ou ultrapassar o valor M. Um número real representando o valor total economizado.
```portugol
Início
  Leia M, S
  AS = 0
  meses = 0
  Enquanto AS < M faça
    AS = AS + S
    meses = meses + 1
  FimEnquanto
  Escreva "Meses:" + meses
  Escreva "Valor economizado:" + AS
Fim
```
<img width="425" alt="image" src="https://github.com/user-attachments/assets/e6bc2dec-ea2b-4e0d-85a6-d3fa0a06cb59" />
</details>
</details>
</details>


##

<details open>
<summary><h1>Java ☕</h1></summary>
<details>
<summary><h2>Conhecendo o Java 👀</h2></summary>
<details>
<summary><h3>Hello World!</h3></summary>

```java
package com.agibank.s2exemplo1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
</details>

<details>
<summary><h3>Estruturas Condicionais</h3></summary>

**1) Crie um programa que verifique se o número digitado é positivo, negativo ou zero**
```java
package com.agibank.s2condicional.s2if1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        if (i>0) {
            System.out.println("Positive");
        } else if (i == 0){
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
```

**2) Crie um programa que verifique se o número digitado é par ou ímpar**
```java
package com.agibank.s2condicional.s2if2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        if (i%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

**3) Crie um programa que mostre a situação de um atleta de acordo com seu IMC**
```java
package com.agibank.s2condicional.s2if3;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu peso: ");
        float p = scan.nextFloat();
        System.out.print("Digite sua altura: ");
        float h = scan.nextFloat();
        scan.close();
        double imc = p/Math.pow(h , 2);

        if (imc <= 16) {
            System.out.print("IMC:" + imc + "-Magreza Severa");
        } else if ((imc > 16 ) && (imc <= 17)) {
            System.out.print("IMC:" + imc + "-Magreza Moderada");
        } else if ((imc > 17 ) && (imc <= 18.5)) {
            System.out.print("IMC:" + imc + "-Magreza Leve");
        } else if ((imc > 18.5 ) && (imc <= 25)) {
            System.out.print("IMC:" + imc + "-Saudável");
        } else if ((imc > 25 ) && (imc <= 30)) {
            System.out.print("IMC:" + imc + "-Sobrepeso");
        } else if ((imc > 30 ) && (imc <= 35)) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 1");
        } else if ((imc > 35 ) && (imc <= 40)) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 2");
        } else if (imc > 40 ) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 3");
        }

    }
}
```

**4) Crie um programa que verifique o quanto um valor se aproxima da média em percentual. Entre com o valor e com a média**
```java
package com.agibank.s2condicional.s2if4;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        float media, valor, porcentagem;

        System.out.print("Digite a média: ");
        media = scan.nextFloat();
        System.out.print("Digite o valor: ");
        valor = scan.nextFloat();
        scan.close();
        porcentagem = Math.abs(((valor-media)/media)*100);

        System.out.printf("Média: %.2f\nValor: %.2f\nPercentual: %.2f%%", media, valor, porcentagem);

    }
}
```

**5) Crie um programa que mostre a situação de um aluno, através de sua nota final. <br> Aprovado: 6 ou mais; <br> Exame: 4 ou mais e menor que 6; <br> Reprovado: menor que 4**
```java
package com.agibank.s2condicional.s2if5;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite a nota do aluno: ");
        float n = scan.nextFloat();
        scan.close();

        if (n >=6) {
            System.out.print("Aprovado");
        } else if ((n >= 4 ) && (n < 6)) {
            System.out.print("Recuperação");
        } else{
            System.out.print("Reprovado");
        }
    }
}
```

**6) Um cliente deseja escolher o tipo de investimento a ser feito: CDB, CDI, Tesouro Direto, FII. Faça um programa que permita ao usuário fazer esta escolha. Dê a mensagem de acordo com o investimento escolhido**
```java
package com.agibank.s3condicional.s3switch1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int op;

        System.out.print("Menu:\n1-CDB\n2-CDI\n3-Tesouro\n4-FII\nDigite a opção desejada: ");
        op = scan.nextInt();
        scan.close();

        switch (op){
            case 1:
                System.out.print("Investimento: CDB");
                break;
            case 2:
                System.out.print("Investimento: CDI");
                break;
            case 3:
                System.out.print("Investimento: Tesouro Direto");
                break;
            case 4:
                System.out.print("Investimento: FII");
                break;
            default:
                System.out.print("Insira uma opção válida");
        }
    }
}
```

**7) Um banco precisa de uma ferramenta para saber o nível de satisfação de atendimento do cliente (de zero a 5). Desenvolva uma solução computacional para resolver esta necessidade. Mostre mensagens coerentes com as avaliações dadas**
```java
package com.agibank.s3condicional.s3switch2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int op;

        System.out.print("Pesquisa de satisfação!\n0-Péssimo\n1-Muito Ruim\n2-Ruim\n" +
                "3-Regular\n4-Bom\n5-Ótimo\nDigite a opção desejada: ");
        op = scan.nextInt();
        scan.close();

        switch (op){
            case 0:
                System.out.print("Péssimo - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 1:
                System.out.print("Muito Ruim - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 2:
                System.out.print("Ruim - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 3:
                System.out.print("Regular - Obrigado por responder a pesquisa! Trabalharemos para melhorar nossos serviços");
                break;
            case 4:
                System.out.print("Bom - Obrigado por responder a pesquisa! Ficamos felizes!");
                break;
            case 5:
                System.out.print("Muito Bom - Obrigado por responder a pesquisa! Ficamos felizes!");
                break;
            default:
                System.out.print("Insira uma opção válida");
        }
    }
}
```
</details>
<details>
<summary><h3>Estruturas de Repetição</h3></summary>



</details>


</details>


