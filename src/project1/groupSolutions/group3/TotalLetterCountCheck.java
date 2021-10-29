package project1.groupSolutions.group3;

import java.util.Scanner;

public class TotalLetterCountCheck {
    /*
        Given a String ,
            if the number of the characters in the given String is odd then print true else print false
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String word = scanner.nextLine();

        // Please don't change anything before this line. Start your code after this line.


            int stringLength = word.length();

            if (!(stringLength % 2 == 0)) {
                System.out.print(true);
            } else {
                System.out.print(false);
            }


    }

}
