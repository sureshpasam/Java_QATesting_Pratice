package Programs2024Pratice;

public class thisU4PassArgAsMe {


    private Object thisU4PassArgAsMe;

    void mm(thisU4PassArgAsMe obj){
        System.out.println("Method id invoked");
    }
    void p(){
        mm((Programs2024Pratice.thisU4PassArgAsMe) thisU4PassArgAsMe);
    }
    public static void main(String[] args){
        Programs2024Pratice.thisU4PassArgAsMe dd = new thisU4PassArgAsMe();
        dd.p();
    }
}
