package project8.groupSolution.group1.Mortgage;

public class House {

   private  String ownerName;
   private  String condition;
   private  int roomCount;
   private  String houseType;
   private  int downPayment;
   private  int numberOfMonths;
   private  StatesTax statesTax;



    public House(String ownerName,String condition,String houseType,
                 int downPayment,int roomCount,
                 int numberOfMonths,StatesTax statesTax){
        this.ownerName = ownerName;
        this.condition = condition;
        this.houseType = houseType;
        this.downPayment = downPayment;
        this.roomCount =roomCount;
        this.numberOfMonths =numberOfMonths;
        this.statesTax = statesTax;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public  String getCondition(){
        return condition;
    }
   public String getHouseType(){
        return houseType;
   }

   public  int getDownPayment(){
        return downPayment;
   }
   public int getRoomCount(){
        return roomCount;
   }
   public int getNumberOfMonths(){
        return numberOfMonths;
   }
   public StatesTax getStatesTax(){
        return statesTax;
   }
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


    /*
    Create the constructor helping initialization of the object variables.
    (That is to say, the constructor takes all the object variables as parameter.)
     */


    /*
    Make all the object variables read-only. (No setter method, only getter methods are defined.)
     */

}

