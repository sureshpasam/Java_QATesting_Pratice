package Epam_ProgramPratice;

public class epam1 {
    public static void main(String args[]){
        String s1 ="Suresh Pasam";
        String s2 ="Suresh Pasam";
        if(s1==s2){
            System.out.println("first set of strings");
        }

        String s3 = new String("Pasam Suresh");
        String s4 = new String("Pasam Suresh");

        if(s3==s4){
            System.out.println("second set of strings");
        }
    }
}
