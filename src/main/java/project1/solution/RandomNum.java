package project1.solution;

import java.util.Random;
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

        System.out.println((int)(Math.random() * (max+1)));  // Note that we need to use max+1 in order to make max inclusive.

        /* Or alternatively:
        Random random = new Random();
        System.out.println(random.nextInt(max+1));
        */
    }
}