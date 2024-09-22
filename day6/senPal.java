// sentence palindrome
//"Too hot to hoot." is a palindromic sentence
import java.util.*;
class senPal
{
    public static void main(String args[])
    {
        String str1 = "          p            p               p";
        String str = str1.toLowerCase();
        int s = 0 ;
        int e = str.length()-1;

        while(s < e)
        {
            while(str.charAt(s) == ' ')
            { 
                
                s++;
            }
            while(str.charAt(e) == ' ')
            {
                e--;
            }
            if(str.charAt(s) != str.charAt(e))
            {
                System.out.println("Not Palindrome");
                return ;
            }
            s++;
            e--;
        }

        System.out.println("Palindrome");


    }
}