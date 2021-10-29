package project1;

import java.util.Scanner;

public class TwoString {

    public static void main(String[] args) {
        /*
            Given two Strings by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        Scanner scanner = new Scanner(System.in);
        String  userString = scanner.nextLine();
        String[] words = userString.split(" ");
        String word1 = words[0];
        String word2 = words[1];

        // Please don't change anything before this line. Start your code after this line.

    }
}
