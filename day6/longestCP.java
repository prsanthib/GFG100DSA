// longest common prefix
import java.util.*;
class longestCP
{
    public static String findCommon(String s1 , String s2)
    {
        String str = "";
        int ml = Math.min(s1.length() , s2.length());

        for(int i = 0 ; i < ml ; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                break;
            }
            str += s1.charAt(i);
        }

        return str;
    }

    public static void main(String args[])
    {
        String[] str = {"geeksforgeeks", "geeks", "gek" , "geezer"};
        //sort and find commonn pre b/w 1st and last

        Arrays.sort(str);
        System.out.println(findCommon(str[0],str[str.length-1]));
    }
}