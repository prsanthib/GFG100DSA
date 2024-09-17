//Given an array arr[] of n integers, construct a Product Array prod[] (of the same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. 

//Note: Solve it without the division operator in O(n) time.

class prodOfArrExceptItself
{
    public static void main(String args[])
    {
        int arr[]  = {10, 3, 5, 6, 2};
        int prod[] = new int[arr.length];
        int lp[] = new int[arr.length];
        int rp[] = new int[arr.length];

        lp[0] = 1;
        rp[arr.length-1] = 1;

        for(int i = 1 ; i < arr.length ; i++)
        {
            lp[i] = lp[i-1]*arr[i-1];
        }

        for(int i = arr.length-2 ; i >= 0 ; i--)
        {
            rp[i] = rp[i+1]*arr[i+1];
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            prod[i] = lp[i]*rp[i];
            System.out.println(prod[i]);
        }
    }

}
