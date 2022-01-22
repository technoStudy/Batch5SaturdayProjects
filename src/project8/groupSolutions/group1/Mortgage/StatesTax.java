package project8.groupSolutions.group1.Mortgage;

/*
     Create an enum class whose name is StatesTax
     Add Enumerated data types of
     NEW_YORK with a tax rate of 20
     NEW_JERSEY with a tax rate of 15
     FLORIDA with a tax rate of 5
     OHIO with a tax rate of 12

     Create a getter method for the tax rate of data types
     (Hint: You will need to create a private variable for the tax as well as the constructor of this enum class.)
 */

public enum StatesTax {
    NEWYORK(20),
    NEWJERSEY(15),
    FLORIDA(5),
    OHIO(12);



    private final int taxRate;

    StatesTax (int taxRate){
        this.taxRate = taxRate;
    }

    public int getTaxRate() {
       return taxRate;

    }
}


