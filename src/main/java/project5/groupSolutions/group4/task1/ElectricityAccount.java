package project5.groupSolutions.group4.task1;

public class ElectricityAccount {
    double totalWPH;
    double rate = 0.7;
    double bill;

//    public ElectricityAccount(double rate) {
//        this.rate = rate;
//        this.totalWph = 0;
//    }

    public double calculateBill (){
        bill = rate * totalWPH;
        return bill;
    }
}
