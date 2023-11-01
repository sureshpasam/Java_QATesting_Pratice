
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedOutputStream BOS = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Nisum\\Desktop\\student.json"));
		String s ="Welcome to India Suresh and I love u India";
		byte[] b =s.getBytes();
		BOS.write(b);
		BOS.flush();
		BOS.close();
		System.out.println("Success");
	}

}
