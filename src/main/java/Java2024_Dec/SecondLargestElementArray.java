package Java2024_Dec;

import java.util.Arrays;

public class SecondLargestElementArray {
    //Approch 1 sorting

    public static void Second() {
        int[] arr = {4, 2, 6, 5, 1, 100, 70};
        Arrays.sort(arr);
        System.out.println("Largest " + arr[arr.length - 1]);
        System.out.println("Second " + arr[arr.length - 2]);
        System.out.println("Third " + arr[arr.length - 3]);


    }

    // Approch 2 Single Pass

    public static void Slargest() {
        int[] arr = {4, 2, 6, 5, 1, 100, 70};
       Arrays.sort(arr);
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                third_largest = second_largest;
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i]!=largest) {
                second_largest = arr[i];
            } else if (arr[i] > third_largest && arr[i]!=second_largest && arr[i]!=largest ) {
                third_largest = arr[i];
            }
        }
        System.out.println("largest element is = " + largest);
        System.out.println("Second largest element is = " + second_largest);
        System.out.println("Third largest element is = " + third_largest);


    }
    // Approch 3 API

    public static void SecondAPIStreams() {
        int[] arr = {4, 2, 6, 5, 1, 100, 70};
        int Large = Arrays.stream(arr).distinct().sorted().skip(arr.length-1).findFirst().getAsInt();
        int secondLarge = Arrays.stream(arr).distinct().sorted().skip(arr.length - 2).findFirst().getAsInt();
        int ThirdLarge = Arrays.stream(arr).distinct().sorted().skip(arr.length - 3).findFirst().getAsInt();

        System.out.println("Large " + Large);
        System.out.println("Second Large " + secondLarge);
        System.out.println("Third Large " + ThirdLarge);

        int Small = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().getAsInt();
        int secondSmall = Arrays.stream(arr).distinct().sorted().skip(2).findFirst().getAsInt();
        int ThirdSmall = Arrays.stream(arr).distinct().sorted().skip(3).findFirst().getAsInt();

        System.out.println("Small " + Small);
        System.out.println("Second Small " + secondSmall);
        System.out.println("Third Small " + ThirdSmall);


    }


    public static void main(String[] args) {
        Second();
        Slargest();
        SecondAPIStreams();
    }
}
