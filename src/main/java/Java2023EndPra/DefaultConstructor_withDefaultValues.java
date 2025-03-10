package Java2023EndPra;

public class DefaultConstructor_withDefaultValues {
    int id;
    String name;

    void display() {
        System.out.println("Id is:: " + id + " Name is ::" + name);
    }

    public static void main(String[] args) {
        DefaultConstructor_withDefaultValues d = new DefaultConstructor_withDefaultValues();
        DefaultConstructor_withDefaultValues d1 = new DefaultConstructor_withDefaultValues();
        d.display();
        d1.display();

    }
}

/*Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor.
Here 0 and null values are provided by default constructor.
*/