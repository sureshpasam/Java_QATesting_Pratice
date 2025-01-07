package Java2024_Dec;

import java.util.Arrays;

public class ArrayRightRotate {

    //right rotate an array by d places

    public static void right_rotate(int[] arr, int d, int n) {
        int p = 1;
        d = d % n; // important condition if d is very large it will prevent loop running extra
        while (p <= d) {
            int last_element = arr[n - 1];
            for (int i = arr.length - 1; i > 0; --i) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last_element;
            ++p;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void left_rotate(int[] arr, int n) {
        int p = 1,d=3;
        d = d % n;
        while (p <= d) {

            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[n - 1] = first;
            p++;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int d = 4; //means rotate it to right by 4 places change number accordingly
        int[] arr = {20, 10, 30, 40, 5, 6, 7};
        right_rotate(arr, d, arr.length);
        left_rotate(arr, arr.length);
    }
}
