package project7.groupSolutions.group2;

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
        int expected = 1100;
        Assert.assertEquals("Laptop id is " + laptopID, expected, actual);
    }


    @Test
    public void test4() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100003);

        int num2 = p1.getPrice(1100004);

        int total = num + num2;

        System.out.println(total);
        total = p1.getDiscount(total, 20);
        System.out.println(total);
        Assert.assertTrue("result should be 2120 but your result is " + total, total == 2120);
    }

    // 530
    @Test
    public void test5() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100006);

        int num2 = p1.getPrice(1100007);

        int total = num + num2;

        total = p1.getDiscount(total, 10);

        Assert.assertTrue("result should be 1845 but your result is " + total, total == 1845);
    }

    @Test
    public void test6() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100005);

        int num2 = p1.getPrice(1100008);

        int total = num + num2;

        total = p1.getDiscount(total, 10);

        Assert.assertTrue("result should be 2025 but your result is " + total, total == 2025);

    }
}
