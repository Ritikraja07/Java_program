// Create a calculator using switch statement to perform addition, subtraction, multiplication and division.

import java.util.*;

public class switchassignment {
    public static void main(String[] args) {
        char op;
        double num1, num2, ans;
        // using scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator('+' '-' '*' '/'): ");
        op=sc.next().charAt(0);

        //Enter first number.
        System.out.print("Enter first number: ");
        num1=sc.nextInt();

        // Enter second number.
        System.out.print("Enter second number: ");
        num2=sc.nextInt();

        // using switch operator
        switch (op) {
            case '+':
            // Addition
                ans=num1 + num2;
                // Print the answer
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;
            
            case '-':
            // Subtraction
                ans=num1 - num2;
                // Print the answer
                System.out.println(num1 + "-" + num2 + " = " + ans);
                break;

            case '*':
            // Multiplicataion.
                ans=num1 * num2;
                // Print the answer
                System.out.println(num1 + "*" + num2 + " = " + ans);
                break;

            case '/':
            // Division
                ans=num1 / num2;
                // Print the answer
                System.out.println(num1 + "/" + num2 + " = " + ans);
                break;

            default:
                // Print the default value
                System.out.println("Wrong input");
        }
        sc.close();
    }
}
