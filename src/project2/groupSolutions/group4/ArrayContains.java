package project2.groupSolutions.group4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContains {
    /*
        Given two arrays of ints. Say, first array is "outer" and second array is "inner".
        Both arrays are already sorted in increasing order.
        Print true if all the numbers in the inner array also appear in the outer array.
        Otherwise, print false
        (In other words, print true if first array contains second array.)

        Samples:
        [1, 2, 4, 6], [2, 4] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [2, 4] → true

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] outer = new int[3];
        int[] inner = new int[2];

        for (int i = 0; i < 3; i++) {
            outer[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            inner[i - 3] = myArr[i];
        }

//        Start coding here and ignore the above codes.Code above is necessary for the test class.
//        Use the arrays called outer and inner

        //FIRST WAY - WORKS IN Tests.java
        // THIS CODE DOES NOT WOK FOR [1, 2, 3] and [1, 1]. THERE IS NO SUCH TEST CASE IN Tests.java
//        int counter = 0;
//        int lastPosition;
//        for (int element : inner) {
//            if (Arrays.binarySearch(outer, element) >= 0) {
//                counter++;
//            }
//        }
//        if(counter==inner.length){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }


        //2nd or more ADVANCED VERSION

        int counter = 0; //counts number of found elements
        int lastPosition = -1; //it will store index of last found to avoid repeating
        int newPosition; //stores index of next found

        for (int elements : inner) {
            newPosition = Arrays.binarySearch(outer, elements);

            if (lastPosition != newPosition && newPosition >= 0) {
                counter++;
                lastPosition = newPosition;
            }
        }

        if(counter == inner.length){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
