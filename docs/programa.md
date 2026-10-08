# Programa

O programa tem um único bloco de entrada. A palavra `program` abre o bloco. `{` e `}` marcam o limite. Cada ação termina com `;`.

```text
program {
    var idade int;
    idade = 30;
}
```

Há uma forma só. O começo do programa está escrito no texto. Quem lê encontra `program` e as chaves.

O bloco não é uma classe. Não declara retorno, porque o programa não é um valor. Não declara parâmetros, porque a entrada externa não faz parte desta estrutura.

As variáveis dentro do bloco seguem [tipos.md](tipos.md): `var`, tipo sempre escrito, e nenhum valor implícito.
