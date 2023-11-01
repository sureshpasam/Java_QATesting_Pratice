

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;


public class ReadXMLFILE {

	public static void main(String[] args) {
		 String filePath = "C:\\Users\\Nisum\\Desktop\\employee.xml";
	        File xmlFile = new File(filePath);
	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder;
	        try {
	            dBuilder = dbFactory.newDocumentBuilder();
	            Document doc = dBuilder.parse(xmlFile);
	            doc.getDocumentElement().normalize();
	            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	            NodeList nodeList = doc.getElementsByTagName("Employee");
	            //now XML is loaded as Document in memory, lets convert it to Object List
	            List<Employee> empList = new ArrayList<Employee>();
	            for (int i = 0; i < nodeList.getLength(); i++) {
	                empList.add(getEmployee(nodeList.item(i)));
	            }
	            //lets print Employee list information
	            for (Employee emp : empList) {
	                System.out.println(emp.toString());
	            }
	        } catch (Exception e) {
	            System.out.println("Exception is::"+e.getMessage());
	        }

	}
	    private static Employee getEmployee(Node node) {
	        //XMLReaderDOM domReader = new XMLReaderDOM();
	        Employee emp = new Employee();
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	            Element element = (Element) node;
	            emp.setName(getTagValue("name", element));
	            emp.setAge(Integer.parseInt(getTagValue("age", element)));
	            emp.setGender(getTagValue("gender", element));
	            emp.setRole(getTagValue("role", element));
	        }

	        return emp;
	    }


	    private static String getTagValue(String tag, Element element) {
	        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
	        Node node = (Node) nodeList.item(0);
	        return node.getNodeValue();
	    }
	
	}


