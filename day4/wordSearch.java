//Given a 2D grid of characters and a single word/an array of words, find all occurrences of the given word/words in the grid. A word can be matched in all 8 directions at any point. Word is said to be found in a direction if all characters match in this direction (not in zig-zag form).
//The 8 directions are, Horizontally Left, Horizontally Right, Vertically Up, Vertically Down and 4 Diagonal directions.

class wordSearch
{
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static boolean util(char[][]grid , String word , int i , int j)
    {
        if(grid[i][j] != word.charAt(0))
        {
            return false;
        }

        for(int m = 0 ; m < 8 ; m++)
        {
            int nr = i+x[m];
            int nc = j+y[m];

            int n = word.length();
            int p;
            for( p = 1 ; p < n ; p++)
            {
                if(nr<0 || nr >= grid.length || nc <0 || nc >= grid[0].length)
                {
                    break;
                }
                if(grid[nr][nc] != word.charAt(p))
                {
                    break;
                }

                nr += x[m];
                nc += y[m];
            }

            if(p == n)
            {
                return true;
            }
        }
        return false;

    }

    public static void words(char[][]grid , String word)
    {
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == word.charAt(0) && util(grid,word,i,j))
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static void main(String args[])
    {
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        
        String word = "EEE";
        words(grid,word);
    }
}