package JavaProgramsAll_latest_Java8Above;

public final class ImmutableClassInJava {
    final String panNumber;

    public ImmutableClassInJava(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public static void main(String[] args) {
        ImmutableClassInJava i = new ImmutableClassInJava("CUTPP5623B");
        System.out.println("Pannumber is::" + i.getPanNumber());
        // String Equals Method Example1
        String S1 = "Suresh";
        String S2 = "Suresh";
        String S3 = "Pasam";
        String S4 = "SURESH";
        System.out.println("S1 and S2 equals method is::" + S1.equals(S2));//tRUE
        System.out.println("S1 and S3 equals method is::" + S1.equals(S3));//false
        System.out.println("S1 and S4 equals method is::" + S1.equals(S4));//false
        System.out.println("S1 and S4 equals method is::" + S1.equalsIgnoreCase(S4));//false

        // String == Method Example
        String s1 = "ravi";
        String s2 = "ravi";
        String S5 = new String("Suresh");
        System.out.println("S1 and S2 == method is::" + s1 == s2);//True because both refer to same instance)
        System.out.println("S1 and S5 == method is::" + s1 == S5); //false::because s5 refers to instance created in nonpool)

/*  String compare by compareTo() method
//The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than,
// equal to or greater than second string.
//
//Suppose s1 and s2 are two string variables. If:
//
//s1 == s2 :0
//s1 > s2   :positive value
//s1 < s2   :negative value */
        String S6 = "Sure";
        String S7 = "SureshPasam";
        System.out.println("S1 and S2 equals method is::" + S1.compareTo(S2));//Return postive value 0
        System.out.println("S1 and S6 equals method is::" + S1.compareTo(S6));// S1 is grater then S6 return postive value
        System.out.println("S1 and S7 equals method is::" + S1.compareTo(S7));//S7  is grather than S1 return negative value

    }
}