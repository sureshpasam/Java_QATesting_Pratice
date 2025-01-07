import java.util.Arrays;

public class AdpPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int i, k, t;
		        int [] arr = new int []{10, 20, 30, 40, 50};
		        int [] a =arr;
		        int n= arr.length;
		        for (i = 0; i < n / 2; i++) { 
		            t = a[i];
		            a[i] = a[n - i - 1];
		            a[n - i - 1] = t;
		        }
		System.out.println(Arrays.toString(a));


		    } 

	}


