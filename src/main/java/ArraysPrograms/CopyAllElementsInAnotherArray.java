package ArraysPrograms;

import java.util.Arrays;

public class CopyAllElementsInAnotherArray {
    CopyAllElementsInAnotherArray(){
        int[] arr1 = new int[] {1,2,3,5,6,7};
        int [] arr2 = new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.println("000"+ Arrays.toString(arr2));
       }
        public void CopyAllElementsInAnotherArrayString(){
            String[] arr1= {"Suresh","Chaitu","lakshmi"};
            String[] arr2= new String[arr1.length];
            System.arraycopy(arr1, 0, arr2, 0, arr1.length);
                System.out.println("copying the elements in the one arry to another::"+Arrays.toString(arr2));

        }

    public static void main(String args[]){
   CopyAllElementsInAnotherArray copy = new CopyAllElementsInAnotherArray();
   copy.CopyAllElementsInAnotherArrayString();
    }
}
