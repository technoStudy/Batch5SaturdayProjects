package project1.groupSolutions.group3;

import java.util.Scanner;

public class TellMeYourGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade please: ");
        String grade = scanner.nextLine();

        if (grade.equalsIgnoreCase("A")) {
            System.out.print("What is your average: ");

            int average = scanner.nextInt();
            if (average > 90) {
                System.out.println("Congrats!");

            } else {
                System.out.println("Invalid average");

            }
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("You are good!");

        } else {
            System.out.println("You need to work hard");
        }
    }
}