package project6.groupSolutions.group2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    int guessAttempt, userPlayChoice, secretNumber, gamesLost, gamesWon;

    String options = "\nPress 1 if you want to continue playing\nPress 0 if you do not want to continue.";

    void letsGuess(int secretNumber) {
        guessAttempt = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess a number between 0 to 100:");

        while (guessAttempt >= 0) {
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.print("You won!");
                gamesWon++;
                break;
            } else if (guessAttempt == 0) {
                gamesLost++;
                System.out.print("Game over. The number was: " + secretNumber + "\n");
            } else if (userGuess > secretNumber && userGuess <= 100) {
                System.out.print("Your number is big. Try smaller (You have " + guessAttempt + " attempts left) : ");
            } else if (userGuess < secretNumber && userGuess >= 0) {
                System.out.print("Your number is small. Try bigger (You have " + guessAttempt + " attempts left) : ");
            } else {
                System.out.print("Please enter a valid number: (You have " + guessAttempt + " attempts left) : ");
            }
            guessAttempt--;
        }
    }
        void gameMenu() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            secretNumber = random.nextInt(100);
            letsGuess(secretNumber);

            mainLoop : while (true) {
                System.out.print("Do you want to play again?" + options);
                userPlayChoice = scanner.nextInt();
                switch (userPlayChoice) {
                    case 1:
                        secretNumber = random.nextInt(100);
                        letsGuess(secretNumber);
                        break;
                    case 0:
                        exitMessage();
                        break mainLoop;
                    default:
                        System.out.print("Please enter a valid number. ");
                        break;
                }
            }
        }
        void exitMessage() {
            if (gamesWon > 1) {
                if (gamesLost > 1)
                    System.out.println("You won " + gamesWon + " times and lost " + gamesLost + " times.");
                else
                    System.out.println("You won " + gamesWon + " times and lost " + gamesLost + " time.");
            } else {
                if (gamesLost > 1)
                    System.out.println("You won " + gamesWon + " time and lost " + gamesLost + " times.");
                else
                    System.out.println("You won " + gamesWon + " time and lost " + gamesLost + " time.");
            }
        }

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

