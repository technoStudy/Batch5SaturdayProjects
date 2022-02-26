package project2.solution;

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
        Random rdm = new Random();
        int rdmLen = rdm.nextInt(21) + 2;
        char[] charArray = new char[rdmLen];

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (rdm.nextInt('Z' - 'A' + 1) + 'A');
        }
        System.out.println(Arrays.toString(charArray));
    }
}
