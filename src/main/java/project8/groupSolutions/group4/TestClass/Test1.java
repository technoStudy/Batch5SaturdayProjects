package project8.groupSolutions.group4.TestClass;

import project8.groupSolutions.group4.Mortgage.HousePrices;
import project8.groupSolutions.group4.Mortgage.StatesTax;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void test1() {
        HousePrices housePrices = new HousePrices(
                "Fernando",
                "New",
                "Apartment",
                3,
                40000,
                30,
                StatesTax.OHIO);
        Assert.assertEquals("Testing the name of the owner name of the house:", "Fernando", housePrices.getOwnerName());
        Assert.assertEquals("Testing the total price of the house:", 123200, housePrices.getPrice());
        Assert.assertEquals("Testing the monthly payment of the house:",2773, housePrices.getMonthlyPayment());
    }

    @Test
    public void test2() {
        HousePrices housePrices = new HousePrices(
                "David",
                "LikeNew",
                "House",
                5,
                50000,
                30,
                StatesTax.NEWYORK);
        Assert.assertEquals("Testing the name of the owner name of the house:", "David", housePrices.getOwnerName());
        Assert.assertEquals("Testing the total price of the house:", 168000, housePrices.getPrice());
        Assert.assertEquals("Testing the monthly payment of the house:",3933, housePrices.getMonthlyPayment());
    }

    @Test
    public void test3() {
        HousePrices housePrices = new HousePrices(
                "Emily",
                "Old",
                "Condo",
                4,
                30000,
                36, StatesTax.FLORIDA);
        Assert.assertEquals("Testing the name of the owner name of the house:", "Emily", housePrices.getOwnerName());
        Assert.assertEquals("Testing the total price of the house:", 115500, housePrices.getPrice());
        Assert.assertEquals("Testing the monthly payment of the house:",2375, housePrices.getMonthlyPayment());
    }

    @Test
    public void test4() {
        HousePrices housePrices = new HousePrices(
                "Rinda",
                "Renovation Required",
                "Condo",
                1,
                50000,
                35, StatesTax.NEWJERSEY);
        Assert.assertEquals("Testing the name of the owner name of the house:", "Rinda", housePrices.getOwnerName());
        Assert.assertEquals("Testing the total price of the house:", 74750, housePrices.getPrice());
        Assert.assertEquals("Testing the monthly payment of the house:",707, housePrices.getMonthlyPayment());
    }
}
