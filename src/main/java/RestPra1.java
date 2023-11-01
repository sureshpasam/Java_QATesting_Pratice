
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
public class RestPra1 {

	public static void main(String args[]) throws IOException {


		File file = new File("C:\\Users\\Nisum\\Desktop\\canvas.json");
		StringBuilder sb = new StringBuilder();
		try (InputStream is = Files.newInputStream(file.toPath(), StandardOpenOption.READ)) {
			InputStreamReader reader = new InputStreamReader(is);
			BufferedReader lineReader = new BufferedReader(reader);
			String line;
			while ((line = lineReader.readLine()) != null) {
				sb.append(line).append("\n");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		@SuppressWarnings("unused")
		ObjectMapper mapper = new ObjectMapper();
		String jsonTxt = sb.toString();
		JSONObject jsob = new JSONObject(jsonTxt);
		JSONObject meta =(JSONObject) jsob.get("meta");
		/*JsonNode node = mapper.readTree(jsonTxt);
		JsonNode me = node.path("context");
		 Iterator<JsonNode> it = me.elements();
		System.out.print("Suresh Pasam: [ ");

        while (it.hasNext()) {
           JsonNode mar = it.next();
           System.out.print(mar.asText() + " "); 
        }

        System.out.println("]");*/
		for (Iterator<?> iterator = meta.keys(); iterator.hasNext();) {
			String key = (String) iterator.next();
			//Boolean dd = meta.get(key).equals("properties");
			/*JsonFactory jf = new JsonFactory();
			JsonParser jp = jf.createJsonParser(new File("C:\\Users\\Nisum\\Desktop\\canvas.json"));
		while(jp.nextToken()!=JsonToken.END_OBJECT) {
		String ss = jp.getCurrentName();
		if(ss.equals("meta")) {
			jp.nextToken();
			System.out.println("dsahfjkdsfsdhfds"+jp.getText());
		}
		}*/
			if(key.equals("properties")) {
				JSONObject pro = (JSONObject)meta.get("properties");
				for (Iterator<?> iterator_pro = pro.keys(); iterator_pro.hasNext();) {
					String pro_keys = (String) iterator_pro.next();
					Object pro_values = pro.get(pro_keys );
					System.out.println("Properties Key:::  "+pro_keys+  "     Properties Value is ::  "+pro_values);
				}}else if(key.equals("context")) {
					JSONObject pro = (JSONObject)meta.get("context");
					for (Iterator<?> iterator_context = pro.keys(); iterator_context.hasNext();) {
						String context_keys = (String) iterator_context.next();
						Object context_values = pro.get(context_keys);
						System.out.println("Context Key:::  "+context_keys+  "     Context Value is ::  "+context_values);

					}
				
				}}
		/*JSONObject pro = (JSONObject)meta.get("properties");
		  for (Iterator<?> iterator = pro.keys(); iterator.hasNext();) {
		    String key = (String) iterator.next();
		    Object value = pro.get(key);
		    System.out.println("Key:::  "+key+  "     Value is ::  "+value);*/
		/*if (value instanceof String) {
		      result.put(key, (String) value);
		    }*/
		/*Set <String> sss = meta.keySet();
		Set <String> ssss= jsob.keySet();
		for(String f : ssss) {
			System.out.println("ALL keys::"+f);*/
		
		
	}
}









