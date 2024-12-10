package ArraysPrograms;

public class printDuplicateElementsInTheArray {

    public void reverseOfTheGivenArray(){
        int [] arr = new int []{1,3,5,4,5,7,5,4,3,6,8,9,0,8,9,0,8};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("Reverse of the given array::"+arr[i]);
        }

    }
    printDuplicateElementsInTheArray(){
        int [] arr = new int []{1,3,5,4,5,7,5,4,3,6,8,9,0,8,9,0,8};
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate elements::"+arr[j]);
                }

            }

        }
    }
    public static void main(String[] args){
        printDuplicateElementsInTheArray du = new printDuplicateElementsInTheArray();
        du.reverseOfTheGivenArray();
    }
}
