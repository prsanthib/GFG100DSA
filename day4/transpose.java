import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        int A[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };

        int B[][] = new int[A.length][A[0].length];
        for(int i = 0 ; i < B.length ; i++)
        {
            for(int j = 0 ; j < B[0].length ; j++)
            {
                B[i][j] = A[j][i];
            }
        }    

        for(int i = 0 ; i < B.length ; i++)
        {
            for(int j = 0 ; j < B[0].length ; j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

    }
}