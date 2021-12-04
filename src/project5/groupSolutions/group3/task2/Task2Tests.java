package project5.groupSolutions.group3.task2;//package project5.task2;

import org.junit.Assert;
import org.junit.Test;

/*
IMPORTANT NOTE: Do not run the tests individually (due to the static field of numberOfEmployees).
It is recommended to run all tests at once for a consistent test result.
 */
public class Task2Tests {

    @Test
    public void employeeTest1() {
        double baseSalary = 40_000;
        double hourlyRate = 18.4;
        double extraHours = 20.5;
        double expectedWage = baseSalary + hourlyRate * extraHours;
        Employee employee = new Employee(baseSalary, hourlyRate);
        Assert.assertEquals("\nBase Salary: ", baseSalary, employee.baseSalary, 0.0);
        Assert.assertEquals("\nHourly Rate: ", hourlyRate, employee.hourlyRate, 0.0);
        Assert.assertEquals("\nWage: ", expectedWage, employee.calculateWage(extraHours), 0.0);
        Assert.assertEquals("\nNumber of total employees: ", 1, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest2() {
        double baseSalary = 85_450.75;
        double hourlyRate = 0;
        double extraHours = 36;
        double expectedWage = baseSalary + hourlyRate * extraHours;
        Employee employee = new Employee(baseSalary, hourlyRate);
        Assert.assertEquals("\nBase Salary: ", baseSalary, employee.baseSalary, 0.0);
        Assert.assertEquals("\nHourly Rate: ", hourlyRate, employee.hourlyRate, 0.0);
        Assert.assertEquals("\nWage: ", expectedWage, employee.calculateWage(extraHours), 0.0);
        Assert.assertEquals("\nNumber of total employees: ", 2, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest3() {
        Employee employee3 = new Employee(100, 22);
        Employee employee4 = new Employee(100, 22);
        Employee employee5 = new Employee(100, 22);
        Employee employee6 = new Employee(100, 22);
        Assert.assertEquals("\nNumber of total employees: ", 6, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest4() {
        Assert.assertThrows(Exception.class, () -> {
            new Employee(0, 22);
        });
        Assert.assertEquals("\nNumber of total employees: ", 6, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest5() {
        Assert.assertThrows(Exception.class, () -> {
            new Employee(-100_000, 22);
        });
        Assert.assertEquals("\nNumber of total employees: ", 6, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest6() {
        Assert.assertThrows(Exception.class, () -> {
            new Employee(100_000, -22);
        });
        Assert.assertEquals("\nNumber of total employees: ", 6, Employee.getNumberOfEmployees());
    }

    @Test
    public void employeeTest7() {
        Assert.assertThrows(Exception.class, () -> {
            new Employee(-100_000, -22);
        });
        Assert.assertEquals("\nNumber of total employees: ", 6, Employee.getNumberOfEmployees());
    }
}
