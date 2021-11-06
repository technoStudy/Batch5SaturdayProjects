package Week2.project2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Tests {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void common2Arrays1() {
        final String testString = "1 2 3 4 5";
        provideInput(testString);
        Common2Arrays.main(new String[0]);
        String result = "false";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void common2Arrays2() {
        final String testString = "1 2 3 4 3";
        provideInput(testString);
        Common2Arrays.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void common2Arrays3() {
        final String testString = "1 2 3 1 5";
        provideInput(testString);
        Common2Arrays.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void common2Arrays4() {
        final String testString = "1 2 3 1 3";
        provideInput(testString);
        Common2Arrays.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin1() {
        final String testString = "1 2 15 4 10";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "14";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin2() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "50";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin3() {
        final String testString = "10 1 -3 5";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "13";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin4() {
        final String testString = "23";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "0";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin5() {
        final String testString = "1 1 1 5 5 5";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "4";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void diffBetweenMaxMin6() {
        final String testString = "-20 -5 -10 -2";
        provideInput(testString);
        DiffBetweenMaxMin.main(new String[0]);
        String result = "18";
        Assert.assertEquals("Test data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void reverseArr1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);
        ReverseArr.main(new String[0]);
        String[] expected = new String[]{"2", "10", "50", "23", "12", "0"};
        Assert.assertEquals("Test data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void reverseArr2() {
        final String testString = "20";
        provideInput(testString);
        ReverseArr.main(new String[0]);
        String[] expected = new String[]{"20"};
        Assert.assertEquals("Test data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void reverseArr3() {
        final String testString = "\n";
        provideInput(testString);
        ReverseArr.main(new String[0]);
        String[] expected = new String[]{""};
        Assert.assertEquals("Test data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void sameFirstAndLast1() {
        final String testString = "0 12 23 50 10 2";
        provideInput(testString);
        SameFirstAndLast.main(new String[0]);
        String result = "false";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void sameFirstAndLast2() {
        final String testString = "0 12 23 50 10 2 0";
        provideInput(testString);
        SameFirstAndLast.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void sameFirstAndLast3() {
        final String testString = "45";
        provideInput(testString);
        SameFirstAndLast.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void sumTotalTest() {
        final String expected = "441.4";
        SumTotal.main(new String[0]);
        Assert.assertEquals(expected, getOutput().trim());
    }

    @Test
    public void arrayContains1() {
        final String testString = "1 2 3 4 5";
        provideInput(testString);
        ArrayContains.main(new String[0]);
        String result = "false";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void arrayContains2() {
        final String testString = "1 2 3 1 2";
        provideInput(testString);
        ArrayContains.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void arrayContains3() {
        final String testString = "1 2 3 2 3";
        provideInput(testString);
        ArrayContains.main(new String[0]);
        String result = "true";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void arrayContains4() {
        final String testString = "1 2 3 3 4";
        provideInput(testString);
        ArrayContains.main(new String[0]);
        String result = "false";
        Assert.assertEquals("Tests data is: " + testString, result, getOutput().trim());
    }

    @Test
    public void changeArray1() {
        final String testString = "Peach Berry Orange WaterMelon Orange";
        provideInput(testString);
        ChangeArray.main(new String[0]);
        String[] expected = new String[]{"Peach", "Berry", "Apple", "WaterMelon", "Apple"};
        Assert.assertEquals("Tests data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void changeArray2() {
        final String testString = "Peach Orange Berry WaterMelon Orange Kiwi Kiwi Orange";
        provideInput(testString);
        ChangeArray.main(new String[0]);
        String[] expected = new String[]{"Peach", "Apple", "Berry", "WaterMelon", "Apple", "Kiwi", "Kiwi", "Apple"};
        Assert.assertEquals("Tests data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void changeArray3() {
        final String testString = "Orange Orange Orange Orange";
        provideInput(testString);
        ChangeArray.main(new String[0]);
        String[] expected = new String[]{"Apple", "Apple", "Apple", "Apple"};
        Assert.assertEquals("Tests data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }

    @Test
    public void changeArray4() {
        final String testString = "Peach Apple Berry Apple Apple Kiwi Kiwi Cherry";
        provideInput(testString);
        ChangeArray.main(new String[0]);
        String[] expected = new String[]{"Peach", "Apple", "Berry", "Apple", "Apple", "Kiwi", "Kiwi", "Cherry"};
        Assert.assertEquals("Tests data is: " + testString, Arrays.toString(expected), getOutput().trim());
    }
}