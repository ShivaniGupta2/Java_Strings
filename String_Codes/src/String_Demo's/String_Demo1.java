public class String_Demo1
{
    public static void main(String[] args)
    {
        String str1 = "Hello World";

        //length() is a method of string class basically to get the number of character
        System.out.println("Length of string "+str1.length()); //11

        //Here,"Java Tech" is a string literal where we can calculate the no of char
        System.out.println("Java Tech".length()); //9

        //Here, str2 is an Explicit memory location which has been given
        String str2 = new String("Artificial Intelligence");
        String str3 = "Artificial Intelligence";

        System.out.println("Hash Code of the str2 : "+str2.hashCode());
        System.out.println("Hash Code of the str3 : "+str3.hashCode());

    }
}
