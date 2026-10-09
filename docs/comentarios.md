# Comentários

O comentário segue o Java em duas formas. Não há comentário de documentação.

## Uma linha

`//` começa o comentário. Ele vai até o fim da linha.

```text
var idade int = 30; // anos completos
```

## Bloco

`/*` começa o comentário. `*/` termina. Pode ocupar várias linhas.

```text
/*
    O bloco inteiro é comentário.
    idade = 1;
*/

var idade int = /* valor inicial */ 30;
```

Um bloco não abre outro bloco. O primeiro `*/` encerra o comentário.

`/**` não é uma forma própria. Não há JavaDoc.
