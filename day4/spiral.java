import java.util.*;
class spiral
{
    public static void main(String args[])
    {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sr = 0;
        int sc = 0;
        int er = mat.length-1;
        int ec = mat[0].length-1;

        while(sr<=er && sc<=ec)
        {
            for(int i = sc ; i <= ec ; i++)
            {
                System.out.println(mat[sr][i]);
            }
            for(int i = sr+1 ; i <= er ; i++)
            {
                System.out.println(mat[i][ec]);
            }
            for(int i = ec-1 ; i >= sc ; i--)
            {
                if(sr==er)
                {
                    continue;
                }
                System.out.println(mat[er][i]);
            }
            for(int i = er-1 ; i >= sr+1 ; i--)
            {
                if(sc == ec)
                {
                    continue;
                }
                System.out.println(mat[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    }
}