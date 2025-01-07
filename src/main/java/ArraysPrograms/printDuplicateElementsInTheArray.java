package ArraysPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class printDuplicateElementsInTheArray {

    public void reverseOfTheGivenArray(){
        int [] arr = {1,2,3,5,4};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("Reverse of the given array::"+arr[i]);
        }

    }
    printDuplicateElementsInTheArray(){
        int [] arr = {1,3,2,3,1};
        int [] d = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    d[i]=arr[j];

                    System.out.println("Duplicate elements::"+arr[i]);
                }

            }

        }

        System.out.print("Duplicate element....."+ Arrays.toString(d));
    }


    public static void printDuplicateElementsInTheArray(){
        int [] arr = {1,3,2,3,1,10,8,10,8};
        int num =1;
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (!set.contains(num)) {
                set.add(j);
            }
            num++;


        }
        System.out.println("HashSetDuplicatr"+set);

    }
    public static void main(String[] args){
        printDuplicateElementsInTheArray du = new printDuplicateElementsInTheArray();
        du.reverseOfTheGivenArray();
        printDuplicateElementsInTheArray();
    }
}
