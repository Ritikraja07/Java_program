// Take an array of names as input from the user and print them on the screen.

package Arrays;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String name[] = new String[size];

        // input

        for(int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        // output

        for(int i = 0; i < name.length; i++) {
            System.out.println("name " + (i+1) +" is : " + name[i]);
        }

        sc.close();
    }
    
}
