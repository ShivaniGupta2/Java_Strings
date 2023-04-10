public class StringDemo6
{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        System.out.println("Hash code of str1 :- "+str1.hashCode());
        str1.concat("Naresh");
        System.out.println(str1);
        System.out.println("Hash Code of str1 is :- "+str1.hashCode());


        String str2 = "Hi";
        System.out.println("Hash code of str2 :- "+str2.hashCode());
        str2 = str2.concat(str2);
        System.out.println("Hash code of str2 :- "+str2.hashCode());


    }
}
