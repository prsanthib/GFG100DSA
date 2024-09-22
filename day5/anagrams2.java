//Check whether two Strings are anagram of each other
import java.util.*;
class anagrams2
{
    public static void main(String args[])
    {
        String s1 = "cat";
        String s2 = "tact";

        int[] temp = new int[26];

        for(int i = 0; i < s1.length() ; i++)
        {
            temp[s1.charAt(i)-'a']++;
        }
        for(int i = 0; i < s2.length() ; i++)
        {
            temp[s2.charAt(i)-'a']--;
        }

        for(int i = 0 ; i < 26 ; i++)
        {
            if(temp[i] != 0)
            {
                System.out.println("false");
                return ;
            }
        }
        System.out.println("true");
    }
}