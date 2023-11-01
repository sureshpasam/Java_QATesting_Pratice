
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BuffereInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream is = new BufferedInputStream(new FileInputStream("C:\\Users\\Nisum\\Desktop\\student.json"));
		int i = 0;
		while((i=is.read())!=-1) {
			System.out.print((char)i);			
		}
		

	}

}
