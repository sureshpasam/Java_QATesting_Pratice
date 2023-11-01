

import java.util.ArrayList;

public class MissingNumber_Constants_Vowels {

	public static void main(String[] args) {
		
		 String line = "This website is aw3som3.";
	        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

	        line = line.toLowerCase();
	        for(int i = 0; i < line.length(); ++i)
	        {
	            char ch = line.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u') {
	                ++vowels;
	            }
	            else if((ch >= 'a'&& ch <= 'z')) {
	                ++consonants;
	            }
	            else if( ch >= '0' && ch <= '9')
	            {
	                ++digits;
	            }
	            else if (ch ==' ')
	            {
	                ++spaces;
	            }
	        }

     int vo=0,con=0;
		ArrayList<String> al = new ArrayList<>();
		al.add("suresh");
		al.add("mm");
		
		
		for(int i =0; i<al.size();i++) {
			String ss = al.get(i).toLowerCase();
			for(int j=0;j<ss.length();j++) {
				char s = ss.charAt(j);
				if (s=='a' ||s=='e' || s=='i'||s=='o'||s=='u') {
					vo++;
				}else {
					con++;
				}
			}
			
		}
		
		System.out.println("sdsad"+vo+"cons"+con);
	        
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        System.out.println("Digits: " + digits);
	        System.out.println("White spaces: " + spaces);
	        
	        int a[] = {1,2,4,5}; 
	        int miss = getMissingNo(a,a.length); 
	        System.out.println("misssing number "+miss);  
		
	}
	
	static int getMissingNo (int a[], int n) 
    { 
        int i, total; 
        total  = (n+1)*(n+2)/2;    
        for ( i = 0; i< n; i++) 
           total -= a[i]; 
        return total; 
    } 
       
    /* program to test above function */
   
	  
}
