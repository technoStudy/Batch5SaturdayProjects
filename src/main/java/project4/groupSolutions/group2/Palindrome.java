package project4.groupSolutions.group2;

public class Palindrome {
    public static boolean isStringPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

    public static boolean isNumberPalindrome(int numbers) {

        String numbersToString = Integer.toString(numbers);

        return isStringPalindrome(numbersToString);
    }


    public static int reverseNumber(int number) {

        int remainder, reversedNumber = 0;

        while (number > 0) {

            remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }


    public String generatePalindromeNumberFrom(int say, boolean lastDigitRepeats) {
        String str = Integer.toString(say);
        String result = str;

        for (int i = 0; i < str.length(); i++) {
            if (lastDigitRepeats) {
                result += str.charAt(str.length() - 1 - i);
            } else {
                if (i == str.length() - 1) {
                    break;
                }
                result += str.charAt(str.length() - 2 - i);
            }
        }
        return result;
    }


    public static int convertNumberIntoPalindrome(int number) {

        int counter = 0;


        if (isNumberPalindrome(number))
            return 0;

        while (!isNumberPalindrome(number)) {
            number += reverseNumber(number);
            counter++;
        }

        return counter;

    }

}
