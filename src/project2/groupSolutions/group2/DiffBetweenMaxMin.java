package Week2.project2;

import java.util.Arrays;
import java.util.Scanner;

public class DiffBetweenMaxMin {
    /*
    Given an int array of length 1 or more.
    Print the difference between the largest and smallest values in the array. (largest - smallest = difference)

    Hint: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

    [10, 3, 5, 6, 8, 7] → 7 (observe 10-3 = 7)
    [7, 2, 10] → 8  (observe 10-2 = 8)
    [2, 10, -7, 1] → 17 (observe 10-(-7) = 17)
    [12] → 0 (observe 12-12 = 0)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] strArr = myStr.split(" ");
        int[] myArray = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
//            int num=0;
//            if(strArr[i].contains("-")){
//                 num = -Integer.parseInt(strArr[i]);
//            }else{
            int num = Integer.parseInt(strArr[i]);
            //  }

            myArray[i] = num;
        }

//        Your code starts here. Don't remove or change anything before this line.
//        Use myArray above
        if (myArray.length > 1) {
        /*
         Find Max number of array
         */
            int tepmMax = myArray[0];
            for (int i = 0; i < myArray.length; i++) {
                tepmMax = Math.max(tepmMax, myArray[i]);
            }
          /*
         Find Min number of array
         */
            int tepmMin = myArray[0];
            for (int i = 0; i < myArray.length; i++) {
                tepmMin = Math.min(tepmMin, myArray[i]);
            }
        /*
        Print difference
         */
            System.out.println(tepmMax - tepmMin);
        } else {
            System.out.println(0);
        }
    }
}