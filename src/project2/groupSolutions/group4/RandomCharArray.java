package project2.groupSolutions.group4;

import java.util.Arrays;
import java.util.Random;

public class RandomCharArray {
      /*
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println();
        int randomNumber = random.nextInt(21)+2;
        char[] arrayOfChars = new char[randomNumber];

        char randomChar;
        for (int i = 0; i < arrayOfChars.length; i++) {
            randomChar = (char) (random.nextInt(26) + 65);
            arrayOfChars[i] = randomChar;
        }

        System.out.println("Array of " + randomNumber + " random capital letter/s: " + Arrays.toString(arrayOfChars));

    }
}
