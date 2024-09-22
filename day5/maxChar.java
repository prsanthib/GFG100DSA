//Given a string, the task is to find the maximum consecutive repeating character in a string.
//Note: We do not need to consider the overall count, but the count of repeating that appears in one place.

import java.util.*;
class maxChar
{
    public static void  main(String args[])
    {
        String str = "eeooopppkkkkkllll";
        int c = 0;
        char ch = '-';
        char res =' ';

        int tc = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == ch)
            {
                tc++;
            }
            else
            {
                tc = 1;
                ch = str.charAt(i);
            }
            
            if(tc > c)
            {
                c = tc;
                res = str.charAt(i);
            }
        }

        System.out.println(res);
    }
}