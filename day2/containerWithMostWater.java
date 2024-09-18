class containerWithMostWater
{
    public static void main(String args[])
    {
        int arr[] = {1, 5, 4, 3};
        int max = Integer.MIN_VALUE;

        int l = 0;
        int r = arr.length-1;

        while(l < r)
        {
            int ht = Math.min(arr[l],arr[r]);
            int wd = r-l;
            max = Math.max(max,ht*wd);

            if(arr[l] < arr[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        System.out.println(max);
    }
}