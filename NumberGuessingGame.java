import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int score = 0;
        boolean PA = true;

        while (PA) {
            int targetNumber = random.nextInt(100) + 1;
            int A = 0;
            int MA = 5;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (A < MA) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                A++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + A + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (A >= MA) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            PA = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        scanner.close();
    }
}