package homework.largestpalindrome;

public class LargestPalindrome {
    public LargestPalindrome() {
    }

    public String solution(String S) {
        int[] count = new int[10];
        //count  occurrence of each digit
        for (char i : S.toCharArray()) {
            count[Character.getNumericValue(i)]++;
        }
        StringBuilder outputString = new StringBuilder();
        //consider center part of the output string
        int highestAsymmetric = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 1) {
                highestAsymmetric = i;
            }
        }
        if (highestAsymmetric > -1) {
            outputString.append(highestAsymmetric);
        }
        boolean isZeroAllowed = false;
        if (count[0] / 2 > 0) {
            for (int i = 1; i < count.length; i++) {
                if (count[i] / 2 > 0) {
                    for (int j = 0; j < count[0] / 2; j++) {
                        outputString.append(0);
                        outputString.insert(0, 0);
                    }
                    isZeroAllowed = true;
                    break;
                }
            }
            if (!isZeroAllowed && highestAsymmetric < 0) {
                outputString.append(0);
                return outputString.toString();
            }
        }
//add symmetrically digits 1-9
        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) {
                for (int a = 0; a < count[i] / 2; a++) {
                    outputString.append(i);
                    outputString.insert(0, i);
                }
            }
        }
        return outputString.toString();
    }
}
