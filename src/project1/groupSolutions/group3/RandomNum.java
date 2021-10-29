package project1.groupSolutions.group3;

import java.util.Scanner;

public class RandomNum {
    /*
    Given a positive integer number whose name is max,

    create a random number between 0 to max (inclusive)

    output should be int
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer number: ");
        int max = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.


            int randomNum = (int) (Math.random() * (max+1));
            boolean biggerThanZero = randomNum>0;
            // in the range from 0 to the any max number, that user provided


            System.out.println("Random number value from 0 and to your value is: " + randomNum);

        }
    }

