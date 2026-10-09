# Seleção

Este documento guarda as estruturas de seleção. A primeira é o `if`, na forma de C e Java. As chaves são obrigatórias em todo ramo, mesmo quando há uma ação só.

## if

```text
if (idade >= 18) {
    ativo = true;
} else if (idade >= 16) {
    ativo = false;
} else {
    ativo = false;
}
```

A condição fica entre parênteses. Ela é `boolean`. Um `int`, um `decimal` ou um `string` não escolhe o caminho.

Cada ramo abre com `{` e fecha com `}`. A ação dentro do ramo termina com `;`. Não existe ramo de uma linha sem chaves.

`else if` e `else` podem faltar. Quando existem, também usam chaves. Há uma forma só para cada ramo.

```text
if (ativo) {
    idade = idade + 1;
}
```

## Sem escolha dentro da conta

Não existe `condição ? valorSeVerdadeiro : valorSeFalso`. No ternário, o valor verdadeiro fica no meio e o falso fica no fim. `idade >= 18 ? "adulto" : "menor"` exige parar para lembrar essa ordem.

A escolha fica no `if`. O verdadeiro está dentro do `if`. O falso está dentro do `else`. A variável nasce sem valor, e os dois ramos escrevem nela.

```text
var texto string;
if (idade >= 18) {
    texto = "adulto";
} else {
    texto = "menor";
}
```
