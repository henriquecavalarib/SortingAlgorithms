# Analise de Algoritmos de Ordenacao

Este projeto consiste na implementação e análise de desempenho de cinco algoritmos clássicos de ordenação. O objetivo é comparar o tempo de execução empírico com a complexidade assintótica teórica em diferentes cenários de entrada.

## Algoritmos Implementados

Os seguintes métodos de ordenação foram desenvolvidos na classe SortingAlgorithms:

* **Bubble Sort**: Algoritmo de troca simples.
* **Insertion Sort**: Algoritmo de ordenação por inserção.
* **Selection Sort**: Algoritmo de ordenação por seleção.
* **Merge Sort**: Algoritmo de divisão e conquista com complexidade estável.
* **Quick Sort**: Algoritmo de divisão e conquista baseado em particionamento.

## Estrutura do Projeto

O sistema está organizado em dois arquivos principais:

1.  **SortingAlgorithms.java**: Contém a lógica de ordenação para cada método.
2.  **Main.java**: Responsável pela geração das massas de dados, controle de execução dos testes e coleta das métricas de tempo.

## Metodologia de Teste

Para cada algoritmo, o sistema realiza testes variando dois fatores principais:

### 1. Tamanho da Entrada (N)
* 1.000 elementos
* 10.000 elementos
* 100.000 elementos

### 2. Configuração dos Dados
* **Aleatório**: Vetor com números randômicos sem repetição.
* **Ordenado**: Vetor já organizado de forma crescente (melhor caso).
* **Inversamente Ordenado**: Vetor organizado de forma decrescente (pior caso).

A coleta de tempo é realizada através do método `System.nanoTime()`, convertendo o resultado final para milissegundos para facilitar a leitura.

## Requisitos de Execução

* Java JDK 8 ou superior.
* IDE de sua preferência (IntelliJ, Eclipse, VS Code) ou compilador via terminal.

### Como Executar

1. Compile os arquivos:
   ```bash
   javac SortingAlgorithms.java Main.java
   ```

2. Execute a classe principal:
   ```bash
   java Main
   ```

## Analise Assintotica

Os resultados obtidos permitem observar a diferença prática entre algoritmos de complexidade quadrática $O(n^2)$ e algoritmos de complexidade logarítmica $O(n \log n)$. 

Fatores como o custo de chamadas recursivas no Quick Sort e Merge Sort, bem como a eficiência do Insertion Sort em vetores quase ordenados, são pontos centrais do relatório técnico que acompanha este código.
