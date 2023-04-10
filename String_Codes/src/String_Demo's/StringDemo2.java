public class StringDemo2
{
    public static void main(String[] args)
    {
        String str1 = "Shivani";
        System.out.println("UpperCase version of Str1 :---"+str1.toUpperCase());
        System.out.println("LowerCase version of Str2 :---"+str1.toLowerCase());

        String str2 = "Pavitra";
        String str3 = "Parvathi";

        System.out.println(str2.compareTo(str3)); //4 It denotes the first string is bigger than second string
        System.out.println(str3.compareTo(str2)); //-4 It denotes the First string is smaller than second string
        System.out.println(str2.compareTo(str2)); //0 It means the string is Equal


    }
}
