package AllJavaPraticeAlgorithums;

public class Findthemissingelementinagivenpermutation_GivenArray {
    /*An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].*/
    public int solution(int[] A) {
        double n = A.length + 1;
        double totalSum = (n * (n + 1)) / 2;

        for (int value : A) {
            totalSum -= value;
        }
        System.out.println("Missing value of the given array::" + (int) totalSum);
        int aa = (int) (totalSum == 0 ? A.length + 1 : totalSum);
        return (int) (totalSum == 0 ? A.length + 1 : totalSum);
    }


    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 2};
        Findthemissingelementinagivenpermutation_GivenArray ff = new Findthemissingelementinagivenpermutation_GivenArray();
        int B = ff.solution(A);
        System.out.println("Missing value of the given array::" + B);
    }
}
