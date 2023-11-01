package ArraysPrograms;

import java.util.Arrays;

public class FindFrequencyOfNumberInGivenArray {

    static int frequency(int[] a, int x)
    {
        int count = 0;
        for (int value : a)
            if (value == x)
                count++;
        return count;
    }
    public static void countFreq(int[] arr)
    {
        boolean[] visited = new boolean[arr.length];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Each digit frequency in the given array::"+arr[i] + ":" + count);
        }
    }
    public static void main(String[] args){
        int x=8;
        FindFrequencyOfNumberInGivenArray f = new FindFrequencyOfNumberInGivenArray();
        int [] arr ={1,5,5,3,3,5,8,8,9,9,0,0,4,4,7,7,4};
        System.out.println("Given number digit count of the array:::"+x+"::"+frequency(arr,x));
        countFreq(arr);

    }
}
