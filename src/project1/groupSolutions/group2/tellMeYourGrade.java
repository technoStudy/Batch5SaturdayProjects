package project1.groupSolutions.group2;

import java.util.Scanner;

public class tellMeYourGrade {
    /*
    Given a String (grade)

    if grade is "A" then ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"

    if grade is "B" print "You're good"

    else (meaning if not "A" or "B") print "You need to work hard"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        // Please don't change anything before this line. Start your code after this line.

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("Enter your average: ");
            int average = scanner.nextInt();
            if (average > 90) {
                System.out.println("Congrats!");
            } else {
                System.out.println("Invalid average");
            }
        }
        else if (grade.equalsIgnoreCase("B")){
            System.out.println("You're good");
        }
        else {
            System.out.println("You need to work hard.");
        }
    }
}
