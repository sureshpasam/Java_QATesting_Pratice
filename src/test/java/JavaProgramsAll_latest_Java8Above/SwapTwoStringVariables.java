package JavaProgramsAll_latest_Java8Above;

public class SwapTwoStringVariables {
    public static void main(String[] args) {
        String a = "suresh";
        String b = "pasam";
        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());
        System.out.println("A value is:::" + a);
        System.out.println("B value is:::" + b);
        /* */




    }



}

