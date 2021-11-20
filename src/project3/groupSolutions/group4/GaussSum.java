package project3.groupSolutions.group4;

//  (You will create two methods in this assignment)

/*
   Create a method whose name is gaussSumOf
       Information:
          Gauss sum of a number is the sum of the all numbers from 1 to that number.
          For example:
          Gauss sum of 7 is 1+2+3+4+5+6+7 = 28
   As parameters the method takes a positive int
   The method returns an int
   The method calculates and returns the Gauss sum of the argument number.
 */

/*
    Create a method whose name is sumOfSquaresOfGaussSums
    As parameters it takes two ints
    The method returns an int
    The method calculates and returns the sum of the squares of the Gauss sum of the given arguments.

    Sample:
    first argument: 5 -> Gauss sum of 5 = 15 -> square of 15 = 225
    second argument: 10 -> -> Gauss sum of 10 = 55 -> square of 15 = 3025
    sum of the squares -> 225 + 3025 = 3250
    if the method takes 5 and 10 then it returns 3250

    HINT: Use the first method above to calculate the Gauss sums of the numbers.
 */

public class GaussSum {
    public int gaussSumOf(int number){
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public int sumOfSquaresOfGaussSums(int number1, int number2){
         return (int) (Math.pow(gaussSumOf(number1),2) + Math.pow(gaussSumOf(number2),2));

         //Why IntelliJ insisted on (int)???
    }

}
