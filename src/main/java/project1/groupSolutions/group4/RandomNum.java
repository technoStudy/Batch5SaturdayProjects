package project1.groupSolutions.group4;

import java.util.Scanner;

public class RandomNum {
    /*
    Given a positive integer number whose name is max,

    create a random number between 0 to max (inclusive)

    output should be int
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.

        int randomNumber = (int) (Math.random()*(max+1));
        System.out.println(randomNumber);

    }
}