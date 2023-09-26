import java.util.Random;
import java.util.Scanner;

public class NumberGame1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int totalRounds = 10;
        int totalScore = 0;
        
        System.out.println("Welcome to the Number Game!");
        
        for (int round = 1; round <= totalRounds; round++) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("\nRound " + round + ":");
            
            System.out.println("Guess the random number between " + minRange + " and " + maxRange);
            
            while (attempts < maxAttempts) {
                System.out.println();
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int guess = scanner.nextInt();
                
                if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + (attempts + 1) + " attempts.");
                    totalScore += maxAttempts - attempts;
                    break;
                }
                attempts++;
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Out of attempts. The number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.println("\nGame over! Your total score is: " + totalScore);
        System.out.println("Thank you for playing!");
        
        scanner.close();
    }
}
