# Viagem ao fundo do mar 


Uma equipe de cientista está explorando a fossa das Marianas e para isso utiliza submarinos não tripulados. Os cientistas já mapearam a área a ser explorada e a dividiram em três eixos: X, Y e Z. Esses eixos controlam o posicionamento e profundidade do submarino.

A posição do submarino é representado pela notação (0, 0, 0, NORTE) que indica os pontos X, Y, Z e a direção que o submarino aponta (Norte, Sul, Leste e Oeste).

Os cientistas utilizam uma serie comandos simples para fazer a movimentação do submarino: L, R, para girar o submarino para esquerda ou direita, M para mover o submarino e U e D para subir ou descer o submarino.


## Exemplo de execução:


Dado a seguinte entrada:

(Lembrando que a posição inicial do submarino é 0, 0, 0, NORTE)
```
RMMLMMMDDLL
```

A saída esperada é:
```
2 3 -2 SUL
```

## Explicação de resolução:

Não foi vista como necessidade a utilização de nenhum framework.

Tendo o plano cartesiano fixo: 
Quando comando R é somado 1 à variavel "direction"
Quando comando L é subtraído 1 à variavel "direction"
Quando comando U é somado 1 à variavel "z"
Quando comando D é subtraído 1 à variavel "z"
Quando comando M é calculada a direção do submarino, e de acordo com a direção
	Se NORTE (0)  então é somado 1 à variavel "y"
	Se LESTE (1)  então é somado 1 à variavel "x"
	Se SUL (2)    então é subtraído 1 à variavel "y"
	Se OESTE (3)  então é subtraído 1 à variavel "x"

No final de cada comando é imprimida a coordenada e a direção do submarino.
