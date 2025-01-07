package Java2024_Dec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArraynTimes {
    public static void sortt( ){
        Integer [] arr = {0, 0, 2, 10, 50, 40, 4, 1, 5};
        Arrays.sort(arr);
//        List<Integer>list = Arrays.asList(arr);
//        Collections.sort(list);

        System.out.println("Sorting of the array"+ Arrays.toString(arr));

    }
    public static void main(String [] args){
        int arr[]= {0,0,2,10,50,40,4,1,5};
        sortt();

        int zeroes_count =0;
        int ones_count = 0;
        int twos_count  = 0;

        for(int i=0;i<arr.length;++i)
        {                                    //Lets count 0,1,2
            if(arr[i]==0)
                ++zeroes_count;

            if(arr[i]==1)
                ++ones_count;

            if(arr[i]==2)
                ++twos_count;
        }

        //now filling the array
        for(int i=0;i<arr.length;++i)
        {
            if(zeroes_count>0)
            {
                arr[i]=0;
                --zeroes_count;

            }

            else if(ones_count>0)
            {
                arr[i]=1;
                --ones_count;
            }

            else if(twos_count>0)
            {
                arr[i]=2;
                --twos_count;
            }
        }

        System.out.println(Arrays.toString(arr));
        


        //Here first for loop will run O(n) time
        //Second for loop will run O(n) time
        //Time complexity =	O(n) + O(n) = O(n) // n = length of array
    }
}
