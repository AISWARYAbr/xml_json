package xmlparserjson;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xml_json {

	public static void main(String[] args)throws ParserConfigurationException,SAXException, IOException {
		System.out.println("output");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder=factory.newDocumentBuilder();
    	Document doc=builder.parse("C:\\Users\\aiswa\\eclipse-workspace\\XML_parser_json\\src\\main\\java\\xmlparserjson\\xmlfile.xml");
    	System.out.println(doc.getDocumentElement().getNodeName());
    	NodeList list=doc.getElementsByTagName("department1");
    	Node n=list.item(0);
    	//System.out.println(n.getTextContent());

	}

}
