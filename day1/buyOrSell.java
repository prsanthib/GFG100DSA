class buyOrSell
{
    public static void main(String args[])
    {
        int arr[] = {7, 10, 1, 3, 6, 9, 2};

        int bp = arr[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1 ; i < arr.length ; i++)
        {
            int sp = arr[i];
            if(sp > bp)
            {
                maxProfit = Math.max(maxProfit,sp-bp);
            }                
            else
            {
                bp = sp;
            }
        }

        System.out.println(maxProfit);
    }
}