package ArraysPrograms;


import java.util.Arrays;

public class smallestAndLargestIntegerGivenArray {
    static int[] arr = new int[]{25, 11, 7, 75, 56, 1, 45, 62, 95, 52, 14};

    public int[] solution(int[] A, int K) {
        for (int i = 0; i < A.length-1; i++) {
            int destIndex = (i * K + K) % A.length;
            int destValue = A[destIndex];
            A[destIndex] = A[0];
            A[0] = destValue;
        }
        return A;
    }
    public static void main(String[] args){
       int[] A={3, 8, 9, 7, 6};
      int K=2;
        Arrays.sort(arr);
        System.out.println("Array values:::"+ Arrays.toString(arr));
        System.out.println("Second highest value::"+ arr[arr.length-2]);
        System.out.println(" highest value::"+ arr[arr.length-1]);

        System.out.println("smallest value::"+ arr[0]);
        System.out.println("smallest second value::"+ arr[1]);

        smallestAndLargestIntegerGivenArray s = new smallestAndLargestIntegerGivenArray();
        int [] B=s.solution(A,K);
        System.out.print("dsadas"+ Arrays.toString(B));



    }


}
