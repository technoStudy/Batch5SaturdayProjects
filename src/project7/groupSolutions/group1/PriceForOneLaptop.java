package project7.groupSolutions.group1;




import java.util.ArrayList;



public class PriceForOneLaptop {

    /*
        Create one method whose name is getPrice

        Parameter is int

        Return type is int

        This method is calling the AllData method from the Data class. Laptop ID is a parameter laptopID

        This method needs to call all other methods in Calculation class and get the price and return that total Amount.
     */
    public int getPrice(int laptopID){


        Data data = new Data();
        ArrayList<String> newLaptop = data.AllData(laptopID);
        Calculation calculation = new Calculation();
        return calculation.getCPU(newLaptop)+calculation.getRam(newLaptop)+calculation.getSize(newLaptop)+calculation.getColor(newLaptop);
    }


    /*
        Create one method whose name is getDiscount

        Parameter is two int (amount , discount)

        Return type is int

        Make the discount from the amount

        And Return the discounted price

        Example

        Amount 1500
        discount 20

        After a 20% discount (1500 * %20 = 300)

        Result should be 1200 (because 1500 - 300 = 1200)
     */
    public int getDiscount(int amount , int discount){
        int  totalDiscount = amount * discount/100;
        return amount - totalDiscount;

    }
}
