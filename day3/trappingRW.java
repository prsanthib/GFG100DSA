import java.util.*;
class trappingRW
{
    public static int trw(int arr[])
    {
        int lm[] = new int[arr.length];
        int rm[] = new int[arr.length];

        lm[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            lm[i] = Math.max(lm[i-1],arr[i]);
        }

        rm[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2 ; i >= 0 ; i--)
        {
            rm[i] = Math.max(rm[i+1],arr[i]);
        }

        int wtlev = 0;
        for(int i =  0 ; i < arr.length ; i++)
        {
            wtlev += Math.min(lm[i],rm[i])-arr[i];
        }
        
        return wtlev;

    }

    public static void main(String args[])
    {
        int arr[] = {3,0,1,0,4,0,2};
        System.out.println(trw(arr));
    }
}