# Simulação de Busca de Alimento por Robôs

Neste projeto, simulamos uma competição entre dois tipos de robôs: um robô normal e um robô inteligente. Ambos os robôs se movem aleatoriamente em busca de alimento até encontrá-lo. A principal diferença é que o robô inteligente, quando realiza um movimento inválido, continuará se movendo até fazer um movimento válido.

## Funcionamento do Programa

O programa possui três classes principais: `Robo`, `RoboInteligente`, e `Main`.

### Classe `Robo`

A classe `Robo` representa um robô normal. Ela herda os atributos e métodos da classe base `RoboBase` e possui um método `mover` que gera movimentos aleatórios para o robô. Esses movimentos podem ser para cima, para baixo, para a direita ou para a esquerda.

### Classe `RoboInteligente`

A classe `RoboInteligente` é uma subclasse de `RoboBase`. Ela sobrescreve o método `mover` de forma que, se o robô fizer um movimento inválido, ele continuará se movendo até fazer um movimento válido. Isso garante que o robô inteligente não fique preso em movimentos inválidos e sempre se aproxime do alimento.

### Classe `Main`

A classe `Main` é a classe principal que controla a simulação da busca de alimento pelos robôs. Ela faz o seguinte:
1. Solicita ao usuário as coordenadas do alimento.
2. Instancia um robô normal e um robô inteligente.
3. Inicia uma simulação em que os robôs se movem aleatoriamente, um de cada vez, até que ambos encontrem o alimento.
4. Registra o número de movimentos que cada robô fez para encontrar o alimento.
5. Quando ambos os robôs encontram o alimento, o programa mostra o número total de movimentos de cada robô.
