package AllJavaPraticeAlgorithums;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class missinInterger {
    /*MissingInteger

Find the smallest positive integer that does not occur in a given sequence.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
    TreeMap<Integer, Object> all = new TreeMap<Integer, Object>();

    public int solution1(int[] A) {

        for (int i = 0; i < A.length; i++)
            all.put(i + 1, new Object());

        for (int i = 0; i < A.length; i++)
            if (all.containsKey(A[i]))
                all.remove(A[i]);

        Iterator notOccur = all.keySet().iterator();
        if (notOccur.hasNext())
            return (int) notOccur.next();

        return 1;
    }

    public int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<>();
        while (!hset.contains(num)) {
            for (int j : A) {
                hset.add(j);
            }
            num++;
        }

        return num;
    }

    public static void main(String[] args) {
        missinInterger m = new missinInterger();
        int[] A = {1,2,6,7,4,3};
        //int[] A = {1, 3, 6, 4, 2};
        System.out.println("Missing Integer is::" + m.solution(A));
        System.out.println("Missing Integer is soultion 1::" + m.solution1(A));
    }
}
