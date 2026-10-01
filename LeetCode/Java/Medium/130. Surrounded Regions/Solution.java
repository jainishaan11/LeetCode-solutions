class Solution {
    public void solve(char[][] board) 
    {
        Queue<Integer> pq = new LinkedList<>();

        for(int i = 1; i < board.length - 1; i++)
        {
            for(int j = 1; j < board[0].length - 1; j++)
            {
                if(board[i][j] == 'O')
                {
                    if(loop(board, i, j))
                    {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }

    public boolean loop(char[][] board, int x, int y)
    { 
        int i = 0;
        boolean c = false;

        while(x + i < board.length)
        {
            if(board[x + i][y] == 'X')
            {
                c = true;
                break;
            }
            i++;
        }

        if(c == false)
        {
            return false;
        }

        i = 0;
        c = false;

        while(y + i < board[0].length)
        {
            if(board[x][y + i] == 'X')
            {
                c = true;
                break;
            }
            i++;
        }

        if(c == false)
        {
            return false;
        }

        i = 0;
        c = false;

        while(x + i >= 0)
        {
            if(board[x + i][y] == 'X')
            {
                c = true;
                break;
            }
            i--;
        }

        if(c == false)
        {
            return false;
        }

        i = 0;
        c = false;

        while(y + i >= 0)
        {
            if(board[x][y + i] == 'X')
            {
                c = true;
                break;
            }
            i--;
        }

        return c;
    }
}