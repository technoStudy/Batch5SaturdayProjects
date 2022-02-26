package project6.solution;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    static int counterForWon;
    static int counterForLost;

    public void letsGuess() {
        Random random = new Random();
//        int secretNumber = random.nextInt(101);
        int secretNumber = 50;
        System.out.print("Guess a number between 0 and 100: ");
        int counter = 0;
        do {
            int guessNumber;
            try {
                Scanner scanner = new Scanner(System.in);
                guessNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                guessNumber = -1;
            }
            if ((guessNumber > 100 || guessNumber < 0) && counter != 4) {
                System.out.print("Please enter a valid number: ");
            } else if (guessNumber < secretNumber && counter != 4) {
                System.out.print("Your number is small. Try a bigger number ");
            } else if (guessNumber > secretNumber && counter != 4) {
                System.out.print("Your number is big. Try a smaller number ");
            } else if (guessNumber == secretNumber) {
                counterForWon++;
                System.out.println("\nYou won. Congrats!");
                break;
            }
            counter++;
            if (counter != 5) System.out.print((counter == 4) ? "(Only one guess left): " : "(" + (5 - counter) + " guesses left): "); // Challenge - 1
        } while (counter < 5);

        if (counter == 5) {
            counterForLost++;
            System.out.println("\nYou lost! Better chance next time");
        }
        System.out.println("\n" + getWonResult() + getLostResult());   // Challenge - 3
        playAgain();   // Challenge - 2
    }

    ////////////////////// Challenge 2 //////////////////////////
    private void playAgain() {
        String selection = null;
        do {
            System.out.println(selection == null ? "\nDo you want to play again?" : "Please enter a valid option!");
            System.out.println("Press 1 if you want to continue playing.");
            System.out.println("Press 0 if you do NOT want to continue.");
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextLine();
        } while (!selection.equals("1") && !selection.equals("0"));
        if (selection.equals("1")) letsGuess();
    }
/////////////////////////////////////////////////////////

    ///////////////////// Challenge 3 //////////////////////////
    private String getWonResult() {
        switch (counterForWon) {
            case 0:
                return "You have not won yet and ";
            case 1:
                return "You won 1 time and ";
            default:
                return "You won " + counterForWon + " times and ";
        }
    }

    private String getLostResult() {
        switch (counterForLost) {
            case 0:
                return "have not lost so far.";
            case 1:
                return "lost 1 time so far.";
            default:
                return "lost " + counterForLost + " times so far.";
        }
    }
//////////////////////////////////////////////////////////
}
