//Longest Valid Parentheses Substring
// Given a string str consisting of opening and closing parenthesis ‘(‘ and ‘)‘. Find the length of the longest valid parenthesis substring.

import java.util.*;
class lenoflongpar
{
    public static void main(String args[])
    {
        String str = "(((()))";
        int oc = 0;
        int cc = 0;
        int maxlen = Integer.MIN_VALUE;
        
        //left to right traversal

        for(int i = 0 ; i < str.length() ; i++ )
        {
            if(str.charAt(i) == '(')
            {
                oc++;
            }
            else 
            {
                cc++;
            }

            if(cc == oc)
            {
                maxlen = Math.max(maxlen , 2*oc);
            }
            if(cc>oc)
            {
                cc = 0;
                oc = 0;
            } 
        }

        cc = 0;
        oc = 0;
         for(int i = str.length()-1 ; i >= 0  ; i-- )
        {
            if(str.charAt(i) == '(')
            {
                oc++;
            }
            else 
            {
                cc++;
            }

            if(cc == oc)
            {
                maxlen = Math.max(maxlen , 2*oc);
            }
            if(cc<oc)
            {
                cc = 0;
                oc = 0;
            } 
        }

        System.out.println(maxlen+" ");
    }
}