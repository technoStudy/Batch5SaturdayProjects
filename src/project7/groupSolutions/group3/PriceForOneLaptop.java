package project7.groupSolutions.group3;

import java.util.ArrayList;
import java.util.List;

public class PriceForOneLaptop {
    /*
        Create one method whose name is getPrice

        Parameter is int

        Return type is int

        This method is calling the AllData method from the Data class. Laptop ID is a parameter laptopID

        This method needs to call all other methods in Calculation class and get the price and return that total Amount.
     */



    public int getPrice(int laptopID){
        Data date = new Data();
        Calculation cal = new Calculation();
        ArrayList list = date.AllData(laptopID);
        return cal.getRam(list) + cal.getColor(list) + cal.getCPU(list) + cal.getSize(list);

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

        return (int)(amount * ( 1 - (double)discount/100));
    }
}
