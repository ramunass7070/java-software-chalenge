package homework.fizzbuzzpower;

public class Solution {
    public Solution() {
    }

    /*FizzBuzzPower solution: itterate numbers from 1 to N+1, on each itteration check if it is a power of 2
     * it is a power of 2 if remaining of consecutive division is 0*/
    private static boolean isPowerOfTwo(int number) {
        while (number % 2 == 0) {
            number = number / 2;
        }
        return number == 1;
    }

    public void solution(int N) {
        for (int i = 1; i < N + 1; i++) {
            if (isPowerOfTwo(i)) {
                System.out.println("POWER");
            } else {
                System.out.println(i);
            }
        }
    }
}
