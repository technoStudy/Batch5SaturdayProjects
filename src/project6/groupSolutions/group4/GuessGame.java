package project6.groupSolutions.group4;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public void letsGuess(int secretNumber){
        int choice;
        int guessAttemptLeft;
        int playMore;
        int gamesWon = 0;
        int gamesLost = 0;

        do{
            guessAttemptLeft = 5;
            System.out.println("\n===================================================================");
            System.out.print("Guess a number between 0 and 100 (inclusive): ");

            while (guessAttemptLeft >= 0) {
                guessAttemptLeft--;

                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    if (guessAttemptLeft == 0) {
                        System.out.println("You lost! Better chance next time.");
                        System.out.println("Result is: " + secretNumber);
                        gamesLost++;
                        break;
                    }else if (guessAttemptLeft == 1)
                        System.out.print("Please enter a valid number (Only one guess left): ");
                    else
                        System.out.print("Please enter a valid number (" + guessAttemptLeft + " guesses left): ");

                    continue;
                }

                if (choice == secretNumber) {
                    System.out.println("You won. Congrats!");
                    gamesWon++;
                    break;
                }

                if (guessAttemptLeft == 0) {
                    System.out.println("You lost! Better chance next time.");
                    System.out.println("Result is: " + secretNumber);
                    gamesLost++;
                    break;
                }else if (guessAttemptLeft == 1) {
                    if (choice < 0 || choice > 100) {
                        System.out.print("Please enter a valid number (Only one guess left): ");
                    } else if (choice < secretNumber) {
                        System.out.print("Your number is small. Try a bigger number (Only one guess left): ");
                    } else {
                        System.out.print("Your number is big. Try a smaller number (Only one guess left): ");
                    }
                }else{
                    if (choice < 0 || choice > 100) {
                        System.out.print("Please enter a valid number (" + guessAttemptLeft + " guesses left): ");
                    } else if (choice < secretNumber) {
                        System.out.print("Your number is small. Try a bigger number (" + guessAttemptLeft + " guesses left): ");
                    } else {
                        System.out.print("Your number is big. Try a smaller number (" + guessAttemptLeft + " guesses left): ");
                    }
                }
            }

            /**
             * Challenge 2: Do you want to play again?
             */

            System.out.println("\nDo you want to play again?" +
                    "\nPress 1 if you want to continue playing." +
                    "\nPress 0 if you do NOT want to continue.");
            while(true) {
               Scanner playMoreInput = new Scanner(System.in);
               if (playMoreInput.hasNextInt()) {
                   playMore = playMoreInput.nextInt();
                   if (playMore == 0 || playMore == 1) {
                       break;
                   }
               }
               System.out.println("\nPlease enter a valid option!" +
                       "\nPress 1 if you want to continue playing." +
                       "\nPress 0 if you do NOT want to continue.");
            }

            /**
             *  Random number (updated) for the new round
             *  need if a player wants to play again
             */
            Random rand = new Random();
            secretNumber = rand.nextInt(101);

        }while (playMore == 1);

        /**
         * Challenge 3: Print number of lost and won games
         */
        System.out.println();

        if (gamesWon == 0){
            if (gamesLost == 1)
                System.out.println("You have not won yet and lost 1 time so for.");
            else
                System.out.println("You have not won yet and lost " + gamesLost + " times so for.");
        }else if (gamesWon == 1){
            if (gamesLost == 0)
                System.out.println("You won 1 time and have not lost so far.");
            else if (gamesLost == 1)
                System.out.println("You won 1 time and lost 1 time so far.");
            else
                System.out.println("You won 1 time and lost " + gamesLost + " times so for.");
        }else {
            if (gamesLost == 0)
                System.out.println("You won " + gamesWon + " times and have not lost so far.");
            else if (gamesLost == 1)
                System.out.println("You won " + gamesWon + " times and lost 1 time so far.");
            else
                System.out.println("You won " + gamesWon + " times and lost "  + gamesLost + " times so far.");

        }

        System.out.println("---------------------------------------------------------------------");
    }

  /*
        Create a non-static method whose name is letsGuess().
        This method takes an int as a parameter, say, secretNumber.
        Return type is void.

        In this method you must continue to guess number(s) until you hit the correct number which is the secretNumber.
        Method prints "Guess a number between 0 and 100 (inclusive): " in the beginning of the game.
        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number: ".
        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number: ".
        When the guess number is equal to the secretNumber then print "You won. Congrats!". And stop execution.
        When the guess is not a valid number (including any letter or special character)
          then print "Please enter a valid number: ". This counts as a wrong guess.

        The maximum number of guess attempts is 5.
        If the guesses reach to 5 than print "You lost! Better chance next time." And stop execution.

        Note:
         1) For guessing a number Scanner class is used.
         2) The method is not a static method.
     */

     /*
    Optional Challenge 1:
    Modify the re-guess message as follows:
    Each time the player have a wrong guess,
    - if the player has more than one guess, then the message should be like
        "Your number is small. Try a bigger number (4 guesses left): " or
        "Your number is big. Try a smaller number (2 guesses left): " or
        "Please enter a valid number (3 guesses left): "
    - if the player has only one guess left, then the message should be like
        "Your number is small. Try a bigger number (Only one guess left): " or
        "Your number is big. Try a smaller number (Only one guess left): " or
        "Please enter a valid number (Only one guess left): "
     */

    /*
    Optional Challenge 2:
    When the game is over, ask player if he/she wants to play again by printing the following menu.
      "Do you want to play again?"
      "Press 1 if you want to continue playing."
      "Press 0 if you do NOT want to continue."
    If player types 1 then re-start the game.
    If player types 0 then stop executing.
    If player enter something else then print
      "Please enter a valid option!"
      "Press 1 if you want to continue playing."
      "Press 0 if you do NOT want to continue."
     */

    /*
    Optional Challenge 3:
    Print number of lost and won games. e.g. "You won 4 times and lost 3 times so far."
    Pay attention to plurality while printing the message. e.g. if there is only 1 game won or lost,
    then the message should be like "You won 1 time and lost 3 times so far." or "You won 2 times and lost 1 time so far."
    If there is no game won or lost then the message should be like: "You have not won yet and lost 7 times so for." or
    "You won 1 time and have not lost so far."
     */
}
