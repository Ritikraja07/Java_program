package practice;

import java.util.Scanner;

public class pra_loop1 {
    public static void main(String[] args) {
        // Reverse the digits of a number.
        // using scanner class
        Scanner sc = new Scanner(System.in);
        // Taking an integer value
        int n = sc.nextInt();
        // taking an integer value
        int ans = 0;
        // using while loop
        
        while(n>0){
            // calculating the answer
            ans = ans*10 + n % 10;
            // the value of n
            n /= 10;
        }
        // Print the answer
        System.out.println("Reverse : " +ans );
        // close the scanner
        sc.close();
        
    }
    
}
