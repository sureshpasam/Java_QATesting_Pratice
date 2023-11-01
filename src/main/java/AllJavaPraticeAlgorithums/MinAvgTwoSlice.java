package AllJavaPraticeAlgorithums;

public class MinAvgTwoSlice {
    /*
    * MinAvgTwoSlice
START
Find the minimal average of any slice containing at least two elements.
A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).

For example, array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
contains the following example slices:

slice (1, 2), whose average is (2 + 2) / 2 = 2;
slice (3, 4), whose average is (5 + 1) / 2 = 3;
slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
The goal is to find the starting position of a slice whose average is minimal.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A consisting of N integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.

For example, given array A such that:

    A[0] = 4
    A[1] = 2
    A[2] = 2
    A[3] = 5
    A[4] = 1
    A[5] = 5
    A[6] = 8
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−10,000..10,000].*/

    public int solution(int[] A) {
        int result = 0;
        int N = A.length;
        int[] prefix = new int[N + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + A[i - 1];
        }
        double avg = Double.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                double temp = (double) (prefix[j] - prefix[i - 1]) / (double) (j - i + 1);
                if (temp < avg) {
                    avg = temp;
                    result = i - 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        MinAvgTwoSlice m = new MinAvgTwoSlice();
        System.out.println("MinAvgTwoSlice:::" + m.solution(A));
    }
}
