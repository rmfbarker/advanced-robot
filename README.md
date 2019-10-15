# advanced-robot

A robot is placed on a square board. Can a robot move to all free (white) cells on the board, given that some cells cannot be moved through (black cells).

Top left position on the board is (0,0)

Input is the dimension of the board, position of robot, and the list of black cells.

e.g. For a board of width `5`, starting position of `1,1` and black cells `[[1 3] [3 2] [2 3][3 3]]`

`(traverse 5 [1 1] [[1 3] [3 2] [2 3][3 3]]) ` 

The above example would be traversible 

This algortithm solves by a depth first search, exploring the board from valid positions from the start, and then for each valid position exploring all neighbours until there are no valid moves or unvisited cells from a given position.