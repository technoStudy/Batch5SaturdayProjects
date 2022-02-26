package project5.groupSolutions.group1.task1;

public class ElectricityAccount {
    double totalWph;
    double bill;
    double rate = 0.7;


    public void calculateBill() {
          bill = rate * totalWph ;

        System.out.println(bill);
    }

    public void printElectricInfo(){
        System.out.println(totalWph+bill+rate);
    }
}
























