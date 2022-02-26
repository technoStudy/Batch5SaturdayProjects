package project5.groupSolutions.group3.task1;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class Task1Tests {
    @Test
    public void createCustomerTest1() {
        String name = "Mary";
        int age = 23;
        int zipCode = 200;
        double rate = 0.7;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, age, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", age, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void createCustomerTest2() {
        String name = "John";
        int age = 67;
        int zipCode = 2000;
        double rate = 0.9;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, age, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", age, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void createCustomerTest3() {
        String name = "Mahmoud";
        int age = 18;
        int zipCode = 4000;
        double rate = 0.8;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, age, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", age, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void createCustomerTest4() {
        String name = "Arzu";
        int age = 44;
        int zipCode = 6000;
        double rate = 0.6;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, age, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", age, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void createCustomerTest5() {
        String name = "Lee Su";
        int age = 32;
        int zipCode = 8000;
        double rate = 0.7;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, age, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", age, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void createCustomerTest6() {
        String name = "Andrew";
        int zipCode = 5000;
        double rate = 0.6;
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Customer customer = new Customer(name, zipCode, electricityAccount);
        Assert.assertEquals("\nCustomer name: ", name, customer.name);
        Assert.assertEquals("\nCustomer age: ", 0, customer.age);
        Assert.assertEquals("\nCustomer zipcode: ", zipCode, customer.areaZipCode);
        Assert.assertEquals("\nCustomer rate: ", rate, customer.electricityAccount.rate, 0.0);
    }

    @Test
    public void consumeElectricityTest1() {
        DecimalFormat df = new DecimalFormat("#.###");
        ElectricityAccount electricityAccount = new ElectricityAccount();
        Assert.assertEquals("Default rate: ", 0.7, electricityAccount.rate, 0.0);

        Customer customer = new Customer("Tester Name", 1500, electricityAccount);
        Assert.assertEquals("Current rate: ", 0.9, electricityAccount.rate, 0.0);

        Assert.assertEquals("Total WPH: ", 0.0, electricityAccount.totalWPH, 0.0);
        Assert.assertEquals("Bill: ", 0.0, electricityAccount.calculateBill(), 0.0);

        customer.consumeElectricity(120.2);
        Assert.assertEquals("Total WPH: ", 120.2, electricityAccount.totalWPH, 0.0);
        Assert.assertEquals("Bill: ", "108.18", df.format(electricityAccount.calculateBill()));

        customer.consumeElectricity(50.47);
        Assert.assertEquals("Total WPH: ", "170.67", df.format(electricityAccount.totalWPH));
        Assert.assertEquals("Bill: ", "153.603", df.format(electricityAccount.calculateBill()));

        customer.consumeElectricity(254.36);
        Assert.assertEquals("Total WPH: ", "425.03", df.format(electricityAccount.totalWPH));
        Assert.assertEquals("Bill: ", "382.527", df.format(electricityAccount.calculateBill()));
    }
}
