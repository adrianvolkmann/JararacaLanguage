# Operações

Estas operações usam os símbolos do Java. Os dois lados têm o mesmo tipo. `int` e `float` não se misturam numa conta, como está em [tipos.md](tipos.md).

## Aritmética

Soma, subtração e multiplicação só acontecem entre valores do mesmo tipo. `int` com `int` produz `int`. `float` com `float` produz `float`.

| Operação | Símbolo | Exemplo |
|---|---|---|
| Soma | `+` | `1 + 2` |
| Subtração | `-` | `4 - 1` |
| Multiplicação | `*` | `3 * 2` |

## Atualização da variável

Somar na própria variável usa a atribuição já definida e a soma já definida. Há uma forma só.

```text
idade = idade + 1;
```

Não existem `+=` nem `++`. Também não existem `-=`, `*=`, `/=`, `%=` nem `--`. O atalho do Java esconde duas decisões: qual valor entra na conta e em que momento a variável muda. Em `n = idade++` e `n = ++idade`, `n` não recebe o mesmo resultado. `idade += 1.5` ainda mistura tipos e descarta a fração. A forma longa deixa a conta e a atribuição visíveis.

## Divisão

A divisão só é permitida em `float`. O símbolo é `/`. Os dois lados são `float` e o resultado é `float`.

```text
var resultado float = 10.0 / 4.0;
```

`10.0 / 4.0` vale `2.5`. A fração permanece no resultado.

A divisão de `int` é proibida. Ela pode produzir um número fracionário, e esse efeito não fica escrito na operação. `10 / 4` é erro de tipo.

## Resto

O resto usa `%`, como no Java. `10 % 4` vale `2`. A operação pede o resto. Não é uma divisão.

## Texto

Em `string`, a única operação é `+`. Ela concatena os dois textos. Os dois lados são `string`.

```text
var nome string = "Ana" + " " + "Lia";
```

Uma conta de `string` com `int`, `float` ou `boolean` é erro. Não há conversão escondida para texto.

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

## Lógico

O lógico usa palavras separadas do nome: `and`, `or` e `not`. O resultado é `boolean`. O valor depois de `not`, e os dois lados de `and` e `or`, também são `boolean`. Um `int`, um `float` ou um `string` não entra nessa operação.

```text
not ativo
ativo and pronto
ativo or pronto
```

`not ativo` é a negação. `notAtivo` é um nome, não uma operação.

Quando `and` e `or` aparecem na mesma conta, os parênteses são obrigatórios. O agrupamento fica escrito.

```text
(ativo and pronto) or encerrado
```
