

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput_Stream {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream FIS = new FileInputStream("C:\\Users\\Nisum\\Desktop\\student.json");
		
		//int i = FIS.read();
		int i = 0;
		while((i=FIS.read())!=-1)
		{
			System.out.print((char)i);
		}
		FIS.close();
		
		
	}

	

}
