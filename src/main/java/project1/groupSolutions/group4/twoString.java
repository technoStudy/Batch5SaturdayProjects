package project1.groupSolutions.group4;

import java.util.Scanner;

public class twoString {

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

        String word2LowerCase = word2.toLowerCase();

        char word1LastLetter = word1.charAt(word1.length()-1);
        char word2FirstLetter = word2LowerCase.charAt(0);
        if (word1LastLetter == word2FirstLetter) {
            System.out.println(word1 + word2.substring(1));
        }else {
            System.out.println(word1 + word2);
        }
    }
}
