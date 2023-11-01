package ArraysPrograms;

public class sumOfTheDigitsArrayAndAverage {
    static int[] arr = new int []{50,-5,60,90,86,96,99,6,3,25,45,66,10};
    static int sum=0;
    static double avg;
    static public void SumOfDigitsAndAverage(){
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            avg=sum/arr.length;
        }
        System.out.println("Sum of the given array is:: "+sum);
        System.out.println("Avg of the given array is:: "+avg);
    }
    public static void main(String args[]){
sumOfTheDigitsArrayAndAverage.SumOfDigitsAndAverage();

    }
}
