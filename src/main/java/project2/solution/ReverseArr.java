package project2.solution;

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

///////////// First way ///////////
//        int counter = 0 ;
//        String[] reversedArray = new String[myArray.length];
//        while (counter<myArray.length){
//            reversedArray[counter] = myArray[(myArray.length-1)-counter];
//            counter++;
//        }
//        System.out.println(Arrays.toString(reversedArray));

////////// Second way //////////////
//        String[] reversedArray = new String[myArray.length];
//        for (int i = 0; i < myArray.length; i++) {
//            reversedArray[myArray.length-1-i] = myArray[i];
//        }
//        System.out.println(Arrays.toString(reversedArray));

/////////////// Third way ///////////////////
//        String[] reversedArray = new String[myArray.length];
//        for (int i = 0, j = myArray.length - 1; i < myArray.length; i++, j--) {
//            reversedArray[j] = myArray[i];
//        }
//        System.out.println(Arrays.toString(reversedArray));

/////////////// Fourth way ////////////////////////
        int lastIndex = myArray.length - 1;
        for (int i = 0; i < myArray.length/2; i++) {
            String temp = myArray[i];
            myArray[i] = myArray[lastIndex-i];
            myArray[lastIndex-i] = temp;
        }
        System.out.println(Arrays.toString(myArray));

    }
}
