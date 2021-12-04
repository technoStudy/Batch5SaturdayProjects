package project5.groupSolutions.group2.task1;

public class Customer {

    String name;
    int age;
    static int areaZipCode;
    ElectricityAccount electricityAccount;

    public Customer(String name, int areaZipCode, ElectricityAccount electricityAccount) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        getElectricityRate();
    }

    public Customer(String name, int age, int areaZipCode, ElectricityAccount electricityAccount) {
        this.name = name;
        this.age = age;
        this.areaZipCode = areaZipCode;
    }


    public static double getElectricityRate() {
        if (areaZipCode >= 1000 && areaZipCode <= 3000)
            ElectricityAccount.rate = 0.9;
        else if (areaZipCode > 3000 && areaZipCode <= 4500)
            ElectricityAccount.rate = 0.8;
        else if (areaZipCode > 4500 && areaZipCode <= 7000)
            ElectricityAccount.rate = 0.6;

        return ElectricityAccount.rate;
    }

    public double consumeElectricity(double WPH) {

        ElectricityAccount.totalWPH += WPH;
        return ElectricityAccount.totalWPH;
    }


}











