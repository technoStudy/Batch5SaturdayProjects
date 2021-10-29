package project1.groupSolutions.group3;

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
        String word2LowerCase = word2.toLowerCase();
        //abc  -> length = 3, position (index) = 2
        //cat

        //word1.equals() 'c'!='C'  word1.equalsIgnoreCase() c=C
        char word1LastLetter = word1.charAt(word1.length()-1);
        char word2FirstLetter = word2LowerCase.charAt(0);

        boolean check = word1.substring(word1.length()-1).equalsIgnoreCase(word2.substring(0,1)); //helps us to ignore case sensitivity

        if(check){
            System.out.println(word1 + word2.substring(1));
        }else {
            System.out.println(word1 + word2);
        }

    }
}
