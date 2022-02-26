package project8.groupSolutions.group2;

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
    NEW_YORK(20),
    NEW_JERSEY(15),
    FLORIDA(5),
    OHIO(12);

    private final int stateTax;

    StatesTax(int stateTax) {
        this.stateTax = stateTax;
    }

    public int getTaxRate() {
        return stateTax;
    }
}


