package project2.groupSolutions.group1;

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
        String reversedArrayString = "";
        for (int i = myArray.length-1; i >=0; i--) {
            reversedArrayString = reversedArrayString.concat(myArray[i].concat(" "));
        }
        String reversedArray[] = reversedArrayString.trim().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}
