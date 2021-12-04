package project5.solution.task2;

public class Employee {
    double baseSalary;
    double hourlyRate;
    private static int numberOfEmployees;

    public Employee(double baseSalary, double hourlyRate) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Base Salary cannot be zero or negative!");
        }
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            throw new IllegalArgumentException("Hourly rate cannot be negative!");
        }
        numberOfEmployees++;
    }

    public double calculateWage(double extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
