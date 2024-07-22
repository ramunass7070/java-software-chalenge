package homework.largestpalindrome;

import static org.junit.Assert.*;

public class LargestPalindromeTest {

    @org.junit.Test
    public void solution() {
        LargestPalindrome largestPalindrome = new LargestPalindrome();
        assertEquals("3", new String(largestPalindrome.solution("123")));
        assertEquals("898", new String(largestPalindrome.solution("39878")));
        assertEquals("9", new String(largestPalindrome.solution("00900")));
        assertEquals("0", new String(largestPalindrome.solution("000")));
        assertEquals("0", new String(largestPalindrome.solution("00")));
        assertEquals("9009", new String(largestPalindrome.solution("9900")));
        assertEquals("5", new String(largestPalindrome.solution("054321")));
        assertEquals("9009", new String(largestPalindrome.solution("0990")));
        assertEquals("1", new String(largestPalindrome.solution("010")));
        assertEquals("989", new String(largestPalindrome.solution("8199")));
        assertEquals("989", new String(largestPalindrome.solution("9981")));
        assertEquals("989", new String(largestPalindrome.solution("9189")));
        assertEquals("989", new String(largestPalindrome.solution("1998")));
        assertEquals("0", new String(largestPalindrome.solution("0000000")));
        assertEquals("0", new String(largestPalindrome.solution("000000")));
        assertEquals("", new String(largestPalindrome.solution("")));
    }

}