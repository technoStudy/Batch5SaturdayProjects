package project8.Mortgage;

public class HousePrices {
   /*
     This class is extending the House class
     It has one int variable, let us name it as price
     Make this variable (price) read-only
     */


    /*
    Create the constructor of the class.
    Calculate the price of the house by the help of the method calculateTotalPriceOfHouse below
     */


    /*
        Create a method whose name is roomCountToPrice
        no parameter
        no return type
        if the roomCount in the House class equal to 0
            add 10000 to price
        if the roomCount in the House class equal to 1
            add 20000 to price
        if the roomCount in the House class equal to 2
            add 30000 to price
        if the roomCount in the House class equal to 3
            add 40000 to price
        if the roomCount in the House class equal to 4
            add 50000 to price
        if the roomCount in the House class equal to 5
            add 60000 to price
     */


    /*
        Create a method whose name is conditionToPrice
        no parameter
        no return type
            if condition variable in the House class equal to "New"
                add 50000 to price
            if condition variable in the House class equal to "LikeNew"
                add 40000 to price
            if condition variable in the House class equal to "Old"
                add 30000 to price
            if condition variable in the House class equal to "Renovation Required"
                add 15000 to price
     */


    /*
        Create a method whose name is houseTypeToPrice
        no parameter
        no return type
            if HouseType is equal to "Apartment"
                add 20000 to price
            if HouseType is equal to "Condo"
                add 30000 to price
            if HouseType is equal to "House"
                add 40000 to price
     */


    /*
      Create a private method whose name is calculateTotalPriceOfHouse
      return type is void
      Calculate the tax and add it to the price
      For the tax percentage use the StatesTax enum
      The method returns the total price considering house type, condition, room count (by the help of the above methods) and tax
     */



    /*
        Create a method whose name is getMonthlyPayment
        return type is int
        The method calculates and returns the monthly payment amount.
        For the sake of the simplification of this exercise, just consider the mortgage rate as 0% (no mortgage rate)
        But do not forget to subtract the down payment (from the Users class)
     */

}
