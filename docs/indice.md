# Índice

Os documentos desta pasta registram as diretrizes e as decisões da linguagem. Cada definição nova entra aqui.

| Documento | Conteúdo |
|---|---|
| [diretrizes.md](diretrizes.md) | Objetivo do estudo, carga cognitiva, compatibilidade, versionamento, tipagem, legibilidade, uma única forma de escrita e ausência de valor implícito |
| [tipos.md](tipos.md) | Tipos `int`, `decimal`, `boolean` e `string`, sem `float`, `byte` e `character`; declaração `var nome tipo`, sem inferência; valor inicial; `?` e `null` como ausência |
| [programa.md](programa.md) | O programa é um único bloco `program { }`, sem classe, sem retorno e sem parâmetros |
| [operacoes.md](operacoes.md) | Aritmética no mesmo tipo; divisão só em `decimal`, em 28 dígitos; resto em `int` e `decimal`; zero no divisor é erro; `+` concatena `string`; comparações; `and` e `or` com leitura curta; `not`; ordem da conta; sem `+=`, `++`, `//`, potência, mais unário, `xor` nem operação de bit |
| [selecao.md](selecao.md) | Seleção com `if`, `else if` e `else`, na forma de C e Java, com chaves obrigatórias; sem `? :` |
| [repeticao.md](repeticao.md) | Repetição com `while`, `do while`, `for` e `foreach`, com chaves obrigatórias e condição `boolean` |
| [lista.md](lista.md) | Lista `list<int>` com valores em colchetes; `add`, `get`, `size` e `set`; sem array de tamanho fixo |
| [pendencias.md](pendencias.md) | Decisões ainda abertas e tensões com as diretrizes |
| [testes-ordem.md](testes-ordem.md) | Combinações da ordem das operações, aceitas e bloqueadas |
| [comentarios.md](comentarios.md) | Comentário de linha com `//` e de bloco com `/* */`, sem JavaDoc |
