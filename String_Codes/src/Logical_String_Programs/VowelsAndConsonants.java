package Logical_String_Programs;

//Write a Java Program to Count Vowels and Consonants in a String.
public class VowelsAndConsonants
{
    public static void main(String args[])
    {
        int vowelCount = 0;
        int consonantCount = 0;

        String str = "Welcome to The java World of Programming";
        str = str.toLowerCase();
        System.out.println("Original String :- "+str);


        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                vowelCount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                consonantCount++;
            }
        }

        System.out.println("Total Vowels in Strings are :-- "+vowelCount);
        System.out.println("Total Consonants in Strings are :-- "+consonantCount);


    }
}
