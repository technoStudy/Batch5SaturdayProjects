package project5.groupSolutions.group1.task1;

public class Customer {
    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;
    static  double totalWph;


    public Customer(String name, int areaZipCode, ElectricityAccount electricityAccount ){
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = electricityAccount;
        if (areaZipCode > 1000 && areaZipCode< 3000){
            electricityAccount.rate = 0.9;
        }else if (areaZipCode > 3000 && areaZipCode < 4500){
            electricityAccount.rate = 0.8;
        }else if (areaZipCode > 4500 && areaZipCode < 7000){
            electricityAccount.rate = 0.6;
        }else {
            System.out.println();
        }


    }
    public Customer (String name, int areaZipCode, int age, ElectricityAccount electricityAccount){
        this(name,areaZipCode,electricityAccount);
        this.age = age;
    }

    public void consumeElectricity(int wph){
        Customer.totalWph += wph;
        System.out.println(wph);

    }


      public  void totalBill(){
        electricityAccount.calculateBill();

      }


    public void printWholeInfo(){
        System.out.println(name+areaZipCode+electricityAccount);
        electricityAccount.printElectricInfo();
        electricityAccount.calculateBill();
    }

    }
















