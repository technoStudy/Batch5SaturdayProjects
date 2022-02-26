package project6.groupSolutions.group4;

import java.util.Random;

public class LetUsPlay {

    /*
        Create the main method.
        Create a random number between 0 and 100 inclusive.
        Call the letsGuess() method of GuessGame class passing the random number generated as the argument.
        Enjoy your game!!!
      */

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(101);

        GuessGame newGame = new GuessGame();
        newGame.letsGuess(randomNumber);

    }



}
