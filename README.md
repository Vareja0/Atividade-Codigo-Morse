# Implementação de Árvore Binária com Código Morse

## Descrição do Projeto
Este projeto implementa uma árvore binária para representar o código Morse, onde cada nó corresponde a uma sequência de pontos (`.`) e traços (`-`) que mapeiam caracteres alfanuméricos (A–Z, 0–9). A árvore é estruturada de forma que pontos levam ao filho à esquerda e traços ao filho à direita, com cada nó folha armazenando um caractere. O programa suporta a inserção de caracteres, busca de caracteres por seu código Morse, remoção de caracteres, exibição hierárquica da árvore e processamento de entrada do usuário para mensagens em código Morse.

## Estrutura do Código
O projeto está organizado em três arquivos Java:

1. **Node.java**: Define a classe `Node`, que representa um nó da árvore binária.
    - **Atributos**:
        - `letra`: O caractere (ex.: "A", "1") ou `null` para nós intermediários.
        - `codigoMorse`: A string de código Morse (ex.: ".-") ou `null` para nós intermediários.
        - `esquerda`: Filho à esquerda (para pontos, `.`).
        - `direita`: Filho à direita (para traços, `-`).
    - **Construtor**: Inicializa um nó com letra e código Morse, definindo os filhos como `null`.

2. **Arvore.java**: Define a classe `Arvore`, que gerencia a árvore binária.
    - **Atributos**:
        - `raiz`: O nó raiz, inicializado como vazio (`letra = null`, `codigoMorse = null`).
    - **Métodos**:
        - `inserir(String codigo, String letra)`: Insere um caractere na árvore com base em seu código Morse.
        - `buscar(String codigo)`: Busca um caractere pelo código Morse e retorna a letra correspondente.
        - `remover(String codigo)`: Remove um caractere definindo sua `letra` e `codigoMorse` como `null`, preservando a estrutura da árvore.
        - `printarArvore()`: Exibe a árvore de forma hierárquica, mostrando a estrutura com indentação.

3. **Main.java**: Contém a lógica principal do programa e a interface com o usuário.
    - Inicializa a árvore com todos os códigos Morse para A–Z e 0–9.
    - Fornece um menu baseado em texto com as opções:
        - `[1] Buscar`: Busca uma sequência de códigos Morse separados por espaço (ex.: `... --- ...`).
        - `[2] Remover`: Remove um caractere com base em seu código Morse.
        - `[3] Printar Arvore`: Exibe a árvore hierarquicamente.
        - `[9] Sair`: Encerra o programa.
    - **Método auxiliar** `countString`: Divide uma string de entrada separada por espaços em um array de códigos Morse.

## Funcionalidades
O programa atende a todas as especificações do projeto:
- **Estrutura da Árvore**: A árvore binária é construída com a raiz no nível superior, com subárvores à esquerda para pontos (`.`) e à direita para traços (`-`). Todos os caracteres alfanuméricos (A–Z, 0–9) são inseridos corretamente.
- **Inserção**: Os caracteres são inseridos automaticamente no início do programa, seguindo os códigos Morse padrão.
- **Busca**: Permite buscar caracteres por seus códigos Morse, retornando a letra ou número correspondente.
- **Remoção**: Remove um caractere definindo seus dados como `null`, mantendo a estrutura da árvore.
- **Exibição**: A árvore é exibida de forma hierárquica, com indentação para indicar níveis e nós claramente identificados (raiz como "start", nós intermediários como `| * |`, e nós folha com `| letra |`).
- **Entrada do Usuário**: Suporta entrada de códigos Morse separados por espaços, com uma interface de menu intuitiva.

## Como Executar
1. **Pré-requisitos**: Certifique-se de ter o Java (JDK) instalado.
2. **Compilação**:
   ```bash
   javac Main.java Arvore.java Node.java
   ```
3. **Execução**:
    ```bash
   java Main
   ```
4. **Uso**:
    - Escolha uma opção do menu (1, 2, 3 ou 9).
    - Para buscar, insira códigos Morse separados por espaços (ex.: ... --- ... para "SOS").
    - Para remover, insira um único código Morse (ex.: .- para remover "A").
    - Para exibir a árvore, selecione a opção 3.
    - Para sair, selecione a opção 9.

## Exemplo de Uso

```java
// Inicialização e inserção (executadas automaticamente em Main.java)
Arvore arvore = new Arvore();
arvore.inserir("...", "S");
arvore.inserir("---", "O");

// Busca
arvore.buscar("..."); // Retorna: "S"
arvore.buscar("---"); // Retorna: "O"

// Entrada do usuário (opção 1)
Digite o codigo separando por espaço: ... --- ...
// Saída: 
// SOS

// Exibição da árvore (opção 3, exemplo parcial)
                | O |
        | * |
                | * |
start
                
        | * |
                | S |
   ```
