import random

player1 = 0
player1steps = 0
player2 = 0
player2steps = 0

print('Player 1 is throwing the dice:')
while player1 < 20:
    diceValue = random.randint(1, 6)
    print(f'Throw {player1steps+1}: {diceValue}')
    player1steps += 1
    player1 += diceValue

print('Player 2 is throwing the dice:')
while player2 < 20:
    diceValue = random.randint(1, 6)
    print(f'Throw {player2steps+1}: {diceValue}')
    player2steps += 1
    player2 += diceValue

print(f'Number of steps by player-1: {player1steps}')
print(f'Number of steps by player-2: {player2steps}')

if player1steps > player2steps:
    print('Player 2 is the winner ')
elif player1steps < player2steps:
     print('Player 1 is the winner ')
else:
    print('Both the players achieve 20 in same number of steps')