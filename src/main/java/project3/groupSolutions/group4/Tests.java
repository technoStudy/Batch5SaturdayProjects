package project3.groupSolutions.group4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {

    @Test
    public void camelCase1(){
        CamelCase c1 = new CamelCase();
        String actual = c1.camelCase("i live in the usa.");
        String expected = "I Live In The Usa.";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void camelCase2(){
        CamelCase c1 = new CamelCase();
        String actual = c1.camelCase("This is a teSTing text");
        String expected = "This Is A TeSTing Text";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void camelCase3(){
        CamelCase c1 = new CamelCase();
        String actual = c1.camelCase("an Alien sPEAKS 435 _hello @!$%^");
        String expected = "An Alien SPEAKS 435 _hello @!$%^";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void camelCase4(){
        CamelCase c1 = new CamelCase();
        String actual = c1.camelCase("sleeplessness");
        String expected = "Sleeplessness";
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void gaussSum1(){
        GaussSum s1 = new GaussSum();
        int num1 = 8;
        int num2 = 3;
        int actual = s1.sumOfSquaresOfGaussSums(num1, num2);
        int expected = 1332;
        Assert.assertEquals("The arguments are: " + num1 + " and " + num2, expected, actual);
    }

    @Test
    public void gaussSum2(){
        GaussSum s1 = new GaussSum();
        int num1 = 1;
        int num2 = 1;
        int actual = s1.sumOfSquaresOfGaussSums(num1, num2);
        int expected = 2;
        Assert.assertEquals("The arguments are: " + num1 + " and " + num2, expected, actual);
    }

    @Test
    public void gaussSum3(){
        GaussSum s1 = new GaussSum();
        int num1 = 5;
        int num2 = 10;
        int actual = s1.sumOfSquaresOfGaussSums(num1, num2);
        int expected = 3250;
        Assert.assertEquals("The arguments are: " + num1 + " and " + num2, expected, actual);
    }



    @Test
    public void getPopulation1() {
        GetPopulation g1 = new GetPopulation();
        String[] countries = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};
        int[] populations = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};
        String country = "Benin";

        int actual = g1.populationOfCountry(countries, populations, country);
        int expected = 19237691;
        String message = "Countries: " + Arrays.toString(countries) + "\n" +
                         "Populations: " + Arrays.toString(populations) + "\n" +
                         "The country is " + country;
        Assert.assertEquals(message, expected, actual);
    }

    @Test
    public void getPopulation2() {
        GetPopulation g1 = new GetPopulation();
        String[] countries = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};
        int[] populations = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};
        String country = "Australia";

        int actual = g1.populationOfCountry(countries, populations, country);
        int expected = 38928346;
        String message = "Countries: " + Arrays.toString(countries) + "\n" +
                "Populations: " + Arrays.toString(populations) + "\n" +
                "The country is " + country;
        Assert.assertEquals(message, expected, actual);
    }

    @Test
    public void getPopulation3() {
        GetPopulation g1 = new GetPopulation();
        String[] countries = {"Australia", "Bahamas", "Benin", "Côte d'Ivoire", "Eritrea", "New Zealand", "Panama"};
        int[] populations = {38928346, 36910560, 19237691, 11673021, 586632, 104425, 33931};
        String country = "Germany";

        int actual = g1.populationOfCountry(countries, populations, country);
        int expected = -1;
        String message = "Countries: " + Arrays.toString(countries) + "\n" +
                "Populations: " + Arrays.toString(populations) + "\n" +
                "The country is " + country;
        Assert.assertEquals(message, expected, actual);
    }



    @Test
    public void ThreeEvenOdd1() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {2, 3, 4, 5};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertFalse(message, result);
    }

    @Test
    public void ThreeEvenOdd2() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertFalse(message, result);
    }

    @Test
    public void ThreeEvenOdd3() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {2, 4, 12};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertTrue(message, result);
    }

    @Test
    public void ThreeEvenOdd4() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {2, 3, 4, 5, 12};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertTrue(message, result);
    }

    @Test
    public void ThreeEvenOdd5() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {0, 2, 4, 12, 8, 6, 102};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertFalse(message, result);
    }

    @Test
    public void ThreeEvenOdd6() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {7, 13, 17};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertTrue(message, result);
    }

    @Test
    public void ThreeEvenOdd7() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {7, 13, 17, 1, 25, 37};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertFalse(message, result);
    }

    @Test
    public void ThreeEvenOdd8() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {7, 8, 13, 17, 10};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertTrue(message, result);
    }

    @Test
    public void ThreeEvenOdd9() {
        ThreeEvenOdd t1 = new ThreeEvenOdd();
        int[] arr = {7, 12, 17, 1, 26, 30};
        boolean result = t1.threeEvenOrOdd(arr);
        String message = "Array is : " + Arrays.toString(arr);
        Assert.assertTrue(message, result);
    }



    @Test
    public void updateRange1() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 12, 13, 14, 25, 16, 47, 28, 19, 3};
        int lower = 12;
        int upper = 20;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {1, 12, -1, -1, 25, -1, 47, 28, -1, 3};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void updateRange2() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 12, 13, 14, 25, 16, 47, 28, 19, 3};
        int lower = 10;
        int upper = 28;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {1, -1, -1, -1, -1, -1, 47, 28, -1, 3};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void updateRange3() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 2, 3, 4, 5};
        int lower = 1;
        int upper = 5;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {1, -1, -1, -1, 5};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void updateRange4() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 2, 3, 4, 5};
        int lower = 0;
        int upper = 9;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {-1, -1, -1, -1, -1};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void updateRange5() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 2, 3, 4, 5};
        int lower = -12;
        int upper = -5;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {1, 2, 3, 4, 5};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void updateRange6() {
        UpdateRange u1 = new UpdateRange();
        int[] arr = {1, 2, 3, 4, 5};
        int lower = 6;
        int upper = 15;
        int[] actual = u1.updateRange(arr, lower, upper);
        int[] expected = {1, 2, 3, 4, 5};
        String message = "The array: " + Arrays.toString(arr) + "\n" +
                "Lower bound: " + lower + "\n" +
                "Upper bound: " + upper;
        Assert.assertEquals(message, Arrays.toString(expected), Arrays.toString(actual));
    }

}
