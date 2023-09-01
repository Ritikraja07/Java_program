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
        
        while(n>0){
            // calculating the answer
            ans = ans*10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse : " +ans );
        sc.close();
        
    }
    
}
