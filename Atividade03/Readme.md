### 1. Por que essa abordagem usando um array de instâncias da classe Vetor torna a busca de um contato mais rápida em comparação com a versão anterior (uma única lista contendo todos os contatos)?

- A busca fica mais rápida porque os contatos são separados em 26 vetores, de acordo com a primeira letra do nome. Assim, a busca procura apenas no vetor correspondente, em vez de percorrer todos os contatos da agenda. Com isso, menos comparações são feitas, resultando em uma busca mais rápida.

### 2.  O que acontece com o desempenho da busca se a maioria dos contatos cadastrados começar com a mesma letra (ex: centenas de nomes iniciando com a letra "M")? O sistema continuará rápido? Justifique.

- Se muitos contatos começarem com a mesma letra, o vetor dessa letra ficará maior e a busca poderá ficar mais lenta. Mas mesmo assim, ainda pode vai mais rápida que uma lista única, pois a busca vai continuar pulando os contatos de outras letras.