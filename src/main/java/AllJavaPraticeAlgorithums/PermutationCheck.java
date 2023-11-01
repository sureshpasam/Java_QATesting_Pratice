package AllJavaPraticeAlgorithums;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PermutationCheck {
    /*
   Q:: PermCheck
START
Check whether array A is a permutation.

A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

    * */
    public int solution2(int[] A) {
        TreeSet<Integer> hset = new TreeSet<Integer>();
        int total_value = 0;
        long total_indexes = A.length * (A.length + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            hset.add(A[i]);
            total_value += A[i];
        }
        if (hset.size() == hset.last() && total_indexes == total_value) {
            return 1;
        }
        return 0;
    }

    public int solution1(int[] A) {
        Set<Integer> all = new HashSet<Integer>();

        for (int v : A) {
            if (v > A.length) return 0;
            all.add(v);
        }

        return all.size() == A.length ? 1 : 0;
    }

    public int solution(int[] A) {
        final int N = A.length;
        long sum = N * (N + 1) / 2;

        for (int value : A) {
            sum -= value;
        }

        return sum == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        PermutationCheck pc = new PermutationCheck();
        System.out.println("Permutation checking::" + pc.solution(A));
        System.out.println("Permutation checking using hashSetConcept::" + pc.solution(A));
        System.out.println("Permutation checking using Tree set::" + pc.solution(A));

    }
}
