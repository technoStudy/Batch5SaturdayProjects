package project2.solution;

import java.util.Arrays;

public class Special2DArray {
      /*
        Create a 2D int array
        The 2D array has 5 element arrays
        Each element array length is equal its index in the 2D array
        Each element array contains int values of its index number
        Print the 2D array
        So, the output must be: [[], [1], [2, 2], [3, 3, 3], [4, 4, 4, 4]]
        DO NOT HARDCODE! USE LOOPS!
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */

    public static void main(String[] args) {
        int[][] int2dArray = new int[5][];  // The 2D array has 5 element arrays

        for (int i = 0; i < int2dArray.length; i++) {
            int2dArray[i] = new int[i];  // Each element array length is equal its index in the 2D array
            for (int j = 0; j < i; j++) {
                int2dArray[i][j] = i;  // Each element array contains int values of its index number
                // Arrays.fill(int2dArray[i], i); // This line of code is alternative to the above line
            }
        }
        System.out.println(Arrays.deepToString(int2dArray));  // Prints the 2D array
    }
}


