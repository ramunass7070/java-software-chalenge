FizzBuzz Power

Print out N numbers, replacing powers of  2 with  the word "POWER"

Task description

Write a function
class Solution { public void solution(int N); }
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a
separate line. However, any number which is a power of 2 should be replaced by the word
POWER. For example, number 4 should be replaced by POWER, but number 5 should not.
The function shouldn't return any value.

Given N = 7, the function should print: POWERPOWER3POWER567
Given N = 16, the function should print:
POWERPOWER3POWER567POWER9101112131415POWER
You can print a string to the output (without or with the end-of-line character) as follows:
System.out.print("sample string");System.out.println("whole line");
Assume that: N is an integer within the range [1..1,000].