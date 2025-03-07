# Exercícios POO - Java ☕
### Repositório de Estudo - Programação Orientada a Objeto em Java
#### Professora:  Drª Cristina Corrêa de Oliveira

## 

### Exercício 1: Definições de POO
Crie uma classe Televisor. Essa classe deve possuir três atributos:
- canal (inicia em 1 e vai até 16)
- volume (inicia em 0 e vai até 10)
- ligado (inicia em desligado ou false)

Com os seguintes métodos:
  - aumentarVolume()
  - reduzirVolume()
  - subirCanal()
  - descerCanal()
  - ligarTelevisor()
  - desligarTelevisor()
  - mostraStatus() - dizer qual o canal, o volume e se o televisor está ligado

  Feito isto, crie uma classe principal que utilize um novo objeto do tipo Televisor e que
  deve realizar as seguintes operações:
  - Ligue o televisor;
  - Suba 5 canais;
  - Aumente o volume até o máximo;
  - Mostre o Status;
  - Desça até o primeiro canal;
  - Reduza 2 pontos no volume;
  - Mostre o Status;

##

### Exercício 2: Classes, atributos e métodos, instaciação de Objetos, entrada/saída de dados
Construir os construtores inicializando os atributos, criar um
método que aumente o volume e receba um número inteiro para ajustar o volume conforme o
argumento. O canal e o volume devem ser testados com if para não ultrapassar o valor 16 do
canal e 10 do volume. Essa atividade deve conter um menu de para escolha das opções.

### Exercício 3: Sobrecarga e Modificadores de Acesso
Crie uma classe chamada ContaBancaria, com os seguintes atributos:
- double saldo - Determina o saldo da conta.
- double limite - Determina o limite de crédito do cheque especial.
- int consultas - Determina a quantidade de vezes que o saldo foi consultado.
E os métodos:
- ContaBancaria(double valorSaldo, double valorLimite) - Construtor padrão da classe. Deve atribuir .0. ao atributo consultas.
- double getSaldo() - Retorna o saldo da conta. Deve incrementar o atributo consultas.
- void setSaldo(double valor) - Configura o saldo da conta.
- double getLimite() - Retorna o limite da conta.
- void setLimite(double valor) - Configura o limite da conta.
- double getSaldoComLimite() - Retorna o saldo da conta somado ao limite. Deve incrementar o atributo consultas.
- int getConsultas() - Retorna a quantidade de consultas feitas ao saldo.