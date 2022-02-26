package project1.groupSolutions.group3;

import java.util.Scanner;

public class RandomBetweenTwoNumbers {
    /*
    Given two positive integer numbers
    i.e.  "15 20"  or "7 235"

     integer 1 is min
     integer 2 is max

    create a random number between min and max (inclusive)

    output should be int

    Challenge: what if we do not know that the first number is smaller than the second.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] elements = s1.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        // Please don't change anything before this line. Start your code after this line.
        // helps us to get the first is the min value of the array maybe we do not need it

        int temp = 0;
        if(min > max){
            temp = min;
            min = max;
            max = temp;
        }

        System.out.println("min value: " + min );
        System.out.println("max value: " + max);


        int randomNum = (int) (Math.random() * (max-min) + min);
        System.out.println("random number between min and max: " + randomNum);



    }
}
