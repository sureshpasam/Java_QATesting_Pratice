package AllJavaPraticeAlgorithums;

import java.util.Arrays;
import java.util.HashSet;

public class NoOfDistrinctValuesInGivenArray {
    /*Distinct
    START
    Compute number of distinct values in an array
    Write a function

    class Solution { public int solution(int[] A); }

    that, given an array A consisting of N integers, returns the number of distinct values in array A.

    For example, given array A consisting of six elements such that:

     A[0] = 2    A[1] = 1    A[2] = 1
     A[3] = 2    A[4] = 3    A[5] = 1
    the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [0..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].

    */


    public static int solution(int[] A) {
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        // Traverse the input array
        for (int value : A) {
            // If not present, then put it in hashtable and print it

            if (!set.contains(value)) {
                set.add(value);
                System.out.print(value + " ");
                count++;
            }
        }

        System.out.println ("Set value"+set);

        return count;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println("count of the distrinct value::" + NoOfDistrinctValuesInGivenArray.solution(A));

    }
}
