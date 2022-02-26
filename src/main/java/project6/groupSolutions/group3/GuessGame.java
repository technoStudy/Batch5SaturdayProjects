package project6.groupSolutions.group3;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    int counts = 1;
    int numOfWin = 0;
    int numOfLose = 0;
    final int MAXIMUM = 5;
    Scanner scanner = new Scanner(System.in);

    public void letsGuess(int secretNumber) {
        System.out.print("Guess a number between 0 and 100 (inclusive): ");
        int guessNum = inputDate();
        while (guessNum != secretNumber && counts < MAXIMUM) {
            if (guessNum < secretNumber)
                System.out.print("Your number is small. Try a bigger number ");
            else
                System.out.print("Your number is big. Try a smaller number ");

            System.out.print(PromptStatement(counts) + ": ");
            counts++;
            guessNum = inputDate();
        }

        if ((counts == MAXIMUM && guessNum != secretNumber) || guessNum == -1) {
            System.out.println("\n[###You lost! Better chance next time.###]");
            numOfLose++;
        } else {
            System.out.println("\n[###########You won. Congrats!###########]");
            numOfWin++;
        }
        System.out.println("[###THE ANSWER IS " + secretNumber + " ###]");
        endingStatement();
        reStartGame();
    }


    //Deal with input data
    public int inputDate() {
        String str = scanner.nextLine();
        while (!str.matches("([0]|[1-9]|[1-9][0-9]|100)")) {            //positive integer 0-100
            if (counts == 5) {
                str = "-1";                                                 //set str = -1 , input invalid data when fifth try
                break;
            }
            System.out.print("Please enter a valid number " + PromptStatement(counts) + ": ");
            str = scanner.nextLine();
            counts++;
        }
        return Integer.parseInt(str);

    }


    //Challenge 1
    public String PromptStatement(int counts) {
        if (counts == 4)
            return "(Only one guess left)";
        else
            return "(" + (MAXIMUM - counts) + " guesses left)";
    }


    //Challenge 2
    public void reStartGame() {
        String key;
        Random random = new Random();
        System.out.println("#-------Do you want to play again?--------#");
        System.out.println("###########################################");
        System.out.println("# Press 1 if you want to continue playing.#");
        System.out.println("# Press 0 if you do NOT want to continue. #");
        System.out.println("###########################################");
        key = scanner.nextLine();
        while (!(key.equals("0") || key.equals("1"))) {
            System.out.println("#-------Please enter a valid option!------#");
            System.out.println("###########################################");
            System.out.println("# Press 1 if you want to continue playing.#");
            System.out.println("# Press 0 if you do NOT want to continue. #");
            System.out.println("###########################################");
            key = scanner.nextLine();
        }
        if (key.equals("1")) {
            counts = 1;
            letsGuess(random.nextInt(101));
        }
    }


    //Challenge 3
    public void endingStatement() {
        String winTime = numOfWin == 1 ? "time" : "times";
        String loseTime = numOfLose == 1 ? "time" : "times";
        if (numOfWin == 0 && numOfLose != 0) {
            System.out.println("[You have not won yet and lost " + numOfLose + " " + loseTime + " so for.]\n");
        } else if (numOfWin != 0 && numOfLose == 0) {
            System.out.println("[You won " + numOfWin + " " + winTime + " " + "and have not lost so far.]\n");
        } else {
            System.out.println("[You won " + numOfWin + " " + winTime + " " +
                    "and lost " + numOfLose + " " + loseTime + " so far.]\n");
        }
    }
}