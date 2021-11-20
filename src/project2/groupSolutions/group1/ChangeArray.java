package project2.groupSolutions.group1;

import java.util.Arrays;
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
        for (int i = 0; i < fruitArray.length; i++) {
            if(fruitArray[i].equals("Orange")){
                fruitArray[i]="Apple";
            }
           else if (fruitArray[i].equals("Peach")){
                fruitArray[i]="Berry";
            }else {
                fruitArray[i]="RusikPots";

            }
            for (int i1 = 0; i1 < fruitArray.length; i1++) {

            }
        }
        System.out.println(Arrays.toString(fruitArray));


        }
    }

