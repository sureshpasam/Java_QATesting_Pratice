package AllJavaPraticeAlgorithums;

import java.util.ArrayList;

public class ContDiv {
    /* Q::
    CountDiv
START
Compute number of integers divisible by k in range [a..b].
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
     */
    public int solution1(int A, int B, int K) {
        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }

    public int solution(int A, int B, int K) {
        int counter = 0;
        int divisiableByElement = 0;
        ArrayList<Integer> listOfNumbersInBetween = new ArrayList<>();

        for (int i = A; i <= B; i++) {
            listOfNumbersInBetween.add(i);
        }

        for (int arrayElement : listOfNumbersInBetween) {
            if (arrayElement % K == 0) {
                counter++;
                System.out.println("Divisibale of elements::" + divisiableByElement);
            }

        }

        return counter;
    }

    public static void main(String[] args) {
        int A = 6, B = 11, K = 2;
        ContDiv cd = new ContDiv();
        System.out.println("ContDiv values are::" + cd.solution(A, B, K));
        System.out.println("ContDiv values are solution1 methods are return::::" + cd.solution1(A, B, K));
    }
}
