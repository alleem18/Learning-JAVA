import java.util.Scanner;

public class ArithemeticOperations {
    public static void main(String[] args) {

        // declaring necessary variables
        int a, b, sum, diff, mul, div;

        // declaring scanner for the input of integers
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the first number:");
        // Assigning first integer to a
        a = x.nextInt();        

        System.out.println("Enter the second number:");
        // Assigning second integer to b
        b = x.nextInt();


        // Arithemetic Operations
        sum = a+b;
        diff = a - b;
        mul = a * b;
        div = a / b;
        System.out.printf("sum: %d\n diff: %d\n mul: %d\n Div: %d\n", sum, diff, mul, div);
        x.close();

    }
}
