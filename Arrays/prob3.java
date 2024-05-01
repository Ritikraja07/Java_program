// Take an array as input from the user. Search for a given number x and print the index at which it occurs.


package Arrays;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the number: ");
        
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Which number you have to find: ");
        int x = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }

        sc.close();

    }
    
}
