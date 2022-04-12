# Simple Array Sum

<a href="https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true">
  <img src="https://img.shields.io/badge/HackerRank-Desafio-green?style=for-the-badge" />
</a>

## 	:dart: Objetivo

Este desafio tem por objetivo realizar a soma dos elementos de uma dada lista.

## 	:man_technologist: Parâmetros de entrada

  * **_size_** (int): quantidade de elementos da lista.
  * As demais entradas referem-se aos elementos da lista.

## :bulb: Solução

1. Inicialmente, declara-se a variável do tipo inteiro **_sum_**, a qual armazenará a soma dos elementos da lista:

```java
int sum = 0;
```

2. Após, realiza-se um laço **_for each_**, que corresponde a um _loop for_ melhorado para iterar a lista:

```java
for (Integer number : array) {
    sum += number;
}
```

Lê-se: "Para cada inteiro **_number_** contido na lista **_array_** fazer... _(instrução)_".
Conforme a instrução dada, esse loop irá iterar a lista pegando cada elemento contido nela e somando à variável **_sum_**. Exemplo:

_Dada uma lista com 3 elementos [2, 5, 8], o resultado seria **15**:_
		
![image](https://user-images.githubusercontent.com/84636509/163020598-4a5e15d2-59b5-4cec-980f-8cec815a5b01.png)

3. Por fim, retorna-se a variável **_sum_**.
