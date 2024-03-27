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

public class Find {
	private String question, reponse;

	public Find() {
	};

	public String find_reponse(String q) {
		String rep = null;
		final String xmlFilePath = "xmlquestion.xml";
		try {
			File inputFile = new File(xmlFilePath);// Create DocumentBuilderFactory object.
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(inputFile);
			NodeList nodeList = document.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node question = nodeList.item(i);
				for (int j = 0; j < ((NodeList) question).getLength(); j++) {
					Node node = ((NodeList) question).item(j);
					if (q.equals(node.getTextContent())) {
						node = ((NodeList) question).item(j + 1);
						rep = node.getTextContent();
					}
				}
			}
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File(xmlFilePath));
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rep;
	}
    public static void main(String argv[]) {
    	Find f=new Find();
    	String s=f.find_reponse("q1");
    	System.out.println(s);
    }
}
