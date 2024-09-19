//Find Non-overlapping intervals among a given set of intervals
//int arr[] = {{1, 3}, {2, 4}, {3, 5}, {7, 9}};
//ans should be [5,7]
import java.util.*;
class findNonOLInter
{
    public static void main(String ars[])
    {
        //int arr[][] = {{1, 3}, {2, 4}, {3, 5}, {7, 9}};
        int arr[][] = { {1, 3}, {9, 12}, {2, 4}, {6, 8} } ;
        Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i][1] < arr[i+1][0])
            {
                System.out.println("["+arr[i][1]+" "+arr[i+1][0]+"]");
            }
        }        
    }
}