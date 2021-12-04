package project5.groupSolutions.group3.task1;

public class Customer {

    String name;
    int age, areaZipCode;
    ElectricityAccount electricityAccount;

    public Customer(String name, int areaZipCode, ElectricityAccount electricityAccount) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = electricityAccount;

        if (1000 < areaZipCode && areaZipCode < 3000)
            electricityAccount.rate = 0.9;

        else if (3000 < areaZipCode && areaZipCode < 4500)
            electricityAccount.rate = 0.8;

        else if (4500 < areaZipCode && areaZipCode < 7000)
            electricityAccount.rate = 0.6;
         else
            electricityAccount.rate = 0.7;
        }

    public Customer(String name,int age, int areaZipcode, ElectricityAccount electricityAccount){
           this(name,areaZipcode,electricityAccount);
           this.age=age;
    }

    public double consumeElectricity(double wph){
        electricityAccount.totalWPH += wph;
        return electricityAccount.totalWPH;
    }
}

