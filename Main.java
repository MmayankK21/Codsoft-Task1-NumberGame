import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            System.out.println("\n========================================");
            System.out.println("  Welcome to the Number Guessing Game!");
            System.out.println("========================================\n");

            System.out.print("Enter the minimum number for the range: ");
            int min = sc.nextInt();
            System.out.print("Enter the maximum number for the range: ");
            int max = sc.nextInt();
            sc.nextLine();

            int random = generateRandomNumber(min, max);
            int score = 10;

            System.out.println("\nI have chosen a number from " + min + " to " + max + ".");
            System.out.println("You have 10 attempts to guess it!\n");

            for (int i = 1; i <= 10; i++) {
                System.out.println("\n---- Attempt " + i + " ----");
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                sc.nextLine();

                if (guess == random) {
                    System.out.println("\n🎉 Congratulations! You guessed the correct number: " + random + "!");
                    totalScore += score;
                    break;
                } else {
                    System.out.println("\nIncorrect guess.");
                    score--;
                    if (guess < random) {
                        System.out.println("Hint: Your guess was too low.");
                    } else {
                        System.out.println("Hint: Your guess was too high.");
                    }
                }
            }

            if (score > 0) {
                System.out.println("\nWell done! Your score for this round is: " + score);
            } else {
                System.out.println("\nYou've used all your attempts. The correct number was " + random + ".");
            }

            System.out.print("\nWould you like to play again? (Y/N): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("N")) {
                playAgain = false;
                System.out.println("\nThank you for playing! Your final score is: " + totalScore);
                System.out.println("==============================================");
            }
        }

        sc.close();
    }

    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            System.out.println("Error: The minimum value should be less than or equal to the maximum value.");
            return Integer.MIN_VALUE;
        } else {
            Random random = new Random();
            return random.nextInt((max - min) + 1) + min;
        }
    }
}
