package project4.groupSolutions.group3;

public class Palindrome {

             /*
    Create a method whose name is isStringPalindrome
    It takes a non-null or non-empty String as parameter (i.e. given that the String length is at least 1)
    It returns a boolean

    Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"
    For the sake of this task, we accept a palindrome as an expression which is equal to its reverse, like "1e2e1", "@D3@3D@"

    The method returns true if the argument is a palindrome, otherwise returns false.
    Ignore the letter cases. That is, the method returns true for "Dad" or "*e8E*"
    */

    public boolean isStringPalindrome(String str) {

        String reverseStr = "";
        boolean isStringPalindrome = false;

        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }
        if(str.equalsIgnoreCase(reverseStr))
            isStringPalindrome = true;
        return isStringPalindrome;

    }


    /*
    Create a method whose name is isNumberPalindrome
    It takes a non-negative int and returns a boolean

    The method returns true if the number is a palindrome, otherwise returns false
     */



    public static boolean isNumberPalindrome(int num){

        int orgNumber = num;
        int rev = 0;
        boolean isNumberPalindrome = false;
        while( num !=0 ){

            rev= rev*10 + num%10;
            num = num/10;
        }
        if (orgNumber == rev){
            isNumberPalindrome = true;

        } return isNumberPalindrome;

    }


        /*
    Create a method whose name is reverseNumber
    It takes an int as parameter
    It returns an int

    The method reverses the argument int (i.e., it re-forms an int by reversing the order of its digits)
    It returns the reversed int

    Example:
    The parameter int  = 1234
    The method returns 4321
    */

    public int reverseNumber(int value) {

        int reverse = 0;
        int remainder = 0;
        while (value != 0) {
            remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value = value / 10;
        }
        return reverse;

    }


       /*
    Create a method whose name is generatePalindromeNumberFrom
    It takes a non-negative int and a boolean (say, lastDigitRepeats) as parameters
    It returns a String

    The method generates a palindrome number by putting the inverse of the argument number just after the number.
    It repeats the last digit if the argument boolean is true while generating the palindrome number.

    Examples:
    (123, true) -> "123321"
    (123, false) -> "12321"
    (91, true) -> "9119"
    (91, false) -> "919"
    (0, true) -> "00"
    (5, false) -> "5"
    (30, true) -> "3003"
    (30, false) -> "303"
    */

    public String generatePalindromeNumberFrom(int num , boolean lastDigitRepeats) {

        String str = Integer.toString(num);
        String palindrome = str;
        if (lastDigitRepeats){
            for (int i = str.length() - 1; i >= 0 ; i--) {
                palindrome += str.charAt(i);
            }
        }
        if(!lastDigitRepeats){
            for (int i = str.length() - 2; i >= 0 ; i--) {
                palindrome += str.charAt(i);
            }
        }
        return palindrome;
    }



       /*
    Create a method whose name is convertNumberIntoPalindrome
    It takes a non-negative int parameter
    It returns an int

    Check if the argument number is a palindrome number or not.
    If it is already a palindrome then return 0, otherwise find the sum of the argument int and its reverse.
    Check if the sum is a palindrome number or not.
    If the sum is not a palindrome number, find the reverse of the sum.
    And add the sum and the reverse of the sum to find the new total.
    Check if the new total is a palindrome or not.
    Repeat the same steps until you reach a palindrome number in your result.
    After you reached the palindrome number, find the number of repeats(loops) in order to hit a palindrome number.
    The method returns the number of loops

     Example-1:
         int argument = 349  -->
          349  + 943 = 1292    Note : since 1292 is not palindrome do the same step for this  // first loop
          1292 + 2921 = 4213   Note : 4213 is not palindrome do the same step for this // second loop
          4213 + 3124 = 7337   Note : 7337 is a palindrome number  // third loop
     The method returns 3

     Example-2:
        int argument is = 404 -->
        It is already a palindrome, no need to loop it.
        The method returns 0
    */


    public int convertNumberIntoPalindrome(int num) {
        int count = 0;
        while (!isNumberPalindrome(num)){
            num += reverseNumber(num);
            count++;
        }
        return count;
    }

}
