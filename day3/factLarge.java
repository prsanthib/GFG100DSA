//find the factorial of a larger number

import java.util.*;
import java.math.*;

class factLarge
{
    public static BigInteger fact(int n)
    {
        BigInteger num = new BigInteger("1");
        for(int i = 2 ; i <= n ; i++)
        {
            num = num.multiply(BigInteger.valueOf(i));
        }

        return num;
    }

    public static void main(String args[])
    {
        int n = 100;
        System.out.println(fact(n));
    }
}