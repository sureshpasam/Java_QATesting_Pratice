package ArraysPrograms;

public class EachvalueNoofTimeOccured {
    public void reverseOfTheGivenArray(){
        int [] arr = new int []{1,3,5,4,5,7,5,4,3,6,8,9,0,8,9,0,8};
        int res =0;
        int [] r = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);
        }


    }
    EachvalueNoofTimeOccured() {
        int [] arr = new int[]{1,4,5,1,4,2,5,2,5,4,2,5,3,2,2,4,5,2};
        int[] fre = new int[arr.length];
        int visit=-1;
        for(int i =0;i<arr.length;i++){
            int count =1;
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    //To avoid counting same element again
                    fre[j]=visit;
                }
            }
            if (fre[i]!=visit){
                fre[i]=count;
            }
        }
        for (int i =0;i< fre.length;i++){
            if(fre[i] != visit) {
                System.out.println("No of occurence in the each value::" + arr[i] + "   Fregquency::" + fre[i]);
            }
        }
    }

    public static void main(String args[]){
        EachvalueNoofTimeOccured each = new EachvalueNoofTimeOccured();
        each.reverseOfTheGivenArray();

    }
}
