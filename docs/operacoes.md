# Operações

Estas operações usam os símbolos do Java. Os dois lados têm o mesmo tipo. `int` e `decimal` não se misturam numa conta, como está em [tipos.md](tipos.md).

## Aritmética

Soma, subtração e multiplicação só acontecem entre valores do mesmo tipo. `int` com `int` produz `int`. `decimal` com `decimal` produz `decimal`. Se o resultado passaria de 28 dígitos significativos, ficam 28, pela regra descrita na divisão.

| Operação | Símbolo | Exemplo |
|---|---|---|
| Soma | `+` | `1 + 2` |
| Subtração | `-` | `4 - 1` |
| Multiplicação | `*` | `3 * 2` |

Não existe potência. `**` e `^` são erro. O `^` se confunde com o `xor` já excluído. Onde esse operador existe, `2 ** 3 ** 2` vale `512`, porque a leitura é da direita para a esquerda. `(2 ** 3) ** 2` vale `64`. Essa direção é o contrário do restante da conta.

## Atualização da variável

Somar na própria variável usa a atribuição já definida e a soma já definida. Há uma forma só.

```text
idade = idade + 1;
```

Não existem `+=` nem `++`. Também não existem `-=`, `*=`, `/=`, `%=` nem `--`. O atalho do Java esconde duas decisões: qual valor entra na conta e em que momento a variável muda. Em `n = idade++` e `n = ++idade`, `n` não recebe o mesmo resultado. `idade += 1.5` ainda mistura tipos e descarta a fração. A forma longa deixa a conta e a atribuição visíveis.

## Divisão

A divisão só é permitida em `decimal`. O símbolo é `/`. Os dois lados são `decimal` e o resultado é `decimal`.

```text
var resultado decimal = 10.0 / 4.0;
```

`10.0 / 4.0` vale `2.5`. A conta termina e cabe nos 28 dígitos.

`10.0 / 3.0` não termina. O resultado fica nos 28 dígitos: um `3` antes da vírgula e `3` nas casas seguintes. O próximo dígito também seria `3`, e o último não sobe.

`2.0 / 3.0` também não termina. As casas são `6`, e o primeiro dígito que fica de fora também é `6`. O último sobe. O valor termina em `7`.

Quando a conta não cabe em 28 dígitos, o primeiro dígito de fora decide o último que ficou:

- De `0` a `4`: o último permanece.
- De `6` a `9`: o último sobe um.
- `5` seguido de algo que não é zero: o último sobe um.
- `5` seguido só de zeros: o último fica par. Se já é par, permanece. Se é ímpar, sobe um.

A divisão de `int` é proibida. Ela pode produzir um número fracionário, e esse efeito não fica escrito na operação. `10 / 4` é erro de tipo. `10.0 / 4` também é erro: o lado direito é `int`. Os dois lados precisam ser `decimal`. Não existe `//`. Esse símbolo, em outras linguagens, é a divisão de `int`.

O divisor escrito `0.0` é erro de compilação. `10.0 / 0.0` não compila. Se o divisor é uma variável e vale zero na execução, a linha para com erro. A forma desse erro ainda não está definida.

## Resto

O resto usa `%`. Os dois lados têm o mesmo tipo, `int` ou `decimal`. O resultado tem esse tipo. A operação pede o resto. Não é uma divisão. Se o resultado em `decimal` passaria de 28 dígitos, vale a mesma regra da divisão.

`10 % 4` vale `2`. `10.5 % 3.0` vale `1.5`.

O divisor escrito `0` ou `0.0` é erro de compilação. `10 % 0` e `10.5 % 0.0` não compilam. Se o divisor é uma variável e vale zero na execução, a linha para com erro, como na divisão. A forma desse erro ainda não está definida.

O sinal do resto quando o número é negativo continua em aberto.

## Bits

Não existem `&`, `|`, `~`, `<<` nem `>>`. Cada uma olha os bits do número. Isso é conta de byte, e a linguagem não trabalha com byte, como está em [tipos.md](tipos.md). O `^` também não existe. Ele é o `xor` dos bits.

## Texto

Em `string`, a única operação é `+`. Ela concatena os dois textos. Os dois lados são `string`.

```text
var nome string = "Ana" + " " + "Lia";
```

Uma conta de `string` com `int`, `decimal` ou `boolean` é erro. Não há conversão escondida para texto.

Esta regra pode mudar no futuro. A forma prevista é um método que converte o valor para `string`. A concatenação acontece depois, entre textos.

## Comparação

