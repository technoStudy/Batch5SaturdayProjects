package project5.groupSolutions.group2.task2;

public class Employee {
        double baseSalary;
        double hourlyRate;
        private static int numberOfEmployees;

        public Employee(double baseSalary, double hourlyRate) {
            this.baseSalary = baseSalary;
            this.hourlyRate = hourlyRate;
            numberOfEmployees++;

            if (baseSalary <= 0)
                throw new IllegalArgumentException("BaseSalary cannot be less than or equal to zero");
            if (hourlyRate < 0)
                throw new IllegalArgumentException("HourlyRate cannot be less than zero");
        }


        public void calculateWage(double extraHours) {
            double wage = baseSalary + (hourlyRate * extraHours);
            System.out.println("Wage: " + wage);
        }

        public static int getNumberOfEmployees() {
            return numberOfEmployees;
        }

    }

