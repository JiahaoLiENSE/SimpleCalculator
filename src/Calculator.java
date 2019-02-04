package SimpleCalculator;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an expression: ");

        double x = s.nextDouble();
        String operation = s.next();
        double y = s.nextDouble();

        switch (operation)  {
        case "+":
             System.out.println("The answer is " + (x + y));
             break;

        case "-":
             System.out.println("The answer is " + (x - y));
             break;

        case "/":
            if (y == 0.0) {
                System.out.println("Invalid input!");}
            else{
             System.out.println("The answer is " + (x / y));
            }
             break;

        case "*":
             System.out.println("The asnwer is " + (x * y));
             break;

        default:
             System.out.println("Wrong operation!");

            }
    }
}
