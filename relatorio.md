# Testes do desempenho da pilha

| Quantidade de Elementos | Incremento 10 | Incremento 100 | Incremento 1000 | Duplicação |
|------------------------|----------------|----------------|-----------------|------------|
| 10                     |    0           |     0          |       0          |    0      |
| 100                    |    7           |     5          |       6          |    16     |
| 1000                   |    106         |     90         |       64         |    84     |
| 10000                  |    351         |     361        |       347        |    590    |
| 100000                 |    1961        |     2170       |       2045       |    2426   |
| 1000000                |    135288      |     130312     |       158007     |    163707 |

## Sobre análise

Vejo que por mais que tenha linha de código println para imprimir os números de código sendo inseridas, percebemos que quando aumentamos o crescimento/incremento, ficava mais rápido o desempenho na maior parte, agora a duplicação não teve muito bom desempenho.

