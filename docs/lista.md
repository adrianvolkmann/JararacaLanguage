# Lista

A linguagem tem uma lista. Ela cresce quando um valor entra. Não há array de tamanho fixo. O detalhe de memória fica escondido.

O tipo é escrito uma vez, na declaração. `list<int>` é uma lista de `int`. O mesmo vale para `list<decimal>`, `list<boolean>` e `list<string>`.

## Valor

A direita da atribuição é só a lista de valores. Colchetes agrupam esses valores. Não leem uma posição.

```text
var numeros list<int> = [1, 2, 3];
var vazia list<int> = [];
```

`[1, 2, 3]` tem tamanho `3`. `[]` é a lista vazia, escrita de propósito. Não há posição preenchida com zero.

`var numeros list<int>;` sem valor nasce sem lista, como qualquer variável. Lista vazia e variável ainda não atribuída são coisas diferentes. A leitura antes da atribuição é erro, como está em [tipos.md](tipos.md).

Os valores têm de ser do tipo do elemento. `list<int>` não recebe `decimal`, `boolean` nem `string`.

## Operações

```text
numeros.add(4);
var primeiro int = numeros.get(0);
var quantidade int = numeros.size();
numeros.set(0, 15);
```

`add` inclui um valor no fim. O tamanho sobe de um.

`get` devolve o valor da posição. A primeira posição é `0`. `get` fora da lista é erro. Não há `numeros[0]`.

`size` devolve quantos valores já entraram.

`set` troca um valor que já está na lista. A posição precisa existir.

## Percurso

O `foreach` percorre a lista. A forma está em [repeticao.md](repeticao.md).

```text
foreach (var item int in numeros) {
    idade = idade + item;
}
```
