package project6.groupSolutions.group1;

import java.util.Random;

public class LetUsPlay {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(101);
      GuessGame myGuessGame = new GuessGame();
        myGuessGame.letsGuess(randomNum);
    }
}
