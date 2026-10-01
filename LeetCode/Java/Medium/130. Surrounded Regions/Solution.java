class Solution 
{
    public void solve(char[][] board) 
    {
        for(int i = 0; i < board[0].length; i++)
        {
            if(board[0][i] == 'O')
            {
                board[0][i] = '#';
                loop(board, 0, i);
            }

            if(board[board.length - 1][i] == 'O')
            {
                board[board.length - 1][i] = '#';
                loop(board, board.length - 1, i);
            }
        }

        for(int j = 0; j < board.length; j++)
        {
            if(board[j][0] == 'O')
            {
                board[j][0] = '#';
                loop(board, j, 0);
            }

            if(board[j][board[0].length - 1] == 'O')
            {
                board[j][board[0].length - 1] = '#';
                loop(board, j, board[0].length - 1);
            }
        }

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#')
                {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void loop(char[][] board, int x, int y)
{
    board[x][y] = '#';

    if(x + 1 < board.length && board[x + 1][y] == 'O')
        loop(board, x + 1, y);

    if(x - 1 >= 0 && board[x - 1][y] == 'O')
        loop(board, x - 1, y);

    if(y + 1 < board[0].length && board[x][y + 1] == 'O')
        loop(board, x, y + 1);

    if(y - 1 >= 0 && board[x][y - 1] == 'O')
        loop(board, x, y - 1);
}
}