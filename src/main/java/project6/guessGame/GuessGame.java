package project6.guessGame;

public class GuessGame {

  /*
        Create a non-static method whose name is letsGuess().
        It does not take any parameter.
        Return type is void.

        This method produces a random number, say, secretNumber.
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
    If player enter something else then keep asking and print
      "Please enter a valid option!"
      "Press 1 if you want to continue playing."
      "Press 0 if you do NOT want to continue."
     */

    /*
    Optional Challenge 3:
    Print number of lost and won games. e.g. "You won 4 times and lost 3 times so far."
    Pay attention to plurality while printing the message. e.g. if there is only 1 game won or lost,
    then the message should be like "You won 1 time and lost 3 times so far." or "You won 2 times and lost 1 time so far."
    If there is no game won or lost then the message should be like: "You have not won yet and lost 7 times so far." or
    "You won 1 time and have not lost so far."
     */
}
