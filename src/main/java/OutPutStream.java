
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Nisum\\Desktop\\student.json");
		String s = "Welcome to India suresh";
		byte[] a = s.getBytes();
		fs.write(a);
		fs.close();
		System.out.println("Sucess");

	}

}
