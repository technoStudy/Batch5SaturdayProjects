package project5.groupSolutions.group4.task1;

public class Customer {

    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;

        public Customer(String name, int areaZipCode, ElectricityAccount electricityAccount) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = electricityAccount;

        if(areaZipCode >= 1000 && areaZipCode < 3000)
            this.electricityAccount.rate = 0.9;
        else if (areaZipCode >= 3000 && areaZipCode < 4500)
            this.electricityAccount.rate = 0.8;
        else if (areaZipCode >= 4500 && areaZipCode < 7000)
            this.electricityAccount.rate = 0.6;
        else
            this.electricityAccount.rate = 0.7;
    }






//    public Customer(String name, int areaZipCode) {
//        this.name = name;
//        this.areaZipCode = areaZipCode;
//
//        if(areaZipCode >= 1000 && areaZipCode < 3000)
//            this.electricityAccount = new ElectricityAccount(0.9);
//        else if (areaZipCode >= 3000 && areaZipCode < 4500)
//            this.electricityAccount = new ElectricityAccount(0.8);
//        else if (areaZipCode >= 4500 && areaZipCode < 7000)
//            this.electricityAccount = new ElectricityAccount(0.6);
//        else
//            this.electricityAccount = new ElectricityAccount(0.7);
//    }
//
//    public Customer(String name, int age, int areaZipCode) {
//        this(name, areaZipCode);
//        this.age = age;
//    }

        public Customer(String name, int age, int areaZipCode, ElectricityAccount electricityAccount) {
        this(name, areaZipCode, electricityAccount);
        this.age = age;
    }

    public void consumeElectricity (double wph){
        this.electricityAccount.totalWPH += wph;
    }

}
