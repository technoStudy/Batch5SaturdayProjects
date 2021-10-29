package project1.groupSolutions.group3;

import java.util.Scanner;

public class CheckNumberEven {
    /*
        Given an int number. Check if the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.


            boolean evenNum = number % 2 == 0;

            if (evenNum) {
                System.out.print("Your number is even: " + evenNum); }
            else {
                System.out.print("Your number is even: " + evenNum); }




        }


    }

