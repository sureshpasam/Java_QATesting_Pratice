

public class StringRotationAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sureshpasam";                 
        String s2 = "pasamsuresh";
 
        //Step 1
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
            //Step 2
 
            String s3 = s1 + s1;
 
            //Step 3
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }

	}

}
