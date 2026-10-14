# Repetição

Este documento guarda as estruturas de repetição. O `while`, o `do while` e o `for` seguem a forma do Java. As chaves são obrigatórias, mesmo quando há uma ação só.

A condição fica entre parênteses. O resultado dela é `boolean`, como no `if`. Uma comparação ou uma operação lógica servem. Um `int`, um `decimal` ou um `string` sozinhos não servem. A linguagem não converte outro tipo em lógico.

Um `var` escrito dentro do bloco existe só nesse bloco. Depois do `}`, o nome não existe. O contador do `for` e o `item` do `foreach` seguem a mesma regra.

## while

O teste acontece antes do bloco. Se a condição for `false`, o bloco não executa. Uma atribuição que só ocorre nesse bloco não conta como valor garantido depois do laço, como está em [tipos.md](tipos.md).

```text
while (idade < 10) {
    idade = idade + 1;
}
```

## do while

O bloco executa uma vez. O teste acontece depois. Se todos os caminhos do bloco escrevem numa variável, a leitura depois do laço é válida, como está em [tipos.md](tipos.md).

```text
do {
    idade = idade + 1;
} while (idade < 10);
```

O `;` fecha a condição. Cada ação dentro do bloco também termina com `;`.

## for

O `for` repete com um contador. O cabeçalho tem três partes: a declaração do contador, a condição e o passo. A condição é `boolean`. O limite da repetição é uma variável inteira declarada antes. O contador só existe dentro do `for`.

```text
var quantidade int = 10;

for (var i int = 0; i < quantidade; i = i + 1) {
    idade = idade + i;
}
```

Não há `++` nem `+=`. O passo é a atribuição já definida, `i = i + 1`. As chaves são obrigatórias, mesmo com uma ação só.

## foreach

O `foreach` percorre uma sequência. É outra estrutura, com palavra própria, para não se confundir com o `for` do contador. O item é declarado com `var` e o tipo, como qualquer variável. `in` liga o item à sequência. A sequência é declarada antes. O item só existe dentro do bloco.

```text
foreach (var item int in numeros) {
    idade = idade + item;
}
```

As chaves são obrigatórias, mesmo com uma ação só. A sequência é uma lista, como está em [lista.md](lista.md).
