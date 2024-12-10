package ArraysPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicateElementsGivenArray {
    public static int removeDuplicateElements(int arr[], int length){
        int [] temp = new int[length];
        int j=0;
        if (length==0 || length==1){
            return length;
        }
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }

        }
        temp[j++]=arr[length-1];
        //Changing the original array

        for (int i=0;i<j;i++){
           arr[i]= temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
        Arrays.sort(arr);//sorting array
        int length = arr.length;
        length = removeDuplicateElements(arr, length);

        HashSet <Integer> set = new HashSet<Integer>();
        for (int val:arr) {
            set.add(val);
            set.stream().sequential();
        }
        System.out.println("set"+set);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
