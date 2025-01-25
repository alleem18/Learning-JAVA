public class datatypes {

    public static void main(String[] args) {
        // integral numbers - find range of each by : System.out.println(Byte.MIN_VALUE)
           // byte
           // short
           // int
           // long
          
        // decimal numbers
            // float - small decimal numbers --> Max 7 digits stored
            // double - large decimal numbers --> max 15 digits stored
        //float mysalary;
        //mysalary = 10000.50077f;
        //System.out.println(mysalary);


        // characters
            // char - Single character stored
        
        char initialOne = 'A';
        System.out.println(initialOne);

        // type casting  char A to a number

        System.out.println((int)initialOne);

        // type casting number to a char -- char can be anything including an alphabet ort a symbol

        int heartNumber = 10084;
        System.out.println((char)heartNumber);


        // Widening Conversion - Automatic typecastingconversion from one daatype to another
        // Converting the "B" character to its integer value by declaring a new int variable and assiging it to the char variable
        char charValue  = 'B'; 
        int intvalue = charValue;
        System.out.println(charValue);
        System.out.println(intvalue);

        // narrowing Conversion - eg: long to float or long to int

        long a = 12345;
        float b = (float) a;
        System.out.println(b);

        long maxLongValue = Long.MAX_VALUE;
        System.out.println(maxLongValue);
        int maxLongValuetoInt = (int) maxLongValue;
        System.out.println(maxLongValuetoInt);


        // Boolean

        boolean yes = true ;
        System.out.println(yes);

        boolean no = false;
        System.out.println(no);

        
    }
    
}
