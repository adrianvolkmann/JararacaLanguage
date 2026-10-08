# Tipos

Este documento registra os tipos da linguagem e a declaração das variáveis. As regras gerais de tipagem estão em [diretrizes.md](diretrizes.md): o tipo é escrito na declaração, não há inferência e um valor incompatível é erro.

`int`, `float`, `boolean` e `string` são tipos. A linguagem não os classifica como primitivos. No Java, primitivo nomeia uma forma de guardar o valor, diferente da referência. Essa divisão não organiza os tipos daqui.

## Tipos numéricos

O núcleo tem dois tipos numéricos: `int` e `float`. Não há um tipo para cada tamanho de memória.

### int

`int` é o inteiro exato. A declaração não informa tamanho. O valor pode ocupar mais memória quando a magnitude deixa de caber no espaço atual, no mesmo modelo do `int` do Python.

Não fazem parte deste tipo: `short`, `long` e o inteiro sem sinal. Eles deixam de existir como tipos separados.

### float

`float` é uma aproximação binária de 64 bits, no formato IEEE 754. É o mesmo tamanho do `float` do Python e do `double` do Java. Há uma precisão só, escolhida de antemão.

O `float` não cresce para se tornar exato. Um único nome não representa vários tamanhos ao mesmo tempo. Não há `float` de 32 bits nem outra largura no núcleo.

## Conversão

`int` e `float` não se misturam. Atribuição de um para o outro é erro. Uma conta que use os dois também é erro. A passagem de um tipo para o outro só ocorre por uma conversão escrita no código. O texto mostra o ponto em que um valor exato vira aproximação.

## boolean

O tipo lógico é `boolean`, como no Java. Os únicos valores são `true` e `false`.

`boolean` não é número. Não recebe `int` nem `float`, e não entra em conta. Atribuição de outro tipo é erro.

## string

O texto é do tipo `string`. Não há tipo `character`. Esta escolha vale agora e pode ser revista. Se no futuro existir um tipo só para um caractere, isso entra como decisão nova.

Um `string` guarda texto Unicode. Unicode é o conjunto padrão que numera letras, dígitos, pontuação, acentos, símbolos e emojis. Cada item desse conjunto é um ponto de código. O `string` é uma sequência desses pontos. A codificação em bytes não faz parte do tipo: o programa não escolhe UTF-8 nem UTF-16, e não trata o texto como lista de bytes.

`""` é texto vazio, de tamanho 0. Quando o programa precisa de um caractere só, usa um `string` de tamanho 1, como `"a"`. Não existe outro tipo para esse caso.

O literal de `string` usa aspas duplas, como no Java. A linguagem aceita só essa forma. Aspas simples não delimitam `string`. Isso segue o princípio de uma única forma, em [diretrizes.md](diretrizes.md).

## Declaração

A declaração segue a ordem do Go: a palavra `var`, o nome e o tipo. O tipo é sempre escrito. Não há inferência.

```text
var idade int;
```

Com valor inicial, o valor entra no fim, depois de `=`. O `;` fecha a declaração, como as demais ações.

```text
var idade int = 30;
```

Formas que omitem o tipo, como `var idade = 30` ou `idade := 30`, não existem.

## Valor inicial

Não há valor default para `int`, `float`, `boolean` ou `string`. O padrão é a variável nascer sem valor definido. A declaração sem valor inicial é a forma comum.

```text
var n int;
```

A linguagem não preenche `0`, `0.0`, `false` nem `""`.

Cada leitura é verificada na compilação. Todo caminho que chega até essa leitura precisa ter atribuído um valor antes. Se algum caminho chega sem atribuição, a compilação falha. O programa não segue com um zero no lugar do valor esquecido.

```text
var n int;

if (informado) {
    n = 1;
} else {
    n = 2;
}
```

A leitura de `n` depois desse `if` é válida. Os dois caminhos escreveram o valor. Sem o `else`, a leitura seguinte é erro: existe um caminho em que `n` não recebeu nada.

Quando o valor desejado é o zero do tipo, ele é escrito na declaração. Essa é a única forma de obter esse zero.

```text
var n int = 0;
var x float = 0.0;
var ativo boolean = false;
var nome string = "";
```

`var n int;` e `var n int = 0;` são construções diferentes. A primeira ainda não tem valor. A segunda tem o zero escolhido no texto. Isso segue os princípios de uma única forma e de valor não implícito, em [diretrizes.md](diretrizes.md).

A mesma regra vale no escopo local e no global. Um global sem valor inicial só pode ser lido depois de uma atribuição que o compilador enxerga em todos os caminhos. Se ele pode ser lido de qualquer ponto, o valor já vai na declaração.

## byte

A linguagem não tem o tipo `byte`. O nível é alto: o programa não trabalha com dado na estrutura de byte, nem faz conta com ele. O Java permite aritmética sobre `byte`. Aqui esse tipo não existe.

## Fora do núcleo

Tamanho fixo e inteiro sem sinal ficam de fora. Eles só entram se o estudo chegar à fronteira com memória, arquivo ou máquina. Essa entrada muda a versão maior.

Decimal e fração também ficam de fora. São outros tipos, ainda sem decisão, para o caso em que a aproximação de 64 bits não servir.
