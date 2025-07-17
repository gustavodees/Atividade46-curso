# Encontra Maior Idade (com Impressão Intermediária) em Java

Este projeto consiste em um programa Java simples que lê o nome e a idade de uma quantidade especificada de pessoas e, ao final da entrada de dados, identifica e imprime o nome da pessoa com a maior idade. É importante notar que o código atual imprime o nome da pessoa mais velha *assim que uma idade maior é encontrada* durante a leitura dos dados.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário e identificar e imprimir o nome da pessoa com a maior idade.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de pessoas que você deseja inserir. Digite o número desejado e pressione Enter.
    * Em seguida, para cada pessoa, o programa pedirá que você digite os dados da pessoa, começando pelo nome e depois a idade, pressionando Enter após cada informação.

5.  **Resultado:** Após inserir os dados de todas as pessoas, o programa irá imprimir o nome da pessoa com a maior idade *sempre que uma idade maior for encontrada* durante o processo de entrada de dados. A saída final exibirá o nome da pessoa mais velha dentre todas as inseridas.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de pessoas e armazena esse valor na variável inteira `n`.
    3.  Cria dois arrays:
        * `idade`: Um array de doubles para armazenar a idade de cada pessoa.
        * `nome`: Um array de strings para armazenar o nome de cada pessoa.
    4.  Utiliza um loop `for` para iterar `n` vezes (para cada pessoa):
        * Para cada iteração, solicita ao usuário que digite os dados da pessoa (nome e idade).
        * Lê o nome e armazena no array `nome` na posição correspondente ao índice `i`.
        * Lê a idade e armazena no array `idade` na posição correspondente ao índice `i`.
    5.  Inicializa uma variável `double` chamada `maiorIdade` com a idade da primeira pessoa inserida (`idade[0]`).
    6.  Inicializa uma variável inteira chamada `nomemaiorIdade` com o índice 0, que corresponde à primeira pessoa.
    7.  Utiliza um loop `for` para percorrer o array `idade`, começando da segunda pessoa (índice 1). Em cada iteração:
        * Verifica se a idade da pessoa na posição `i` é maior que a `maiorIdade` atual.
        * Se for maior, atualiza a `maiorIdade` com a nova idade e atualiza o índice da pessoa com maior idade (`nomemaiorIdade`) para `i`.
        * **Importante:** Dentro deste `if`, o código também imprime o nome da pessoa com a maior idade encontrada até o momento. Isso significa que o nome será impresso cada vez que uma idade maior for digitada, não apenas ao final.
    8.  Fecha o objeto `Scanner` para liberar os recursos.

**Observação:** O código como está imprime o nome da pessoa com a maior idade sempre que uma nova idade máxima é encontrada durante a entrada de dados. Se o objetivo for imprimir apenas o nome da pessoa com a maior idade ao final de todas as entradas, a instrução `System.out.println("Maior idade: " + nome[nomemaiorIdade]);` deveria ser movida para fora do loop `for` principal, após o fechamento do loop.
