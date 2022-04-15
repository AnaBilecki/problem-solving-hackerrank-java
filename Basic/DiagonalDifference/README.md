# Diagonal Difference

<a href="https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true">
  <img src="https://img.shields.io/badge/HackerRank-Desafio-green?style=for-the-badge" />
</a>

## 	:dart: Objetivo

Este desafio tem por objetivo calcular a diferença entre a soma dos elementos da diagonal principal e a soma dos elementos da diagonal secundária de uma matriz de ordem _n_.

## 	:man_technologist: Parâmetros de entrada

  * **_n_**: número inteiro que representa a ordem da matriz;
  * As demais entradas referem-se aos elementos da matriz.

## :bulb: Solução

1. Inicialmente, são declaradas duas variáveis do tipo inteiro: 
  * **_rightSum_** para armazenar a soma dos elementos da diagonal secundária;
  * **_leftSum_** para armazenar a soma dos elementos da diagonal principal.

```java
int rightSum = 0;
int leftSum = 0;
```

2. Após, utiliza-se um laço _for_ para efetuar as somas dos elementos das diagonais. Dessa forma:

```java
for (int i = 0; i < array.size(); i++) {
    leftSum += array.get(i).get(i);
    rightSum += array.get(i).get(array.size() - (1 + i));
}
```

Como exemplo, considere a matriz de ordem 3 na qual cada elemento **_a_** possui os índices **_i_** e **_j_** representando, 
respectivamente, a linha e a coluna nas quais ele se encontra. As diagonais são:

![image](https://user-images.githubusercontent.com/84636509/163481116-bfe1e272-f41b-473d-8408-6e3cccc39f41.png)

Nesse cenário, o inteiro _i_ do laço _for_ irá assumir os valores 0, 1 e 2, representando as linhas da matriz. Como a diagonal principal é formada pelos elementos que possuem índices iguais (**_i = j_**) 
a variável **_leftSum_** receberá os elementos presentes nas posições 00, 11, e 22.
A diagonal secundária é composta pelos elementos que possuem como índice **_i_** os mesmos valores do inteiro _i_ do laço _for_ (0, 1 e 2) e como índice **_j_** a ordem da matriz subtraída de 1 (pelo fato dos índices iniciarem em 0) e subtraída do índice da linha (_i_).
Dessa forma, a variável **_rightSum_** receberá os elementos presentes nas posições 02, 11 e 20.

3. Por fim, calcula-se a diferença entre os resultados das somas e retorna-se o valor obtido:

```java
return Math.abs(leftSum - rightSum);
```

