# Pendências

Pontos ainda sem decisão, e tensões com as [diretrizes](diretrizes.md). Nada desta lista está adotado.

## Ainda sem estrutura

Não há decisão sobre registro, função, entrada e saída, `break`, `continue` e lista de listas.

[tipos.md](tipos.md) diz que a passagem de um tipo para outro precisa estar escrita no código. A forma dessa escrita não existe. Também ficaram só como intenção o método que extrai um `int` de um `decimal` e o método que converte um valor para `string` antes de concatenar.

## Detalhes em aberto

Um nome declarado dentro de um `if` ou de um `while` não tem regra de escopo. Não está dito se ele existe depois do bloco. Também não está dito se uma atribuição que só ocorre no corpo do `while` conta como valor garantido depois do laço.

O resto vale para `int` e para `decimal`. Não está dito qual é o sinal do resto quando o número é negativo.

A divisão por zero e o resto por zero param a linha com erro. A forma desse erro ainda não está definida.

O `item` do `foreach` não diz se é uma cópia ou a própria posição da lista.

A lista tem `add`, `get`, `set` e `size`. Não está dito se ela remove um valor ou insere no meio.

## Tensões com as diretrizes

A frase sobre o que a linguagem produz, em [diretrizes.md](diretrizes.md), cita programa, variáveis e operações. Seleção, repetição e lista já estão decididas nos outros documentos e não entram nessa frase. Essas três também ainda não estão na gramática.

[tipos.md](tipos.md) fala em escopo global. [programa.md](programa.md) só tem o bloco `program`. O contador do `for` e o `item` do `foreach` só existem dentro do bloco, e não há uma regra geral para os outros blocos.

`+` tem dois sentidos: soma número e concatena texto. A exceção está em [operacoes.md](operacoes.md), marcada para mudar quando existir conversão para `string`.

`add`, `get`, `size` e `set` são a primeira forma `nome.operacao(argumento)`. Não há regra geral do que é um método, do que ele devolve e se essa forma serve para outros tipos.
