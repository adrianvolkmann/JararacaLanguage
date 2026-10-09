# Testes da ordem

Estes exemplos cobrem a ordem definida em [operacoes.md](operacoes.md). Os que aceitam estão em `ordem-valida.pss`. Os bloqueados estão em `ordem-and-or.pss`, `ordem-comparacoes.pss`, `ordem-negativo.pss` e `ordem-not.pss`, no projeto de teste.

## Aceitas

| Expressão | Agrupamento |
|---|---|
| `-2 * 3` | `(-2) * 3`. Vale `-6` |
| `-2 * -3` | `(-2) * (-3)`. Vale `6` |
| `-8.0 / 4.0 / 2.0` | `((-8.0) / 4.0) / 2.0`. Vale `-1.0` |
| `-(-2)` | negativo do negativo, com parênteses. Vale `2` |
| `8 - -4` | `8 - (-4)`. Vale `12` |
| `(2 + 3) * 4` | parênteses primeiro. Vale `20` |
| `2 + 3 * 4` | `2 + (3 * 4)`. Vale `14` |
| `8 - 4 - 2` | `(8 - 4) - 2`. Vale `2` |
| `8.0 / 4.0 / 2.0` | `(8.0 / 4.0) / 2.0`. Vale `1.0` |
| `8.0 / 4.0 * 2.0` | `(8.0 / 4.0) * 2.0`. Vale `4.0` |
| `8.0 * 4.0 / 2.0` | `(8.0 * 4.0) / 2.0`. Vale `16.0` |
| `10 % 3` | resto entre `int`. Vale `1` |
| `10.5 % 3.0` | resto entre `decimal`. Vale `1.5` |
| `quantidade + zero >= 18` | `(quantidade + zero) >= 18` |
| `2 + 3 * 4 >= 14` | `(2 + (3 * 4)) >= 14` |
| `not ligado` | `not` no valor à direita |
| `not (idade >= 18)` | o `not` nega a comparação. Vale `false` |
| `not ativo == false` | `(not ativo) == false`. Vale `true` |
| `not (ativo and not ligado)` | o `not` de fora nega o `and`. Vale `false` |
| `ativo and not ligado` | `ativo and (not ligado)` |
| `not ativo or pronto` | `(not ativo) or pronto` |
| `ativo and pronto` | só `and` |
| `ativo or encerrado` | só `or` |
| `(ativo and pronto) or encerrado` | `and` e `or` com parênteses |
| `ativo and (pronto or encerrado)` | `and` e `or` com parênteses |
| `(idade >= 18) == ativo` | duas comparações separadas por parênteses |
| `not (ativo and pronto)` | `not` no grupo entre parênteses |

```text
program {
    var quantidade int = 10;
    var zero int = 0;
    var idade int = 30;
    var ativo boolean = true;
    var ligado boolean = false;
    var pronto boolean = true;
    var encerrado boolean = false;

    var negativo int = -2 * 3; // -6
    var doisNegativos int = -2 * -3; // 6
    var divisaoNegativa decimal = -8.0 / 4.0 / 2.0; // -1.0
    var sinalDuplo int = -(-2); // 2
    var subtracao int = 8 - -4; // 12
    var a int = (2 + 3) * 4; // 20
    var b int = 2 + 3 * 4; // 14
    var c int = 8 - 4 - 2; // 2
    var d decimal = 8.0 / 4.0 / 2.0; // 1.0
    var e decimal = 8.0 / 4.0 * 2.0; // 4.0
    var f decimal = 8.0 * 4.0 / 2.0; // 16.0
    var g int = 10 % 3; // 1
    var g2 decimal = 10.5 % 3.0; // 1.5
    var h boolean = quantidade + zero >= 18; // false
    var i boolean = 2 + 3 * 4 >= 14; // true
    var j boolean = not ligado; // true
    var j2 boolean = not (idade >= 18); // false
    var j3 boolean = not ativo == false; // true
    var k boolean = not (ativo and not ligado); // false
    var l boolean = ativo and not ligado; // true
    var m boolean = not ativo or pronto; // true
    var n boolean = ativo and pronto; // true
    var o boolean = ativo or encerrado; // true
    var p boolean = (ativo and pronto) or encerrado; // true
    var q boolean = ativo and (pronto or encerrado); // true
    var r boolean = (idade >= 18) == ativo; // true
    var s boolean = not (ativo and pronto); // false
}
```

## Bloqueadas

| Expressão | Erro |
|---|---|
| `ativo and pronto or encerrado` | `and` e `or` na mesma conta exigem parênteses |
| `ativo or pronto and encerrado` | `and` e `or` na mesma conta exigem parênteses |
| `idade >= 18 == ativo` | duas comparações coladas exigem parênteses |
| `idade < 18 < 65` | duas comparações coladas exigem parênteses |
| `1 < 2 == 2 < 3` | duas comparações coladas exigem parênteses |
| `-true` | o sinal negativo só se aplica a `int` e `decimal` |
| `-"10"` | o sinal negativo só se aplica a `int` e `decimal` |
| `--2` | dois sinais seguidos exigem parênteses |
| `not not ligado` | `not` não se aplica a outro `not` |
| `not (not ligado)` | `not` não se aplica a outro `not` |
| `not idade >= 18` | `not` gruda em `idade`, que não é `boolean` |
| `not idade + 1 >= 18` | `not` gruda em `idade`, que não é `boolean` |

```text
program {
    var ativo boolean = true;
    var pronto boolean = true;
    var encerrado boolean = false;
    var idade int = 30;

    var a boolean = ativo and pronto or encerrado; // erro
    var b boolean = ativo or pronto and encerrado; // erro
    var c boolean = idade >= 18 == ativo; // erro
    var d boolean = idade < 18 < 65; // erro
    var e boolean = 1 < 2 == 2 < 3; // erro
    var f boolean = not idade >= 18; // erro
    var g boolean = not idade + 1 >= 18; // erro
}
```
