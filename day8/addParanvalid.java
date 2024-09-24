// minimum number of new paranthesis to be added to make a string of paranthesis valid

import java.util.*;
class addParanvalid
{
    public static int util(String str)
    {
        int oc = 0;
        int count = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(')
            {
                oc++;
            }
            else
            {
                if(oc >= 1)
                {
                    oc--;
                }
                else
                {
                    count++;
                }
            }
        }
        return count+oc;
    }

    public static void main(String args[])
    {
        String str = "()))";
        System.out.println(util(str));
    }
}