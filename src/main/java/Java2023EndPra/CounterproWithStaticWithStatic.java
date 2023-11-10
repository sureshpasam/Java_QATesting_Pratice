package Java2023EndPra;

public class CounterproWithStaticWithStatic {
    static int n = 0;

    public void withoutstatic() {
        int count = 0;
        count++;
        System.out.println("Count the number" + count);


    }

    public void withstatic() {
        n++;
        System.out.println("Count the number" + n);


    }

    public static void main(String[] args) {
        CounterproWithStaticWithStatic c = new CounterproWithStaticWithStatic();
        c.withoutstatic();
        c.withoutstatic();
        c.withoutstatic();
        c.withstatic();
        c.withstatic();
        c.withstatic();
        c.withstatic();
    }
}
