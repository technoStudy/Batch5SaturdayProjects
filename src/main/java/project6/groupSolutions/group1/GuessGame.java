package project6.groupSolutions.group1;

import java.util.Scanner;

    public class GuessGame {
        int guessNum;
        int guessNumLeft = 5;


        public void letsGuess(int secretNumber) {
            System.out.println("Guess a number between 0 and 100 (inclusive): ");
            while (true) {
                Scanner scanner = new Scanner(System.in);
                guessNum = scanner.nextInt();
                guessNumLeft--;


                if (guessNumLeft <= 0 ){
                    System.out.println( "You lost! Better chance next time.");
                    break;

                }
                if (guessNum == secretNumber) {
                    System.out.println("You won. Congrats!");
                    break;
                }

                if (guessNum < secretNumber) {
                    System.out.println("Your number is small. Try a bigger number: " + "\n" + guessNumLeft + " " + "guesses left" );
                } else if (guessNum > secretNumber) {
                    System.out.println("Your number is big. Try a smaller number: " + "\n" + guessNumLeft + " " + "guesses left");
                }

            }
        }
    }

