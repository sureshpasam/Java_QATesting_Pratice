package Programs2024Pratice;

public class MRBankCallMethods {
    public static void main(String[] args) {
        MBSBI sbi = new MBSBI();
        MRICICI icic = new MRICICI();
        MRHDFC hdfc = new MRHDFC();
        System.out.println("Interest of the SBI is " + sbi.getRateofInterest());
        System.out.println("Interest of the ICIC is " + icic.getRateofInterest());
        System.out.println("Interest of the HDFC is " + hdfc.getRateofInterest());

    }
}

/*
If subclass (child class) has the same method as declared in the parent class,
it is known as method overriding in Java.

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class,
it is known as method overriding.

Usage of Java Method Overriding

Method overriding is used to provide the specific implementation of a method which is already provided by
its superclass.
Method overriding is used for runtime polymorphism

Rules for Java Method Overriding

The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance)
 */