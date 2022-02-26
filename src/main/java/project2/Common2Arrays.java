package project2;

import java.util.Scanner;

public class Common2Arrays {
    /*
         Given two arrays of ints, array1 and array2.
         Print true if they have the same first element, or they have the same last element.
         Otherwise, print false
         Both arrays will be length 1 or more.

        [1, 2, 3], [7, 3] → true
        [1, 2, 3], [7, 3, 2] → false
        [1, 2, 3], [1, 3] → true
        [1, 2, 3], [1, 7, 5, 2] → true
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
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        for (int i = 0; i < 3; i++) {
            array1[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            array2[i - 3] = myArr[i];
        }
/*
         Start coding here and ignore the above codes.Code above is necessary for the test class.
         Don't change or delete anything before this line
         Use array1 and array2 (given above).
 */


    }
}
