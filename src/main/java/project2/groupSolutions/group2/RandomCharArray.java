package project2.groupSolutions.group2;

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
        String alphabetInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
       int arrayLengh =  random.nextInt(22 - 2)+2;
       char[] charArray = new char[arrayLengh];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i]=alphabetInUpperCase.charAt(random.nextInt(alphabetInUpperCase.length()-1));
        }
        System.out.println(Arrays.toString(charArray));
    }
}
