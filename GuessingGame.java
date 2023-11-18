package Task2;

import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    private int secretNumber;
    private int attempts;

    public GuessingGame() {
        Random random = new Random();
        this.secretNumber = random.nextInt(100) + 1;
        this.attempts = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            attempts++;

            if (guess == secretNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }



    public static void main(String[] args) {

        GuessingGame game = new GuessingGame();
        game.playGame();
    }
}

