public class CompleteJavaprep {
    public static void main(String[] args){
       // System.out.println("Hello World");
       // System.out.println("My name is aleemuddin");

       //System.out.println(100);
       //System.out.println(3+3);
       //System.out.println(6/2);


       // comment 
       /*
        Multi line comment 
        */

        // Variables

        /*
         String - text
         int
         float
         char -- single char
         boolean
         */

         String randomtext = "Text ";
         char randomchar = 'A'; // single apostraphe

        // System.out.println(randomchar + randomtext);

         // values of variables can be changed on reassigning
         int number = 1;
        // System.out.println(number);
         number = 2;
        // System.out.println(number);

         // to not change values use final

         final int finalnumber = 5;
         // error: finalnumber = 6;
        /// System.out.println(finalnumber);

         //declare more than one variable

         int x, y, z;
         x = y = z = 1;
         char dummy = 'D';
         //System.out.println(x + y + z + dummy);


         // type casting
       //  System.out.println((int)dummy);


        // calculate area of rectangle

        int length = 10;
        int height = 5;
        int area = length * height; 
        System.out.println(area);



        // Dataypes types

        // Primitive: byte, short, int, long, float, double, boolean, char
        // non-primitive String, Arrays, Classes

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
       // System.out.println("Number of items: " + items);
       // System.out.println("Cost per item: " + costPerItem + currency);
       // System.out.println("Total cost = " + totalCost + currency);

       // Type Casting

       // Widening Casting : smaller type to largert type
       // Narrowing Casting: larger type to smaller type


       // Real life example

       int maxScore = 500;
       int currScore = 423;

       float percentage = (float)currScore / maxScore * 100.0f;
       System.out.println(percentage);



       // String operations

       String text = "abcdefghijklmnopqrstuvwxyz";
       System.out.println(text.length());
       System.out.println(text.toLowerCase());
       System.out.println(text.toUpperCase());

       // find index 

       System.out.println(text.indexOf('z'));


       // String Concatenation

       String firstname = "Aleemuddin";
       String lastName = "Mohammad";

       System.out.println(firstname.concat(lastName));


       //numbers and string concatenation

       String p = "10";
       int q = 20;
       String res = p+q;
       System.out.println(res);

       // Math

       int randomNum = (int)(Math.random() * 101);  // 0 to 100
       System.out.println(randomNum);


       // if conditions

       if (20 > 18){
        System.out.println("Condition is true");
       }

       // while consition

       int i = 0 ;
       while (i < 5){
        System.out.println(i);
        i++;
       }

       // for loop

       for (int o = 100; o > 95; o--) {
        System.out.println(o);
       }

       // loop through elements

       String[] muscleGroup = {"Chest", "Bicep", "Tricep", "Forearm", "glutes"};
       for (String muscle : muscleGroup) {
        System.out.println(muscle);
       }

       // Arrays

       String[] cars = {"aa", "ll", "ee", "mm"};
       System.out.println(cars.length);

       for (String car : cars){
        System.out.println(car);
       }


       // Multi dimensional array

       int[][] myNumbers = {{1,2,3,4}, {5,6,7,8}};
       for (int c = 0 ; c < myNumbers.length; c++){
        for (int d = 0; d < myNumbers[c].length; d++){
            System.out.println(myNumbers[c][d]);
       }
    }
    
}
}
