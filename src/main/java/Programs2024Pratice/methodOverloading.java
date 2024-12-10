package Programs2024Pratice;

public class methodOverloading {
    // 1.changing the aruguments
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    // 2. Changing the Data Types

    public static double sub(int a, float b){
        return a-b;
    }

    public static double sub(int a, float b, double c){
        return a+b-c;
    }

    public static void main(String[] args){
      //  methodOverloading m = new methodOverloading();
        System.out.println("Change aruguments::"+add(10,20));
        System.out.println("Change aruguments::"+add(10,20,40));

       // methodOverloading m = new methodOverloading();
        System.out.println("Change aruguments::"+sub(100,20));
        System.out.println("Change aruguments::"+sub(1000,200,40000));

    }
}

/*
If a class has multiple methods having same name but different in parameters,
it is known as Method Overloading.

If we have to perform only one operation, having same name of the methods increases
the readability of the program.

Advantage of method overloading
Method overloading increases the readability of the program.

Different ways to overload the method
There are two ways to overload the method in java

By changing number of arguments
By changing the data type
 */
