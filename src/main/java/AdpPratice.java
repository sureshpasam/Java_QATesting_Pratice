import java.util.Arrays;

public class AdpPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int i, t;
		        int [] arr = new int []{10, 20, 30, 40, 50};
		        int n= arr.length;
		        for (i = 0; i < n / 2; i++) { 
		            t = arr[i];
		            arr[i] = arr[n - i - 1];
		            arr[n - i - 1] = t;
		        }
		System.out.println(Arrays.toString(arr));


		    } 

	}


