package project1.groupSolutions.group1;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {
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

        int space = 0 ;

        if (min > max) {
            space  = min;
            min = max;
            max = space;
        }
        int twoRandomNumber = (int)(Math.random() * (max - min +1) + min);

        System.out.println("The random number between "+ min +" and " + max + " is : " + twoRandomNumber);

    }
}
