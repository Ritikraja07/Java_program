package practice;

import java.util.Scanner;

public class pra_loop1 {
    public static void main(String[] args) {
        // Reverse the digits of a number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        
        while(n>0){
            ans = ans*10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse : " +ans );
        sc.close();
        
    }
    
}
