package Java2024_Dec;

import java.util.Arrays;

public class ArrayMovesLeftRightZeroEvenOddPost {
    public static void MovesZeroLeft(int [] arr, int j,int temp){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){  //i=0 =zero, it =1 one
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }


        }
        System.out.println(""+ Arrays.toString(arr));


    }


    public static void PostLeft(int [] arr, int j,int temp){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){  //i>0 =Postive print, it i< 0 Negative
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }


        }
        System.out.println(""+ Arrays.toString(arr));


    }

    public static void EvenLeft(int [] arr, int j,int temp){
        for(int i=0;i<arr.length    ;i++){
            if(arr[i]%2==0){  //i%2==0-> Even and i%2!=0->Odd
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }


        }
        System.out.println(""+ Arrays.toString(arr));


    }

    public static void inserArrElement(int [] arr){
        int element =90;
        int postion =2;
        for(int i =arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[postion-1]=element;
        System.out.println(""+Arrays.toString(arr));

    }
    public static void DeleteArrElement(int [] arr) {
        int element = 90;
        int postion = 2;
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[postion - 1] = element;
        System.out.println("" + Arrays.toString(arr));
    }
    public static void main(String[] args){
        int [] arr= { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0 };
        int [] arr1 ={ 1, 2, -3, 4, -5, 6, -7, 8, -9, 10 };
        int [] arr2 ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] arr3= { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0 };

        int j = 0,temp = 0;
        MovesZeroLeft(arr,j,temp);
        PostLeft(arr1,j,temp);
        EvenLeft(arr2,j,temp);
        inserArrElement(arr3);




    }
}
