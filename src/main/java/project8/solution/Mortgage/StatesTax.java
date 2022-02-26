package project8.solution.Mortgage;

/*
     Create an enum class whose name is StatesTax
     Add Enumerated data types of
     NEWYORK with a tax rate of 20
     NEWJERSEY with a tax rate of 15
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

    private final int rate;

    StatesTax(int rate){
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}


