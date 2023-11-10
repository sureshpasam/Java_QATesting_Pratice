package Java2023EndPra;
public class ConstructorDefault {

    ConstructorDefault(){
        System.out.println("Default constructor called");
    }

    public static void main(String args[]){
        ConstructorDefault Dcon = new ConstructorDefault();

    }

}

/*


1. constructor is a block of codes similar to the method. It is called when an instance of the class is created.
 At the time of calling constructor, memory for the object is allocated in the memory.

2. It is a special type of method which is used to initialize the object.

3. Every time an object is created using the new() keyword, at least one constructor is called.

4. It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

 Note: It is called constructor because it constructs the values at the time of object creation.
 It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

        Rules for creating Java constructor There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized


Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.
Rule: If there is no constructor in a class, compiler automatically creates a default constructor.

]Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.


*/

