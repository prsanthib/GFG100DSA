//use kadans algo
class maxSumSubArr
{
    public static void main(String args[])
    {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            cs += arr[i];

            ms = Math.max(ms,cs);
            if(cs < 0)
            {
                cs = 0;
            }
        }
        System.out.println(ms);
    }
}