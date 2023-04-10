package Logical_String_Programs;

//Write a Java Program to Reverse Each Word of a String .

public class ReverseString
{
    public static void main(String args[])
    {
        String str1 = "Welcome to the world of java";
        System.out.println(reverse(str1));
     }

     public static String reverse(String s)
     {
         StringBuffer sb = new StringBuffer(s);
         s = sb.reverse().toString();

         String rev[] = s.split(" ");

         StringBuffer reverse = new StringBuffer();

         for(int i=rev.length -1; i>=0; i--)
         {
             reverse.append(rev[i]).append(" ");
         }
         return reverse.toString();
     }
}
