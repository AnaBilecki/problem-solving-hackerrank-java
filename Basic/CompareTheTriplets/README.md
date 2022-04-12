# Compare The Triplets

<a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true">
  <img src="https://img.shields.io/badge/HackerRank-Desafio-green?style=for-the-badge" />
</a>

## 	:dart: Objetivo

Este desafio tem por objetivo comparar os elementos de duas listas que contêm avaliações dadas para os desafios criados por Alice e Bob e, com base nos critérios definidos no enunciado do problema, calcular a pontuação atingida por cada um.

## 	:man_technologist: Parâmetros de entrada

  * **Primeira entrada**: 3 números inteiros correspondentes às avaliações do problema criado por Alice.
  * **Segunda entrada**: 3 números inteiros correspondentes às avaliações do problema criado por Bob.

## :bulb: Solução

1. Inicialmente, declaram-se as variáveis do tipo inteiro **_pointsAlice_** e **_pointsBob_**, as quais armazenarão os pontos recebidos:

```java
int pointsAlice = 0;
int pointsBob = 0;
```

2. Declara-se também uma lista de inteiros **_scores_** que conterá as pontuações finais de Alice e Bob, respectivamente:

```java
List<Integer> scores = new ArrayList<>();
```

3. Após, por meio do uso de um laço _for_, iniciando de 0 até 3, percorre-se os elementos das listas comparando-os. Caso a avaliação recebida por Alice seja maior do que a recebida por Bob, Alice recebe 1 ponto.
Porém, caso ela seja menor do que a de Bob, Bob recebe 1 ponto. Caso sejam iguais, ninguém recebe ponto. Dessa forma:

```java
for (int i = 0; i < 3; i++) {
  if (alice.get(i) > bob.get(i)) {
    pointsAlice++;
  } else if (alice.get(i) < bob.get(i)) {
    pointsBob++;
  }
}
```

4. Por fim, adicionam-se os totais de pontos de ambos na lista **_scores_** e retorna-se a mesma.

