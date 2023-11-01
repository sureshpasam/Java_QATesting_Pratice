package ArraysPrograms;

public class SmallestLargestSecondLargestSmallestNumberInGivenArray {
    static int[] arr = new int[]{25, 11, 7, 75, 56, 1, 45, 62, 95, 52, 14};
    //Initialize max with first element of array.
    int max = arr[0];
    SmallestLargestSecondLargestSmallestNumberInGivenArray(int[] arr){
        int secondLartest=arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value > secondLartest) {
                secondLartest = value;
            }
        }

        System.out.println("Largest number of the given array::"+max);
        System.out.println("Second largest number of the given array::"+secondLartest);

    }
    SmallestLargestSecondLargestSmallestNumberInGivenArray(){
        int small= arr[0];
        int secondSmallest=arr[0];
        for (int value : arr) {
            if (value < small) {
                small = value;
                if (value < small) {
                    secondSmallest = value;
                }

            }
        }
        System.out.println("Smallest number of the given array::"+small);
        System.out.println("Second Smallest number of the given array::"+secondSmallest);
    }
    public void sumOfTheArrayElements(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the given array elements::"+sum);
    }
    public void arraySortAscendingOrder(){
        int temp=0;
        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                     arr[j]=temp;
                } } }
      for (int i=0;i<arr.length;i++){
          System.out.println("Ascending order of the elements of the given array::"+arr[i]);
      }
        System.out.println("Second largest number of the given array::"+arr[arr.length-2]);
        System.out.println("Third largest number of the given array::"+arr[arr.length-3]);



    }

    public void arraySortDescendingOrder(){
        int temp=0;
        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                } } }
        for (int value : arr) {
            System.out.println("Descending order of the elements of the given array::" + value);
        }
        System.out.println("smallest number of the given array::"+arr[0]);
        System.out.println("Second smallest number of the given array::"+arr[1]);
        System.out.println("Third smallest number of the given array::"+arr[2]);
    }
    public void displayOddEvenNumbers(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
              System.out.println("Display the Given array odd numbers::"+arr[i]);
            }if(arr[i]%2==0){
                System.out.println("Display the Given array Even numbers::"+arr[i]);
            }
        }
    }
    public static void main (String[] args){
        SmallestLargestSecondLargestSmallestNumberInGivenArray s = new SmallestLargestSecondLargestSmallestNumberInGivenArray(arr);
SmallestLargestSecondLargestSmallestNumberInGivenArray s1 =new SmallestLargestSecondLargestSmallestNumberInGivenArray();
s1.sumOfTheArrayElements(arr);
s1.arraySortAscendingOrder();
s1.arraySortDescendingOrder();
s1.displayOddEvenNumbers();
    }
}

