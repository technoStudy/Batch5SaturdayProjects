package Week2.project2;

import java.util.Scanner;

public class SameFirstAndLast {
   /*
    Given an array of ints whose length is 1 or more,
    Print true if the first element and the last element are equal.
    Print false otherwise

    [1, 2, 3] → false
    [1, 2, 3, 1] → true
    [1, 2, 1] → true
    [1] → true
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] array = myStr.split(" ");
        int[] myArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = Integer.parseInt(array[i]);
        }

//      Your code starts here, ignore the above codes it is related to test class.
//      Use myArray

        if (myArray[0] == myArray[myArray.length - 1]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

