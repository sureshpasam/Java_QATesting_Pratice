

public class find_Larget_scecondAndThird_Smallest_All_Combination_of_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 14, 46, 47, 86, 92, 5, 48, 6, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		int thirdLargest = arr[0];
		int smallest = arr[0];
		int secondSmallest = arr[0];
		int thirdSmallest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				//secondLargest = largest;
				//Largest Number
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];
				// Second Largest Number
			}
			else if(arr[i]>thirdLargest) {
				thirdLargest = arr[i];
			}	
		}	
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest= smallest;
				//Smallest Number
				smallest = arr[i];
 
			} else if (arr[i] < secondSmallest) {
				secondSmallest = arr[i];
				// Second Largest Number
			}
			else if(arr[i]<thirdSmallest) {
				thirdSmallest = arr[i];
			}	
		}	
       System.out.println("\nLargest number is::" +largest);
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("\nThird largest number is:" + thirdLargest);
		 System.out.println("\nsmallest number is::" +smallest);
			System.out.println("\nSecond smallest number is:" + secondSmallest);
			System.out.println("\nThird smallest number is:" + thirdSmallest);
	}}


