// //Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1. 
// import java.util.*;
// class setMatrixZeroes
// {
//     public static void main(String args[])
//     {
//         int[][] arr = {{1, 0, 0, 1},{0, 0, 1, 0},{0, 0, 0, 0}};
//         ArrayList<Integer> rows = new ArrayList<>();
//         ArrayList<Integer> cols = new ArrayList<>();

//         for(int i = 0 ; i < arr.length ; i++)
//         {
//             for(int j = 0 ; j < arr[0].length ; j++)
//             {
//                 if(arr[i][j] == 1)
//                 {
//                     if(!rows.contains(i))
//                     {
//                         rows.add(i);
//                     }
//                     if(!cols.contains(j))
//                     {
//                         cols.add(j);
//                     }
//                 }
//             }
//         }
//             for(int i = 0 ; i< arr.length ; i++)
//             {
//                 for(int j = 0 ; j < arr[0].length ; j++)
//                 {
//                     if(rows.contains(i) || cols.contains(j))
//                     {
//                         arr[i][j] = 1;
//                     }
//                 }
//             }


//             for(int i = 0 ; i < arr.length ; i++)
//             {
//                 for(int j = 0 ; j < arr[0].length ; j++)
//                 {
//                     System.out.print(arr[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//instead of using extra spaces we can store info about the same in firstrow and first col

class setMatrixZeroes
{
    public static void main(String args[])
    {
        //int[][] arr = {{1, 0, 0, 1},{0, 0, 1, 0},{0, 0, 0, 0}};
        int arr[][] = {{1, 0},{0, 0}};
        boolean fr = false;
        boolean fc = false;

        for(int i = 0 ; i < arr.length ;i++)
        {
            if(arr[i][0] == 1)
            {
                fc = true;
                break;
            }
        }
        for(int i = 0 ; i < arr[0].length ;i++)
        {
            if(arr[0][i] == 1)
            {
                fr = true;
                break;
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] == 1)
                {
                    arr[i][0] = 1;
                    arr[0][j] = 1;
                }
            }
        }

        for(int i = 1 ; i < arr.length ; i++)
        {
            for(int j = 1 ; j < arr[0].length ; j++)
            {
                if(arr[0][j] == 1 || arr[i][0] == 1)
                {
                    arr[i][j] = 1;
                }
            }
        }

        for(int i = 0 ; i < arr[0].length ; i++)
        {
            if(fr)
            {
                arr[0][i] = 1;
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(fc)
            {
                arr[i][0] = 1;
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }


    }
}