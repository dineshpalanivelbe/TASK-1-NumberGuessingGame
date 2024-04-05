import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1; 
        int maxRange = 100; 
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". Can you guess what it is?");
        
        do {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < minRange || guess > maxRange) {
                System.out.println("Your guess is out of the valid range. Please guess a number between " + minRange + " and " + maxRange + ".");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != targetNumber);
        
        System.out.println("Congratulations! You've guessed the correct number (" + targetNumber + ") in " + attempts + " attempts.");
        scanner.close();

	}

}
