package Logical_String_Programs;

//Write a program To Count the Occurence of subString
public class CountOccOFsubstring
{
    public static void main(String[] args)
    {
        String str = "Hello World";
        String str1 = "o";
        System.out.println("The Original Strings are :- "+"\n"+str);
        System.out.println("Count of occurence  of string are :-"+subString(str,str1));

    }
    public static int subString(String str1,String sub)
    {
        if(str1.contains(sub))
        {
            return 1+subString(str1.replaceFirst(sub,""),sub);
        }
        return 0;
    }
}
