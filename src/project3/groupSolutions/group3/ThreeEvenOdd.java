package project3.groupSolutions.group3;

public class ThreeEvenOdd {

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
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println(threeEvenOrOdd(array));

    }public static boolean threeEvenOrOdd(int intArray[]) {
        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] % 2 == 0)) {   //second one also could be !(intArray[i] % 2 == 0)
                evenSize++;
            }else
                oddSize++;

        }return evenSize==3||oddSize==3;


    }
}
