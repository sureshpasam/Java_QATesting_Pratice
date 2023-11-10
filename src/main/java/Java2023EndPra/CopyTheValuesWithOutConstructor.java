package Java2023EndPra;

public class CopyTheValuesWithOutConstructor {
    int id;
    String name;

    CopyTheValuesWithOutConstructor(int i, String n) {
        id = i;
        name = n;
    }

    CopyTheValuesWithOutConstructor() {

    }

    public void display() {
        System.out.println("ID is ::" + id);
        System.out.println("Name is ::" + name);

    }

    public static void main(String[] args) {
        CopyTheValuesWithOutConstructor con = new CopyTheValuesWithOutConstructor(101, "Suresh Pasam");
        CopyTheValuesWithOutConstructor con1 = new CopyTheValuesWithOutConstructor();
        con1.id = con.id;
        con1.name = con.name;
        con.display();
        con1.display();


    }
}

/*
Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc.
You can perform any operation in the constructor as you perform in the method.

Is there Constructor class in Java?
Yes.

What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class.
 It is found in the java.lang.reflect package.
 */