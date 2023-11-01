

import java.util.Arrays;

public class MedianOfTheAnSingleArray {
	public static void main(String[] args) {
	     // initialize array with odd number of element
	     int[] values = { 2, 3, 6, 12, 15, 34, 65, 78, 99 };
	     // calculate median
	     double median = median(values);
	     System.out.println("Median issss : " + median);
	     // re-initialize array with even number of element  	
	     int[] values1 = { 2, 3, 6, 12, 15, 34, 65, 78};
	     // calculate median
	     median = median(values1);
	     System.out.println("Median isss : " + median);
	  }
	 
	  static double median(int[] values) {
	     // sort array
		  
	     Arrays.sort(values);
	     double median;
	     // get count of scores
	     int totalElements = values.length;
	     // check if total number of scores is even
	     if (totalElements % 2 == 0) {
	    	 int bb = values[totalElements / 2 - 1];
	    	 int bb1 = values[totalElements / 2];
	        int sumOfMiddleElements = values[totalElements / 2] + values[totalElements / 2 - 1];
	        // calculate average of middle elements
	        median = ((double) sumOfMiddleElements) / 2;
	     } else {
	        // get the middle element
	    	
	        median = (double) values[values.length / 2];
	  }
	  return median;
	 }
}
