package project5.groupSolutions.group3.task2;

public class Employee {

    double baseSalary;
    double hourlyRate;
    static int numberOfEmployees;

    public Employee(double baseSalary, double hourlyRate){

        if(baseSalary<=0||hourlyRate<0) {
            throw new IllegalArgumentException("baseSalary and hourly rate should be greater than zero");
        }else{
            this.baseSalary=baseSalary;
            this.hourlyRate=hourlyRate;
        }
        numberOfEmployees++;
    }

    public double calculateWage(double extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}
