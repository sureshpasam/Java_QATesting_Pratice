package ArraysPrograms;

public class EvenOrOddPostionOfTheArray {
    int [] arr = new int [] {1, 2, 3, 4, 5,10,6,8,9,1,5,6,9};
    EvenOrOddPostionOfTheArray(){
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println("Even position of the elements::"+arr[i]);
        }
    }
    public void oddPostionOfArrayElements(){
        for(int i=0;i<arr.length;i=i+2){
            System.out.println("Odd position of the elements::"+arr[i]);
        }
    }
    public static void main(String args[]){
        EvenOrOddPostionOfTheArray eo= new EvenOrOddPostionOfTheArray();
        eo.oddPostionOfArrayElements();

    }
}

