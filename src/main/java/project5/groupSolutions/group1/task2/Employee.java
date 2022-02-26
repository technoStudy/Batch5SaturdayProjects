package project5.groupSolutions.group1.task2;

public class Employee {
     double baseSalary;
     double hourlyRate;
     static int numberOfEmployees;

     public Employee(double baseSalary, double hourlyRate){
         this.baseSalary =baseSalary;
         this.hourlyRate = hourlyRate;
         if (baseSalary <= 0 || hourlyRate < 0){
             throw new ArithmeticException();
         }
     }
     public void calculateWage(double extraHours){
         double wage = baseSalary + (hourlyRate * extraHours);
         System.out.println("extrahours + wage:" +" " + wage);
     }

     public void addEmployee(){
         numberOfEmployees++;
     }

     public static void getNumberOfEmployees(){
         System.out.println("numberofemployee:"+ " " + numberOfEmployees);

     }

}
