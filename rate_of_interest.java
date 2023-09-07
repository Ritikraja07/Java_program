

import java.util.*;

public class rate_of_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculating rate of interest

        // Enter the principle
        System.out.println("Enter principle: ");        
        float principle = sc.nextFloat();

        // Enter rate of interest
        System.out.println("Enter rate of interest: ");
        // using float value
        float rate = sc.nextFloat();

        // total time
        System.out.println("Enter time: ");
        int time = sc.nextInt();

         // to calculate the rate of interest
        // Rate of interst= (p*r*t)/10
        float interest = (principle*rate*time)/100;

        // Final result will be:- 
        System.out.println("Rate of interest is: "+interest);
        sc.close();
    }
    
}
