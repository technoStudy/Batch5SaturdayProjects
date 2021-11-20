package project3.solution;

/*
   Create a method whose name is threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean

   It returns true if the argument array contains EITHER three even OR three odd values.
   It returns false otherwise.

   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false
   [2, 4, 6, 8] -> false
   [1, 2, 3, 4, 5, 6] -> true
   [1, 2, 3, 4, 5, 6, 7] -> true
   [1, 2, 3, 4, 5, 6, 7, 8] -> false
 */

public class ThreeEvenOdd {
    public boolean threeEvenOrOdd(int[] numbers) {
        int evenCount = 0, oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) evenCount++;
            else oddCount++;
        }
        return evenCount == 3 || oddCount == 3;
    }
}
