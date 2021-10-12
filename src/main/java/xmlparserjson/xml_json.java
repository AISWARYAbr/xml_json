package xmlparserjson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintStream;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml_json {
	public static void main(String[] args)throws ParserConfigurationException,SAXException, IOException {

		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();

		HashMap<String,Integer> data = new HashMap<>();


		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder=factory.newDocumentBuilder();
    	Document doc=builder.parse("xmlfile.xml");
    	
    	NodeList list=doc.getElementsByTagName("department");

		for (int i = 0; i<list.getLength(); i++){
			int sum = 0;
			Element element = (Element) list.item(i);

			NodeList employeeData = element.getElementsByTagName("employee");

			for (int j=0; j<employeeData.getLength(); j++){

				Element empData = (Element) employeeData.item(j);
			    //System.out.println("Name : "+empData.getElementsByTagName("name").item(0).getTextContent());
				//System.out.println("Salary : "+empData.getElementsByTagName("salary").item(0).getTextContent());

				sum = sum+Integer.parseInt(empData.getElementsByTagName("salary").item(0).getTextContent());
				data.put("department"+(i),sum);
			}
		}

		
		PrintStream o= new PrintStream(new File("test1.json"));
        PrintStream console = System.out;
        System.setOut(o);
        
        System.out.println(gson.toJson(data));
        
        System.setOut(console);
        
	}

}