package project1.groupSolutions.group1;

import java.util.Scanner;

public class Age {
     /*
        Given an int ,
            if the age is less than or equal 10
                print "too young to create a Facebook account"

             if the age is less than or equal 16
                print "too young to get a driver's license"

             if the age is less than or equal 18
                print "too young to get a tattoo"

            if the age is less than or equal 21
                print "too young to drink alcohol"

            if the age bigger than 21
                print "do whatever you want to do"

        Note: use if else statement.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myAge = scanner.nextInt();

        // Please don't change anything before this line. Start your code after this line.

        if(myAge <= 10){
            System.out.println("Too young to create a facebook account");
        }else if(myAge <= 16){
            System.out.println("Too young to get a driver's license");
        }else if(myAge <= 18){
            System.out.println("too young to get a tattoo");
        }else if(myAge <= 21){
            System.out.println( "too young to drink alcohol");
        }else{
            System.out.println("do whatever you want to do");
        }
    }
}
