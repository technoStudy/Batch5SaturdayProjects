package project5.groupSolutions.group4.task2;

public class Employee {
    double baseSalary;
    double hourlyRate;

    static int numberOfEmployees = 0;

    public Employee(double baseSalary, double hourlyRate) throws IllegalArgumentException {

        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary cannot be less than or equal to zero");
        } else if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be less than zero");

        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;

        numberOfEmployees++;
    }

    double calculateWage(double extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}
