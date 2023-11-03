package AllJavaPraticeAlgorithums;

public class Dominator {
    /* Dominator
START
Find an index of an array such that its value occurs at more than half of indices in the array.

An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

For example, consider array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

For example, given array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
the function may return 0, 2, 4, 6 or 7, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].*/
    public int solution(int[] A) {
        int count = 1;
        int candidate = A[0];
        int index = 0;
        int N = A.length;
        for (int i = 1; i < N; i++) {
            if (A[i] == candidate) {
                ++count;
            } else if (count > 0) {
                --count;
            } else {
                candidate = A[i];
                index = i;
                count = 1;
            }
        }
        if (count > 0) {
            count = 0;
            for (int i = 0; i < N && count <= N / 2; ++i) {
                if (A[i] == candidate) {
                    count++;
                }
            }
            if (count > (N / 2)) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        Dominator d = new Dominator();
        System.out.println("Doinator value is::" + d.solution(A));

    }
}