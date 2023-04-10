import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringDemo5
{
    public static void main(String[] args)
    {
        String sentence = "Hello this is very unusal . this kind of things is really wried";
        String words[] = sentence.split(" ");
        System.out.println(words.length);

        LinkedHashSet<String> distinctString = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(distinctString);

    }
}
