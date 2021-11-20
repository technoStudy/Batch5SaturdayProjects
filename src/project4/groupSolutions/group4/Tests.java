package project4.groupSolutions.group4;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    Palindrome palindrome = new Palindrome();

    @Test
    public void isStringPalindrome1() {
        Assert.assertTrue(palindrome.isStringPalindrome("777"));
    }

    @Test
    public void isStringPalindrome2() {
        Assert.assertTrue(palindrome.isStringPalindrome("NeverOddOrEven"));
    }

    @Test
    public void isStringPalindrome3() {
        Assert.assertTrue(palindrome.isStringPalindrome("WasItACarOrACatISaw"));
    }

    @Test
    public void isStringPalindrome4() {
        Assert.assertFalse(palindrome.isStringPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    public void isStringPalindrome5() {
        Assert.assertFalse(palindrome.isStringPalindrome("12345"));
    }

    @Test
    public void isNumberPalindrome1() {
        Assert.assertTrue(palindrome.isNumberPalindrome(4554));
    }

    @Test
    public void isNumberPalindrome2() {
        Assert.assertTrue(palindrome.isNumberPalindrome(7777777));
    }

    @Test
    public void isNumberPalindrome3() {
        Assert.assertTrue(palindrome.isNumberPalindrome(0));
    }

    @Test
    public void isNumberPalindrome4() {
        Assert.assertFalse(palindrome.isNumberPalindrome(123456));
    }

    @Test
    public void isNumberPalindrome5() {
        Assert.assertFalse(palindrome.isNumberPalindrome(92));
    }

    @Test
    public void reverseNumber1() {
        int actual = palindrome.reverseNumber(1234);
        int expected = 4321;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseNumber2() {
        int actual = palindrome.reverseNumber(8);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseNumber3() {
        int actual = palindrome.reverseNumber(45678);
        int expected = 87654;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseNumber4() {
        int actual = palindrome.reverseNumber(1590);
        int expected = 951;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom1() {
        String actual = palindrome.generatePalindromeNumberFrom(123, false);
        String expected = "12321";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom2() {
        String actual = palindrome.generatePalindromeNumberFrom(91, true);
        String expected = "9119";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom3() {
        String actual = palindrome.generatePalindromeNumberFrom(91, false);
        String expected = "919";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom4() {
        String actual = palindrome.generatePalindromeNumberFrom(0, true);
        String expected = "00";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom5() {
        String actual = palindrome.generatePalindromeNumberFrom(5, false);
        String expected = "5";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePalindromeNumberFrom6() {
        String actual = palindrome.generatePalindromeNumberFrom(30, true);
        String expected = "3003";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberIntoPalindrome1() {
        int actual = palindrome.convertNumberIntoPalindrome(349);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberIntoPalindrome2() {
        int actual = palindrome.convertNumberIntoPalindrome(404);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberIntoPalindrome3() {
        int actual = palindrome.convertNumberIntoPalindrome(4521);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberIntoPalindrome4() {
        int actual = palindrome.convertNumberIntoPalindrome(19);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}
