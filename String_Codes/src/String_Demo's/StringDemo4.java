//public class StringDemo4
//{
//    public static String main(String[] args)
//    {
//        String productID = "PRD0010";
//
//        String nextSerialNumber = incrementProductId(productID.substring(3));
//        String nextProductID = "PRD" + nextSerialNumber;
//        System.out.println(nextProductID);
//
//    }
//
//    public static String incrementProductId(String serialnumber)
//    {
//        System.out.println("The serial # :- " + serialnumber);
//        int serialValue = Integer.parseInt(serialnumber);
//        System.out.println(serialValue);
//        serialValue++;
//
//        if (serialValue < 10)
//        {
//            return "000" + String.valueOf(serialValue);
//        } else if (serialValue < 100)
//        {
//            return "00" + String.valueOf(serialValue);
//        } else if (serialValue < 1000)
//        {
//            return "0" + String.valueOf(serialValue);
//        } else
//        {
//            return String.valueOf(serialValue);
//        }
//    }
//
//}
