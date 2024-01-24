# CS4660_Artificial_Intelligence_ByJoanneW

The minimax.py heavily incorporates the fundamentals of Artificial Intelligence and the knowledge of the Minimax algorithm. This code implements a simple Tic-Tac-Toe game in Python. The game is represented by a 3x3 board where players 'X' and 'O' take turns makiing moves. It involves the Minimax Algorithm, `X_move` function, is marked as TODO, indicating that the Minimax algorithm needs to be implemented to make player X moves strategic.  

The game loop allows players to take turns, and the `evaluate_game` function determines the winner or if the game is a draw.

Technical Details:
~ `evaluate_game` function determines the current state of the game by checking for winning conditions (three in a row, column, or diagonal) or a draw.
~ `print_board` function prints the current state of the Tic-Tac-Toe board to the console, displaying X, O, or empty cells.
~ `O_move` represents the move for the O player (opponent) and currently returns the first valid move found.
~ `X_move` is a placeholder for the Minimax algorithm, responsible for finding the best move for the X player.
~ Alternates between X and O moves until the game is complete. Calls player move functions (`X_move` and `O-move`) to determine moves. Prints the updated game board after move.

To run/download: 
Install the file and run it on a IDE (for example: VS Code).


