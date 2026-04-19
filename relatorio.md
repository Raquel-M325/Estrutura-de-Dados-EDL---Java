# Relatório da Atividade

## Estado da fila

enqueue(5), enqueue(3), dequeue(), enqueue(2), enqueue(8), dequeue(), dequeue(),
enqueue(9), enqueue(1), dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(),
enqueue(4), enqueue (7), dequeue().

### Resultado

5 3 | 3 | 3 2 8 | 8 | 8 9 1 | 9 1 | 9 1 7 6 | 7 6 | 7 6 4 7 | 6 4 7

A resposta final foi: 6 4 7


## Testes do desempenho da pilha

| Quantidade de Elementos | Incremento 10 | Incremento 100 | Incremento 1000 | Duplicação |
|------------------------|----------------|----------------|-----------------|------------|
| 10                     |    0           |     0          |       0          |    0      |
| 100                    |    7           |     5          |       6          |    16     |
| 1000                   |    106         |     90         |       64         |    84     |
| 10000                  |    351         |     361        |       347        |    590    |
| 100000                 |    1961        |     2170       |       2045       |    2426   |
| 1000000                |    135288      |     130312     |       158007     |    163707 |

### Sobre análise do desempenho anterior

Vejo que por mais que tenha linha de código println para imprimir os números de código sendo inseridas, percebemos que quando aumentamos o crescimento/incremento, ficava mais rápido o desempenho na maior parte, agora a duplicação não teve muito bom desempenho.

## Como implementar um TAD Fila usando duas pilhas? Avalie o tempo de execução dos algoritmos enqueue e denqueue.
Cada pilha tem uma função separada: a primeira pilha é responsável pelo enqueue, que realiza o push dos elementos, e a segunda pilha é responsável pelo dequeue, que realiza o pop.
Porém, antes de unir as duas pilhas, é necessário ajustar a ordem dos elementos, pois ao entrar pela primeira pilha via push os elementos ficam invertidos e não estariam na ordem correta para uma fila. Por isso, é necessário transferir os elementos para a segunda pilha, corrigindo a ordem.
Com isso, o tempo de desempenho do dequeue é O(n), pois precisa transferir todos os elementos, enquanto o enqueue é O(1), pois apenas insere o elemento na pilha.


## Como implementar um TAD Pilha usando duas filas? Qual o tempo de execução das operações push e pop neste caso?
A ideia é semelhante à questão anterior, porém invertida. Cada fila tem uma função separada: a primeira fila é responsável pelo push e a segunda pelo pop.
A diferença é que a fila não inverte a ordem dos elementos como a pilha faz. Por isso, para simular o comportamento LIFO da pilha, é necessário transferir os elementos entre as duas filas para ajustar a ordem, fazendo com que o último elemento inserido seja o primeiro a sair.
Com isso, tanto o push quanto o pop ficam com tempo de desempenho O(n), pois ambos precisam transferir todos os elementos entre as filas para manter a ordem correta.


## Descreva o estado do deque (inicialmente vazio) após cada uma das seguintes operações:

insertFirst(3), insertLast(8), insertLast(9), insertFirst(5), removeFirst(), removeLast(), first(),
insertLast(7), removeFirst(), last(), removeLast().

### Resultado
5 3 8 9 | 3 8 | 3 8 7 | 8 7 | 8

A resposta final é 8

## Implemente um deque usando arrays. Descreva o tempo de execução de cada um dos algoritmos.

Com algoritmo já implementado na pasta Fila/Deque/DequeArray. Todas as operações como insertFirst, insertLast, removeFirst, removeLast, first, last, size e isEmpty.

Têm tempo de execução O(1), pois o array acessa qualquer posição diretamente pelo índice, sem precisar percorrer os elementos, sendo mais direto e rápido na operação.

