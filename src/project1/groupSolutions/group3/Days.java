package project1.groupSolutions.group3;

import java.util.Scanner;

public class Days {
    /*
        Given an int  ,
            if the int is 1 print monday
            if the int is 2 print tuesday
            if the int is 3 print wednesday
            if the int is 4 print thursday
            if the int is 5 print friday
            if the int is 6 print saturday
            if the int is 7 print sunday
            if the number is bigger than or equal to 8 or less than 1 then print "this is not a valid day"

            NOTE : USE A SWITCH STATEMENT
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer from 1 to 7: ");
        int day = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.

        String output;

        switch (day) {
            case 1:
                output = "Monday";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
            default:
                output = "Invalid day";
        }
        System.out.println(day + " of the week is: "  + output);
    }


}


