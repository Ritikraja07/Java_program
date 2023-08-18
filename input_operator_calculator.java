// Create a calculator using switch statement to perform addition, subtraction, multiplication and division.

import java.util.*;

public class switchassignment {
    public static void main(String[] args) {
        char op;
        double num1, num2, ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator('+' '-' '*' '/'): ");
        op=sc.next().charAt(0);

        //Enter first number
        System.out.print("Enter first number: ");
        num1=sc.nextInt();

        System.out.print("Enter second number: ");
        num2=sc.nextInt();

        switch (op) {
            case '+':
            // Addition
                ans=num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;
            
            case '-':
            // Subtraction
                ans=num1 - num2;
                System.out.println(num1 + "-" + num2 + " = " + ans);
                break;

            case '*':
            // Multiplicataion.
                ans=num1 * num2;
                System.out.println(num1 + "*" + num2 + " = " + ans);
                break;

            case '/':
            // Division
                ans=num1 / num2;
                System.out.println(num1 + "/" + num2 + " = " + ans);
                break;

            default:
                System.out.println("Wrong input");
        }
        sc.close();
    }
}
