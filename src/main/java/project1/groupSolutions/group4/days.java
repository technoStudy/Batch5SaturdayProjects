package project1.groupSolutions.group4;

import java.util.Scanner;

public class days {
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
        int day = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a valid day");
        }

    }
}



