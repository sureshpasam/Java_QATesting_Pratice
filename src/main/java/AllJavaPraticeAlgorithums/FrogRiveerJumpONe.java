package AllJavaPraticeAlgorithums;

import java.util.ArrayList;
import java.util.List;

public class FrogRiveerJumpONe {
/*
Q:
1. FrogRiverOne
Find the earliest time when a frog can jump to the other side of a river.

A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:

  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4
the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

N and X are integers within the range [1..100,000];
each element of array A is an integer within the range [1..X].*/

    public int solution(int X, int[] A){
        int steps = X;
        boolean[] bitmap = new boolean[steps+1];
        for(int i = 0; i < A.length; i++){
            if(!bitmap[A[i]]){
                bitmap[A[i]] = true;
                steps--;
                if(steps == 0) return i;
            }

        }
        return -1;
    }
    public int solution1(int X, int[] A){
        int sum = 0;

        List<Integer> arrayList = new ArrayList<>();

        for (int iii = 0; iii < A.length; iii++) {

            if (A[iii] <= X && !arrayList.contains(A[iii])) {
                sum += A[iii];
                arrayList.add(A[iii]);
            }
            if (A[iii] == X) {
                if (sum == X * (X + 1) / 2) {
                    return iii;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args){
 int [] A= {1,3,1,4,2,3,5,4};
 int X=5;
 FrogRiveerJumpONe fr = new FrogRiveerJumpONe();
 int B = fr.solution1(X,A);
 System.out.println("Frog river of the::"+B);

    }
}
