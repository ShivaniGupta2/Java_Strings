package Logical_String_Programs;

//Write a Java Program to Check if Input String is Palindrome.
public class Palindrome
{
    public static void main(String args[])
    {
        String str = "" , reverse = ""; //like: mom , dad , sis, pop , this all are palindrome Words
        str  = str.toUpperCase();

        int strLength = str.length();
        for(int i= (strLength - 1); i>=0; --i)
        {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse.toUpperCase()))
        {
            System.out.println(str+" It is a palindrome String ");
        }
        else
        {
            System.out.println(str+" It's Not a palindrome String ");
        }
    }
}
