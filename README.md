# Tic-tac-toeGame

```diff
Aided attempt at making tic-tac-toe with Java ☕
```
***
This simple version of tic-tac-toe starts out by creating and printing
a 'gameboard'. Then it creates the game loop (or the 
game begins if you will), where it gets an input from a user by using a 
scanner on position 1 through 9 on the mentioned gameboard.

The user input is then stored, and the program checks if someone has 
won the game after that move is made. The same goes for a computer player
(currently random moves, might change this to an actual AI later), where
a move is made, stored, and the program checks if someone won after this
move as well.

These main 3 parts of the program are done with the help of the methods 
"**printGameBoard**", "**placeMark**" and "**checkWinner**".

The **checkWinner** method stores all the win conditions and compares them
the stored marks (moves) of the player and the cpu, checking if any of them
match.

This is done over and over until the chosen moves of the player and cpu results
in matching the conditions for a win, a loss, or a tie (cat).
***
