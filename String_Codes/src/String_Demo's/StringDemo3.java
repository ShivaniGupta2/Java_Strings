public class StringDemo3
{
    public static void main(String[] args)
    {
        String record = "E1001,Shivani,Mumbai,56000,Programmer";
        String employeeDetails[] = record.split(",");

        System.out.println("Employee Id :-- "+employeeDetails[0]);
        System.out.println("Employee Name :-- "+employeeDetails[1]);
        System.out.println("Employee Location :-- "+employeeDetails[2]);
        System.out.println("Employee Salary :-- "+employeeDetails[3]);
        System.out.println("Employee Designation :-- "+employeeDetails[4]);

        String sentence = "I am learning a new technology called Artificial Intelligence";
        int word_count = sentence.split(" ").length;
        System.out.println("The # of words with in the sentences :"+word_count);

        String studentId = "S231109800035";
        System.out.println("Student Join Year :- "+studentId.substring(1,3));
        System.out.println("Center Code :- "+studentId.substring(3,8));
        System.out.println("Roll # :- "+studentId.substring(8));




    }
}
