package project1.groupSolutions.group2;

import java.util.Scanner;

public class totalLetterCountCheck {
    /*
        Given a String ,
            if the number of the characters in the given String is odd then print true else print false
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Please don't change anything before this line. Start your code after this line.

        if (word.length()%2==0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
