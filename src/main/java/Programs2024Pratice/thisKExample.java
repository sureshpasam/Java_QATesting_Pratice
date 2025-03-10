package Programs2024Pratice;

public class thisKExample {
    private int no;
    String name, course;
    float fee;

    thisKExample(int no, String name, String course) {
        this.no = no;
        this.name = name;
        this.course = course;
    }

    thisKExample(int no, String name, String course, float fee) {
        this(no, name, course);// reusing the constructor
        // Rule: Call to this() must be the first statement in constructor
        this.fee = fee;
    }

    void display() {
        System.out.println("Num:: " + no + "Name:: " + name + "Course:: " + course + "Fee:: " + fee);
    }

    public static void main(String[] args) {
        thisKExample t = new thisKExample(111, "Suresh pasam", "MCA");
        thisKExample tt = new thisKExample(111, "Suresh pasam", "MCA", 2000);
        t.display();
        tt.display();
    }
}
