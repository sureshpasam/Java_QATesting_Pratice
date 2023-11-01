

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Object_Serialization {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
//C:\Users\Nisum\Desktop
		Object_Serialization ob = new Object_Serialization();
		Student_Cls stu = new Student_Cls();
		/*stu.setName("Suresh Pasam");
		stu.setAge(28);
		ob.writeJSON(stu);
		Student_Cls stu1 = new Student_Cls();
		 Student_Cls student1 = ob.readJSON();
		 System.out.println("Read JSON::"+student1);
		stu1.setName("lakshmi Pasam");
		stu1.setAge(22);
		ob.writeJSON(stu1);
		 Student_Cls student2 = ob.readJSON();
		 System.out.println("Read JSON::"+student2);*/
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> studentDataMap = new HashMap<String,Object>(); 
		int[] marks = {1,2,3};
		 Student_Cls student = new Student_Cls();
         student.setAge(28);
         student.setName("Rajesh");
         // JAVA Object
         studentDataMap.put("Student", student);
         // JAVA String
         studentDataMap.put("Name", "Mahesh ");   		
         // JAVA Boolean
         studentDataMap.put("Verified", Boolean.TRUE);
         // Array
         studentDataMap.put("Marks", marks);
         mapper.writeValue(new File("C:\\Users\\Nisum\\\\Desktop\\student.json"), studentDataMap);
         studentDataMap = mapper.readValue(new File("C:\\Users\\Nisum\\Desktop\\student.json"), Map.class);
         System.out.println("Student Data::"+studentDataMap.get("Student"));
         System.out.println("Name::"+studentDataMap.get("Name"));
         System.out.println("Verified:"+studentDataMap.get("Verified"));
         System.out.println("Marks:"+studentDataMap.get("Marks"));
	}
	
	
	@SuppressWarnings("unused")
	private void writeJSON(Student_Cls student) throws JsonGenerationException ,JsonMappingException,IOException{
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("C:\\Users\\Nisum\\Desktop\\student.json"), student);
	}
	@SuppressWarnings("unused")
	private Student_Cls readJSON()  throws JsonGenerationException ,JsonMappingException,IOException{
		ObjectMapper mapper = new ObjectMapper();
	      Student_Cls s = mapper.readValue(new File("C:\\Users\\Nisum\\Desktop\\student.json"), Student_Cls.class);
	      return s;
		
	}

}
