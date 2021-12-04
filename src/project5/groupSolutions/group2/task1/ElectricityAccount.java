package project5.groupSolutions.group2.task1;

public class ElectricityAccount {

    static double totalWPH = 0;
    static double rate = 0.7;


    public double calculateBill() {
        double bill = Customer.getElectricityRate() * totalWPH;
        System.out.println("Bill: " + bill);
        return bill;
    }


}


