package ArraysPrograms;

public class CopyAllElementsInAnotherArray {
    CopyAllElementsInAnotherArray(){
        int[] arr1 = new int[] {1,2,3,5,6,7};
        int [] arr2 = new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.println("000"+arr2);
        for (int i =0;i<arr2.length;i++) {

            System.out.println("copying the elements in the one arry to another::"+arr2[i]);

        }}
        public void CopyAllElementsInAnotherArrayString(){
            String[] arr1= new String[]{"Suresh","Chaitu","lakshmi"};
            String[] arr2= new String[arr1.length];
            for (int i=0;i<arr1.length;i++){
                arr2[i]=arr1[i];
            }
            for (int i =0;i<arr2.length;i++) {
                System.out.println("copying the elements in the one arry to another::"+arr2[i]);

            }
        }

    public static void main(String args[]){
   CopyAllElementsInAnotherArray copy = new CopyAllElementsInAnotherArray();
   copy.CopyAllElementsInAnotherArrayString();
    }
}
