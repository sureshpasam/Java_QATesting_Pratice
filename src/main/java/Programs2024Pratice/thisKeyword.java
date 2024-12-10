package Programs2024Pratice;

public class thisKeyword {

    // usage 1

    int id;
    String name;
    int moneny;

    thisKeyword(int id, String name, int moneny) {
        this.id = id;
        this.name = name;
        this.moneny = moneny;
    }

    void display() {
        System.out.println("Usage 1:: Id  Name and Money " + id + " " + name + " " + moneny + " ");
    }

    // rule for this--- Its better approrch to use meaningful names for varibales. so we can use same name
    //  for instance variable and parameters in real time and always use this keyword.



    public static void main(String[] args) {
        thisKeyword t = new thisKeyword(10, "Suresh Pasam", 2000);
        t.display();

    }
}
/*
1. this keyword as reference variable that refer to the current object

Usage of the this Keyword:

1. this can be used to refer current class instance variable
2. this can be use to refer current class method [Implicitly]
3. this can be use to refer current class constructor
4. this can be passed an argument in the method call
5. this can be passed an argument in the constructor call
6.this can be used to return the current class instance from the method
 */