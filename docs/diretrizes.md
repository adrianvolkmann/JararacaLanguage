# Diretrizes

## Objetivo

Este projeto estuda e projeta uma nova linguagem de programação. A ideia principal é testar conceitos. O objetivo não é competir com linguagens tradicionais de mercado.

## Carga cognitiva

O objetivo mais forte da linguagem é reduzir a carga cognitiva de quem lê o código. Este peso fica acima das demais escolhas de projeto.

Carga cognitiva, aqui, é o esforço mental para entender o que o programa faz. O texto deve entregar o tipo, o limite de cada bloco e o fim de cada ação. Quem lê acompanha o código. Não reconstrói um tipo omitido, um bloco sem marca ou um comando cujo fim depende de convenção.

Toda regra da linguagem se justifica por esse critério. Se uma forma mais curta exige que o leitor recupere algo que o texto não mostra, a forma explícita prevalece. Se duas opções entrarem em conflito, vence a que exigir menos raciocínio para ser lida.

Este critério pesa mais do que concisão, do que familiaridade com outras linguagens e do que economizar caracteres. A linguagem pode ser verbosa. Verbosidade que deixa cada passo visível é o resultado esperado.

Uma regra nova só entra se diminuir esse esforço, ou se pelo menos não aumentá-lo. Regra que esconde informação para encurtar o texto fica de fora.

## Compatibilidade

Não há compromisso com retrocompatibilidade entre versões. Como o propósito é o estudo, a linguagem pode mudar de forma incompatível com versões anteriores.

## Versionamento

O versionamento segue o [versionamento semântico](https://semver.org/lang/pt-BR/).

Uma versão tem a forma `MAIOR.MENOR.CORREÇÃO`:

- **MAIOR** muda quando a linguagem quebra o que uma versão anterior aceitava.
- **MENOR** muda quando entra algo novo sem quebrar o que já existia.
- **CORREÇÃO** muda quando só se corrige um erro, sem mudar a linguagem.

Quebrar uma versão anterior é permitido. Nesse caso, a versão maior avança.

## O que a linguagem produz

A princípio, a linguagem não gera código executável.

A sintaxe já está definida para o programa, as variáveis e as operações. O analisador semântico já verifica nomes, atribuição antes da leitura, tipos e operações. Outras análises semânticas podem entrar depois.

## Tipagem forte

A linguagem é fortemente tipada. Cada valor pertence a um tipo, e uma operação só é válida quando os tipos combinam. Atribuir um valor de outro tipo é um erro. Não há conversão silenciosa para “fazer caber”.

O tipo do objeto é escrito na declaração. O valor atribuído precisa ser desse tipo. A referência próxima é o Java: o tipo aparece no código e uma atribuição incompatível falha.

Não há inferência de tipo. A linguagem não deduz o tipo a partir do valor inicial, nem oferece uma forma abreviada no lugar do tipo escrito. O tipo fica no ponto em que o nome aparece, para a leitura não depender de percorrer o restante da linha e calcular o que aquele objeto é.

## Legibilidade

As marcas abaixo existem para servir à redução da carga cognitiva. O código mostra o que está acontecendo: quem lê reconhece tipo, limite do bloco e fim do comando sem reconstruir o que ficou implícito.

Isso pesa mais num cenário em que ferramentas geram código. Uma linha compacta, com o tipo escondido e vários passos encadeados, obriga a ler tudo até o fim para descobrir que objeto aquele trecho produz. A forma explícita deixa esse objeto visível no ponto em que ele aparece.

Cada bloco, como uma decisão ou uma repetição, é delimitado por `{` e `}`. O início e o fim estão no texto. A estrutura não depende de contar linhas seguintes nem de conferir indentação.

Cada ação, como uma chamada ou uma atribuição, termina com `;`. O fim do comando está marcado. O marcador é sempre obrigatório. Não existe forma opcional nem configuração para dispensá-lo.

A linguagem pode parecer verbosa. Essa extensão é aceita. Um texto mais longo, com tipo, chaves e `;` sempre presentes, evita as dúvidas de formato: se este comando acaba aqui, se este bloco tem uma única linha, se o tipo está em outro ponto da expressão. Código muito enxuto cabe mais na tela e, ao mesmo tempo, aumenta a carga cognitiva ao esconder essas decisões. Entre os dois, prevalece o texto que se lê com menos esforço mental.

## Uma única forma

Cada construção da linguagem tem uma forma de escrita. Não há alternativa equivalente para o mesmo conceito.

Quem lê não precisa descobrir qual das formas o trecho usou, nem qual configuração do projeto vale ali. A forma única também reduz decisão na hora de escrever.

O literal de `string` é o primeiro caso: só aspas duplas, como registrado em [tipos.md](tipos.md). Outras linguagens aceitam aspas simples ou duplas para o mesmo texto. Aqui a segunda forma não existe.

## Sem valor implícito

Não há valor default. O padrão é a variável nascer sem valor definido. A linguagem não insere valor que o programa não escreveu.

Um valor implícito aumenta a carga cognitiva: quem lê encontra `0`, `false` ou texto vazio e não sabe se aquilo foi escolhido ou preenchido pela linguagem. Esquecer uma atribuição e escolher o zero ficariam iguais. A omissão vira bug oculto.

O zero de um tipo só existe quando está escrito. A regra de declaração e de leitura das variáveis está em [tipos.md](tipos.md).
