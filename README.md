# README

# Organização do Documento
	- Introdução
	- Autores 
	- Compilação
	- Execução 
	- Resumo do Projeto
	- Implementação do Algoritmo


# Introdução

Este projeto foi realizado no âmbito da Unidade Curricular de Lógica Computacional, do terceiro ano da licenciatura em Engenharia Informática, da Universidade da Beira Interior.

## Autores

Nome: Nuno Marques
Nº: 38958
Turno: PL2

Nome: Tomás Vicente
Nº: 39067
Turno: PL2

## Compilação

Para compilar este projeto, recorremos ao comando:

```bash
javac -encoding utf8 Main.java
```

## Execução

Para executar o projeto, recorremos ao comando:

```bash
java -Xmx64M -Xss32M -classpath . Main
```

## Resumo do Projeto

O objetivo deste projeto é implementar o **Algoritmo de Horn**.
Dada uma fórmula, o programa deverá verificar se é formula de Horn e:
	- Se é fórmula de Horn, deverá determinar e indicar se a fórmula é possível ou contraditória.
	- Se não é fórmula de Horn, deverá indicar que o algoritmo não é aplicável.


## Implementação do Algoritmo

Primeiramente verificamos se o input já foi todo lido, através de um ciclo while, onde a condição de paragem é: se a string lida, for vazia, então não há mais input para ler.

As demais funções, abaixo expostas foram as funções secundárias implementadas neste projeto:

	- put_extra: Recebe como parâmetro um ArrayList temporário da função principal e verifica se existe alguma cláusula com apenas um literal negativo.

	- is_formula: Utiliza o ArrayList principal *formulas*, e verifica se a fórmula é fórmula de Horn.

	- more_than_one: Recebe um ArrayList com uma cláusula e verifica se existe mais do que um literal positivo diferente.

	- horn: Verifica se a fórmula é contraditória ou se é possível.

	- verified2: Recebe como parâmetros um ArrayList que contém as cláusulas e um que contém os literais. A função retira o literal positivo que está presente na cláusula.

Foi também criada uma class Tuple1, para a utilização de Tuplos.