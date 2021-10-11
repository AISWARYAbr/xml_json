package xmlparserjson;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws ParserConfigurationException,SAXException, IOException
    {
     
        try {
        	
        	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        	DocumentBuilder builder=factory.newDocumentBuilder();
        	Document doc=builder.parse("C:\\Users\\aiswa\\eclipse-workspace\\XML_parser_json\\src\\main\\java\\xmlparserjson\\xmlfile.xml");
        	System.out.println(doc.getDocumentElement().getNodeName());
        	NodeList list=doc.getElementsByTagName("departments");
        	for(int i=0; i<=list.getLength(); i++) {
        		Node n=list.item(i);
        		//System.out.println(n.getNodeName());
        		Element e=(Element)n;
        		System.out.println("Employees : " +e.getElementsByTagName("department1").item(i).getTextContent());
        	
        		NodeList nList = doc.getElementsByTagName("department1");
        	    System.out.println("----------------------------");
        		double sum = 0.0;
        		/*for (int temp = 0; temp <nList.getLength(); temp++) 
        		    {
        		    Node nNode =nList.item(temp);

        		    if (nNode.getNodeType() == Node.ELEMENT_NODE) 
        		            { 
        		        Element eElement = (Element) nNode;

        		        System.out.println("employee salary: " +eElement.getElementsByTagName("salary").item(0).getTextContent());

        		        System.out.println("Salary: " +eElement.getElementsByTagName("salary").item(0).getTextContent());
        		        sum += Double.parseDouble(eElement.getElementsByTagName("salary").item(0).getTextContent());
        		            }
        		    }*/
        		System.out.println("Total: " + sum);
        	}
        		
        		/*for(int j=0; j<list.getLength(); j++) {
            		Node m=list.item(j);
            		System.out.println(m.getNodeName());
            		Element s=(Element)m;
            		}*/
        	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        	
    }  	
}        
    

