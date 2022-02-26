package project2.solution;

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
        for(int i = 0 ; i< strArr.length ; i++){
            int num =Integer.parseInt(strArr[i]);
            myArray[i] = num;
        }

//        Your code starts here. Don't remove or change anything before this line.
//        Use myArray above

        int max = myArray[0];
        int min = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            min = Math.min(myArray[i],min);
            max = Math.max(myArray[i],max);
        }
        System.out.println(max-min);

//        Advanced solution:
//        int min = Arrays.stream(myArray).min().getAsInt();
//        int max = Arrays.stream(myArray).max().getAsInt();
//        System.out.println(max-min);
    }
}
