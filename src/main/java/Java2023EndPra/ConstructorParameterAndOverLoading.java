package Java2023EndPra;

public class ConstructorParameterAndOverLoading {
    // parameter constructor
    ConstructorParameterAndOverLoading(int No, String name) {
        System.out.println("Student No Is " + No + " Student Name is:: " + name);
    }

    // Constructor overloading
    ConstructorParameterAndOverLoading(int No, int age, String name) {
        System.out.println("Student No Is " + No + " Student age:  " + age + " Student Name is:: " + name);
    }

    public static void main(String args[]) {
        ConstructorParameterAndOverLoading con = new ConstructorParameterAndOverLoading(101, "Suresh");
        ConstructorParameterAndOverLoading con1 = new ConstructorParameterAndOverLoading(101, 32, "Suresh");

    }
}

/*
Java Copy Constructor
There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class

 */