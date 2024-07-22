package homework;

import homework.fizzbuzzpower.Solution;
import homework.largestpalindrome.LargestPalindrome;

public class Main {
    public static void main(String[] args) {
        Solution fizzbuzzPower = new Solution();
        fizzbuzzPower.solution(1000);
        LargestPalindrome largestPalindrome = new LargestPalindrome();
        System.out.println("Largest Palindrome");
        System.out.println(
                largestPalindrome.solution("99883") + "\n"+
                largestPalindrome.solution("90000"));

    }
}
