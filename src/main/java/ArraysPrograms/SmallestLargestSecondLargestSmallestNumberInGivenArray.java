package ArraysPrograms;

import java.util.Arrays;

public class SmallestLargestSecondLargestSmallestNumberInGivenArray {
    static int[] arr = new int[]{25, 11, 7, 75, 56, 1, 45, 62, 95, 52, 14};

    //Initialize max with first element of array.
    int max = arr[0];

    SmallestLargestSecondLargestSmallestNumberInGivenArray(int[] arr) {
        int secondLartest = arr[0];

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value > secondLartest) {
                secondLartest = value;
            }
        }

        System.out.println("Largest number of the given array::" + max);
        System.out.println("Second largest number of the given array::" + secondLartest);

    }

    SmallestLargestSecondLargestSmallestNumberInGivenArray() {
        int small = arr[0];
        int secondSmallest = arr[0];
        for (int value : arr) {
            if (value < small) {
                small = value;
            }else if (value < secondSmallest) {
                    secondSmallest = value;
                }

            }

        System.out.println("Smallest number of the given array::" + small);
        System.out.println("Second Smallest number of the given array::" + secondSmallest);
    }


    public void sumOfTheArrayElements(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the given array elements::" + sum);
    }

    public void arraySortAscendingOrder() {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

            System.out.println("Ascending order of the elements of the given array::" + Arrays.toString(arr));

        System.out.println("Second largest number of the given array::" + arr[arr.length - 2]);
        System.out.println("Third largest number of the given array::" + arr[arr.length - 3]);


    }

    public void arraySortDescendingOrder() {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Descending order of the elements of the given array::" + Arrays.toString(arr));
        System.out.println("smallest number of the given array::" + arr[0]);
        System.out.println("Second smallest number of the given array::" + arr[1]);
        System.out.println("Third smallest number of the given array::" + arr[2]);
    }

    public void displayOddEvenNumbers() {
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.println("Display the Given array odd numbers::" + j);
            }
            if (j % 2 == 0) {
                System.out.println("Display the Given array Even numbers::" + j);
            } else if ((j % 3 == 0 || j % 5 == 0) && j % 15 != 0) {
                System.out.println("Number Div by 3 and 5 not 15::" + j);

            }
        }

    }

    public static void arraySortAscendingOrderWithOutThirdVaribale() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        System.out.println("Asscending order withour third varibale" + Arrays.toString(arr));

    }
    public static void main(String[] args) {


        SmallestLargestSecondLargestSmallestNumberInGivenArray s = new SmallestLargestSecondLargestSmallestNumberInGivenArray(arr);
        SmallestLargestSecondLargestSmallestNumberInGivenArray s1 = new SmallestLargestSecondLargestSmallestNumberInGivenArray();
        s1.sumOfTheArrayElements(arr);
        s1.arraySortAscendingOrder();
        s1.arraySortDescendingOrder();
        s1.displayOddEvenNumbers();
        arraySortAscendingOrderWithOutThirdVaribale();
    }
}

