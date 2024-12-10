package Programs2024Pratice;

public class MR_Bike extends MOverriding_Vehicle{
    // Defining the same method in the parent class
    void run(){
        System.out.println("Bike running safely");
    }

    public static void main(String[] args){
        MR_Bike b = new MR_Bike();
        b.run();
    }
}

/*

 */
