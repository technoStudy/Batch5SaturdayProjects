package project1.groupSolutions.group4;

import java.util.Scanner;

public class FizzBuzz {
    /*
        Given a int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5

        Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.


        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("fizzbuzz");
        } else if (number % 5 == 0){
            System.out.println("fizz");
        } else if (number % 3 == 0){
            System.out.println("buzz");
        } else{
            System.out.println(number);
        }

    }

}
