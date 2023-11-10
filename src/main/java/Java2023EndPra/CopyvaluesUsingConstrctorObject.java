package Java2023EndPra;

//Java program to initialize the values from one object to another object.
public class CopyvaluesUsingConstrctorObject {

    int id;
    String name;
    //constructor to initialize integer and string
    CopyvaluesUsingConstrctorObject(int i , String s){
       id =i;
       name =s;
    }
//constructor to initialize another object
    CopyvaluesUsingConstrctorObject(CopyvaluesUsingConstrctorObject con){
       id=con.id;
       name=con.name;
    }

    public void display(){
        System.out.print("Id is:"+id  +" Name is::"+name);
    }


    public static void main(String[] args){
        CopyvaluesUsingConstrctorObject cop = new CopyvaluesUsingConstrctorObject(20,"suresh pasam");
        CopyvaluesUsingConstrctorObject cop1 = new CopyvaluesUsingConstrctorObject(30,"suresh ");
        CopyvaluesUsingConstrctorObject cop2 = new CopyvaluesUsingConstrctorObject(cop1);
        cop.display();
        cop2.display();
        //cop1.display();

    }
}
