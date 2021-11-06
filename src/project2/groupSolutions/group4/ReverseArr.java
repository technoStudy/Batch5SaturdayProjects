package project2.groupSolutions.group4;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
      /*
        Given a String array (called myArray)
        Reverse the order of the elements of the String array
        Print the reversed array
        NOTE: While printing the array, don't use for loop
        Use Arrays.toString(your_array_name);
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] myArray = myStr.split(" ");

//        Your code starts here,ignore the above codes it is related to test class.
//        Use myArray

        //System.out.println("Before: " + Arrays.toString(myArray));

        String swap;

        for (int i = 0; i < myArray.length/2; i++) {
            swap = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = swap;
        }

        //System.out.print("Reverse: ");
                System.out.print(Arrays.toString(myArray));

    }
}
