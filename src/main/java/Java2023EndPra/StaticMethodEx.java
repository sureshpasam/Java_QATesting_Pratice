package Java2023EndPra;

public class StaticMethodEx {
    int Num;
    String name;
    static String company = "CTS";

    static void change() {
        company = "TCS";
    }

    StaticMethodEx(int i, String s) {
        Num = i;
        name = s;

    }

    public void display() {
        System.out.println("No:" + Num);
        System.out.println("Name:" + name);
        System.out.println("Comapny:" + company);
    }

    public static void main(String[] args) {
        StaticMethodEx s = new StaticMethodEx(101, "Suresh");
        s.display();
        StaticMethodEx s1 = new StaticMethodEx(102, "pasam");
        company ="Suresh";
        s1.display();


    }
}

/*
A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.


Restrictions for the static method
There are two main restrictions for the static method. They are:

The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context.

Q) Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main()
method that will lead the problem of extra memory allocation.
 */
