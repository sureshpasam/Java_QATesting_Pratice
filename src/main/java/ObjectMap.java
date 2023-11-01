
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.*;

public class ObjectMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
		//map json to student
		ObjectMapper mapper = new ObjectMapper();
	      try{
	         Student_Cls student = mapper.readValue(jsonString, Student_Cls.class);
	         
	         System.out.println("JSON values::"+student);
	         
	         jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
	         
	         System.out.println("JSON format::"+jsonString);
	      }
	      catch (JsonParseException e) { e.printStackTrace();}
	      catch (JsonMappingException e) { e.printStackTrace(); }
	      catch (IOException e) { e.printStackTrace(); }
	   }
		
	}


