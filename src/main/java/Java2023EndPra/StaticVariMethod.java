package Java2023EndPra;

public class StaticVariMethod {
    int no;
    String name;
    static String com="Mphasis";

    StaticVariMethod(int i, String n) {
        no = i;
        name = n;
    }

    public void dispay() {
        System.out.println("No:" + no);
        System.out.println("Name:" + no);
        System.out.println("Comapny:" + com);
    }

    public static void main(String[] args) {
        StaticVariMethod c = new StaticVariMethod(101, "suresh P");
        StaticVariMethod c1 = new StaticVariMethod(102, "Pasam");
        c.dispay();
        com = "TCS";
        c1.dispay();
    }
}

/*
The static keyword in Java is used for memory management mainly.
We can apply static keyword with variables, methods, blocks and nested classes.
The static keyword belongs to the class than an instance of the class.

The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class

1. If you declare any variable as static, it is known as a static variable.
The static variable can be used to refer to the common property of all objects (which is not unique for each object),
for example, the company name of employees, college name of students, etc.
The static variable gets memory only once in the class area at the time of class loading.
Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).
 */