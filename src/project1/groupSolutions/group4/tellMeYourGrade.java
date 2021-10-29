package project1.groupSolutions.group4;

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

        double average;
        if(grade.charAt(0)<'A' || grade.charAt(0)>'z') {    //BONUS: checking if user entered letters,
            System.out.println("INVALID");                  // if input is not letter write INVALID
        }
        else if(grade.equalsIgnoreCase("a")){
            System.out.println("Enter your average: ");
            average = scanner.nextDouble();
            if(average > 90) {
                System.out.println("Congrats");
            }else{
                System.out.println("Invalid average");
            }
        }else if (grade.equalsIgnoreCase("b")) {
            System.out.println("You are good");
        }else {
            System.out.println("You need to work hard");
        }

    }

    
}
