package question3;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class Modifier {

		public static final String xmlFilePath = "xmlfile.xml";
	
		public static void main(String argv[]) {
	
			try {
				File inputFile = new File(xmlFilePath);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document document = dBuilder.parse(inputFile);
				NodeList nodeList = document.getDocumentElement().getChildNodes(); 
	
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node employe = nodeList.item(i);
					for (int j =0 ; j<((NodeList) employe).getLength();j++) {
						Node node=((NodeList) employe).item(j);
						if ("salaire".equals(node.getNodeName())) {
	                        node.setTextContent("3000");
					}
				}}
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(document);
				StreamResult result = new StreamResult(new File(xmlFilePath));
				transformer.transform(source, result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


