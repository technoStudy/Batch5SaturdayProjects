package project7;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void test1() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID = 1100000;
        int actual = p1.getPrice(laptopID);
        int expected = 850;
        Assert.assertEquals("Laptop id is " + laptopID, expected, actual);
    }

    @Test
    public void test2() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID = 1100001;
        int actual = p1.getPrice(laptopID);
        int expected = 750;
        Assert.assertEquals("Laptop id is " + laptopID, expected, actual);
    }

    @Test
    public void test3() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID = 1100002;
        int actual = p1.getPrice(laptopID);
        int expected = 110;
        Assert.assertEquals("Laptop id is " + laptopID, expected, actual);
    }

    @Test
    public void test4() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID1 = 1100003;
        int laptopID2 = 1100004;
        int discount = 20;
        int expected = 2120;

        int price1 = p1.getPrice(laptopID1);
        int price2 = p1.getPrice(laptopID2);
        int actual = price1 + price2;
        actual = p1.getDiscount(actual, discount);

        String failureMessage = "Laptop ids are " + laptopID1 + " and " + laptopID2 + ". Discount is " + discount;
        Assert.assertEquals(failureMessage, expected, actual);
    }

    @Test
    public void test5() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID1 = 1100006;
        int laptopID2 = 1100007;
        int discount = 10;
        int expected = 1845;

        int price1 = p1.getPrice(laptopID1);
        int price2 = p1.getPrice(laptopID2);
        int actual = price1 + price2;
        actual = p1.getDiscount(actual, discount);

        String failureMessage = "Laptop ids are " + laptopID1 + " and " + laptopID2 + ". Discount is " + discount;
        Assert.assertEquals(failureMessage, expected, actual);
    }

    @Test
    public void test6() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();
        int laptopID1 = 1100005;
        int laptopID2 = 1100008;
        int discount = 10;
        int expected = 2025;

        int price1 = p1.getPrice(laptopID1);
        int price2 = p1.getPrice(laptopID2);
        int actual = price1 + price2;
        actual = p1.getDiscount(actual, discount);

        String failureMessage = "Laptop ids are " + laptopID1 + " and " + laptopID2 + ". Discount is " + discount;
        Assert.assertEquals(failureMessage, expected, actual);
    }
}
