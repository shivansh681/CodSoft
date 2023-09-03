import java.util.*;

public class Game {
    public static void main(String[] args) {
        initiateGuessing();
    }

    public static void initiateGuessing() {
        Random randomNumberGenerator = new Random();
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game! You have three chances to guess the correct number.");
        
        while (true) {
            int targetNumber = randomNumberGenerator.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < 3) {
                attempts++;
                System.out.println("Enter a number within a range 1 and 100: ");
                
                if (!inputScanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    inputScanner.next(); // Clear the invalid input
                    continue;
                }

                int userGuess = inputScanner.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number within the range of 1 to 100.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Congratulations! You guessed correctly.");
                    System.out.println("Number of attempts: " + attempts);
                    break;
                }
            }

            System.out.println("Press 1 to play again or any other key to exit.");
            int playChoice = inputScanner.nextInt();
            
            if (playChoice != 1) {
                inputScanner.close();
                return;
            }
        }
    }
}