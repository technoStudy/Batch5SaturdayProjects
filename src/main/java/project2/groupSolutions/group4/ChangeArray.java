package project2.groupSolutions.group4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ChangeArray {
      /*
        Given one array of Strings
        If this string array contains "Orange" change all "Orange" to "Apple"
        Print the Array

        Sample:
        Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] fruitArray = myStr.split(" ");

//        Code starts here
//        You should use fruitArray (given above)

        //System.out.println("Before replacement: " + Arrays.toString(fruitArray));

        for (int i = 0; i < fruitArray.length; i++) {
            if (fruitArray[i].equalsIgnoreCase("Orange")) {
                fruitArray[i] = "Apple";
            }
        }

        //System.out.print("After replacement: ");
        System.out.println(Arrays.toString(fruitArray));
    }
}

