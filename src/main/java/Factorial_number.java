

import java.util.Arrays;

public class Factorial_number {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num=4;
		long fact = 1;

		for (int i =1;i<=num;i++) {
			fact*=i;

		}
		System.out.println(num+ " factorial is ::"+fact);


		int arr[] = {10, 324, 45, 90, 9808}; 
		int max = Arrays.stream(arr).max().getAsInt(); 
		System.out.println("Largest in given array is " +max);

		int arr1[] = {10, 324, 45, 90, 9800}; 

		// Method to find maximum in arr[] 


		int i; 

		// Initialize maximum element 
		int max1 = arr1[0]; 

		// Traverse array elements from second and 
		// compare every element with current max   
		for (i = 0; i < arr1.length; i++) 
			if (arr1[i] > max1) {
				max1 = arr1[i]; 

			} System.out.println(max1);}
	}

// Driver method 







