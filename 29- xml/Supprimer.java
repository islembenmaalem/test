package question3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Supprimer {

	public static final String xmlFilePath = "xmlfile.xml";

	public static void main(String argv[]) {

		try {
			File inputFile = new File(xmlFilePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(inputFile);
			NodeList nodeList = document.getDocumentElement().getChildNodes(); 
	        NodeList company = document.getElementsByTagName("employee");

			for (int i = 0; i < company.getLength(); i++) {
				Node employe = company.item(i);
				NamedNodeMap attr = employe.getAttributes(); 
				Node node = attr.getNamedItem("id");
				if (node.getTextContent().equals("2"))
					employe.getParentNode().removeChild(employe);

}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}