# Questões da prova da II unidade
___
### Questão 1
Características de pilha implementada utilizando **Array**:
- **Arrays** posuem tamanho fixo que é definido na criação.
- Acessar a informação em qualque posição é extremamente eficiente. Complexidade O(1)
- Por ter tamanho fixo não permite redimensionamento automático
- Indicado para casos onde o tamanho fixo do array é conhecido pois elimina complexidades desnecessárias de verificação e redimensionamento.
- Indicado para sistemas com baixa disponibilidade de memória e onde é necessário o desempenho máximo nas operações de pilha.

Caracteristicas de pilha implementada utilizando o **ArrayList**
- **ArrayList** tem tamanho dinâmico (ou seja, pode se adaptar a quantidade itens na pilha de forma dinâmica)
- Facilidade para o desenvolvimento pois não é necessário a preocupação com o redimensionamento.
- Redimensionamento automático.
- Indicado em situações onde não sabemos o tamanho máximo da pilha antes de executar o programa
- Indicado para programas que não possuem restrição de memória de forma significativa.

### Questão 2
[-link](https://github.com/gsaraujo/ifba-lp3-java/blob/main/src/provaii/Pilha.java)

### Questão 3
[-link](https://github.com/gsaraujo/ifba-lp3-java/blob/main/src/provaii/Metodos.java)

### Questão 4
Podemos utilizar uma **PriorityQueue**. Isso porque a fila de prioridade é uma estrutura em que cada elemento tem uma prioridade associada e os elementos de maior prioridade sempre serão removidos primeiro.
Então, os itens são organizados na estrutura em ordem de prioridade e não de inserção. Ao utilizarmos a **PriorityQueue** chamando o método _poll()_, nós garantimos que o elemento com maior prioridade será removido.
# ATENÇÃO
___
Não sei se professor Matheus utilizou essa classe com vocês. Se não foi o caso, me avisem.
___

### Questão 5
[-link](https://github.com/gsaraujo/ifba-lp3-java/blob/main/src/provaii/Excecao.java)

### Questão 6
[-link](https://github.com/gsaraujo/ifba-lp3-java/blob/main/src/provaii/Pilha.java)

### Questão 12
### Questão 13
[-link ](https://github.com/gsaraujo/ifba-lp3-java/tree/main/src/provaii/mvc)