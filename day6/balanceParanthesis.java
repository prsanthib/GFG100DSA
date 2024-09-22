// Balance paranthesis
import java.util.*;
class balanceParanthesis
{
    public static void main(String args[])
    {
        String str = "()()(((())))";
        int c = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(')
            {
                c++;
            }
            else
            {
                if(c == 0)
                {
                    System.out.println("False");
                    return ;
                }
                c--;
            }
        }
        if(c==0)
        {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}