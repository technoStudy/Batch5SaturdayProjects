package project6.groupSolutions.group3;

import java.util.Random;

public class LetUsPlay {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        GuessGame guessGame = new GuessGame();
        guessGame.letsGuess(randomNumber);
    }
}