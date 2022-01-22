package project8.groupSolutions.group2;

public class House {
  /*
     This class has the following fields (instance/object variables)
     String ownerName
     String condition
     String houseType
     int roomCount
     int downPayment
     int numberOfMonths
     StatesTax statesTax

  */

    private final String ownerName;
    private final String condition;
    private final String houseType;
    private final int roomCount;
    private final int downPayment;
    private final int numberOfMonths;
    private final StatesTax statesTax;

    /*
    Create the constructor helping initialization of the object variables.
    (That is to say, the constructor takes all the object variables as parameter.)
     */

    public House(String ownerName, String condition, String houseType, int roomCount, int downPayment,
                 int numberOfMonths, StatesTax statesTax) {
        this.ownerName = ownerName;
        this.condition = condition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.numberOfMonths = numberOfMonths;
        this.statesTax = statesTax;
    }

    /*
    Make all the object variables read-only. (No setter method, only getter methods are defined.)
     */


    public String getOwnerName() {
        return ownerName;
    }

    public String getCondition() {
        return condition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }

}