| Operação | Símbolo | Exemplo |
|---|---|---|
| Igual | `==` | `idade == 30` |
| Diferente | `!=` | `idade != 0` |
| Menor | `<` | `idade < 18` |
| Maior | `>` | `idade > 18` |
| Menor ou igual | `<=` | `idade <= 18` |
| Maior ou igual | `>=` | `idade >= 18` |

A comparação produz `boolean`. Os dois lados têm o mesmo tipo.

`==` e `!=` valem para qualquer tipo, desde que os dois lados sejam o mesmo. `nome == "Ana"` e `ativo != ligado` são comparações válidas.

`<`, `>`, `<=` e `>=` valem só para `int` e `decimal`. `nome < "Lia"` e `ativo > ligado` são erro. Texto e `boolean` não têm essa ordem. `0.1 == 0.10` é verdadeiro.

## Lógico

O lógico usa palavras separadas do nome: `and`, `or` e `not`. O resultado é `boolean`. O valor depois de `not`, e os dois lados de `and` e `or`, também são `boolean`. Um `int`, um `decimal` ou um `string` não entra nessa operação.

```text
not ativo
ativo and pronto
ativo or pronto
```

`not ativo` é a negação. `notAtivo` é um nome, não uma operação.

Não existe `xor`. O resultado já se escreve com `and`, `or` e `not`. Se só um dos lados é verdadeiro, as duas contas abaixo são verdadeiras. Se os dois lados são iguais, são falsas.

```text
(ativo or pronto) and not (ativo and pronto)
(ativo and not pronto) or (not ativo and pronto)
```

`and` e `or` leem o lado esquerdo primeiro. Se esse lado já decide o resultado, o direito não é lido. Em `and`, o esquerdo falso torna o resultado falso. Em `or`, o esquerdo verdadeiro torna o resultado verdadeiro. Hoje a conta não chama método, então ler os dois lados ou parar no esquerdo produz o mesmo valor. Quando o lado direito for um método, ou uma conta que possa falhar, ele só será lido se o esquerdo não tiver decidido.

Quando `and` e `or` aparecem na mesma conta, os parênteses são obrigatórios. O agrupamento fica escrito.

```text
(ativo and pronto) or encerrado
```

`not` gruda no valor à direita. `ativo and not ligado` é `ativo and (not ligado)`. `not idade >= 18` é erro: o `not` gruda em `idade`, que não é `boolean`. A negação da comparação usa parênteses: `not (idade >= 18)`.

`not` não se aplica a outro `not`. `not not ligado` é erro. `not (not ligado)` também é erro. Um `not` só já inverte o valor.

```text
var k boolean = not (ativo and not ligado);
```

Aqui os dois `not` não estão encostados. O de dentro nega `ligado`. O de fora nega o `and`.

Duas comparações coladas são erro. `idade >= 18 == ativo` não vale. Cada comparação fica sozinha, ou os parênteses separam as duas.

## Ordem

A conta segue a matemática nos números. A ordem abaixo vai da mais forte para a mais fraca. Na mesma linha, o cálculo anda da esquerda para a direita: `8.0 / 4.0 / 2.0` vale `1.0`.

1. Parênteses.
2. `not`, no valor à direita, e o `-` do número negativo, também no valor à direita.
3. `*` `/` `%`
4. `+` `-`
5. Uma comparação: `<` `>` `<=` `>=` `==` `!=`
6. `and` e `or`, que não se misturam sem parênteses.

`2 + 3 * 4` vale `14`. A multiplicação ocorre antes da soma. `quantidade + zero >= 18` soma antes de comparar.

## Número negativo

O número negativo se escreve com `-` imediatamente antes dos dígitos, como no Java e nas outras linguagens de mercado. O mais unário não existe. `+2` e `+idade` são erro. O `+` na frente não altera o valor, e a escrita esconde que nenhuma conta aconteceu. O positivo se escreve `2`.

```text
var idade int = -10;
var medida decimal = -10.5;
```

Esse `-` é o sinal do número. Não é a subtração `8 - 4`. Numa conta maior, o sinal gruda no valor da direita e acontece antes de `*` `/` `%` e de `+` `-`.

```text
var a int = -2 * 3;
var b int = -2 * -3;
var c decimal = -8.0 / 4.0 / 2.0;
```

`a` vale `-6`. `b` vale `6`. `c` vale `-1.0`.

Dois sinais seguidos, como `--2`, são erro. O texto se confunde com o operador `--`, que não existe. O negativo de um negativo usa parênteses:

```text
var sinalDuplo int = -(-2);
```

`sinalDuplo` vale `2`. `8 - -4` continua sendo a subtração de um negativo e vale `12`.

`8 - 4 - 2` continua sendo subtração, da esquerda para a direita, e vale `2`.
