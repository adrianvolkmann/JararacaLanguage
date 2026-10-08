# Índice

Os documentos desta pasta registram as diretrizes e as decisões da linguagem. Cada definição nova entra aqui.

| Documento | Conteúdo |
|---|---|
| [diretrizes.md](diretrizes.md) | Objetivo do estudo, carga cognitiva, compatibilidade, versionamento, tipagem, legibilidade, uma única forma de escrita e ausência de valor implícito |
| [tipos.md](tipos.md) | Tipos `int`, `float`, `boolean` e `string`, sem `byte` e sem `character`; declaração `var nome tipo`, sem inferência; valor inicial |
| [programa.md](programa.md) | O programa é um único bloco `program { }`, sem classe, sem retorno e sem parâmetros |
| [operacoes.md](operacoes.md) | Aritmética no mesmo tipo; divisão só em `float`; `+` concatena `string`; comparações; `and`, `or`, `not`; sem `+=` nem `++` |
| [selecao.md](selecao.md) | Seleção com `if`, `else if` e `else`, na forma de C e Java, com chaves obrigatórias |
| [repeticao.md](repeticao.md) | Repetição com `while`, `do while`, `for` e `foreach`, com chaves obrigatórias e condição `boolean` |
| [lista.md](lista.md) | Lista `list<int>` com valores em colchetes; `add`, `get`, `size` e `set`; sem array de tamanho fixo |
