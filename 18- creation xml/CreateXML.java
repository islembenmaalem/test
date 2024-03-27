import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class CreateXML {
	    public static final String xmlFilePath = "xmlquestion.xml";
	    public static void main(String argv[]) {
	   
	    try {

	    DocumentBuilderFactory documentFactory =
	    DocumentBuilderFactory.newInstance();
	   
	    DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
	   
	    Document document = documentBuilder.newDocument();
	    // root element
	    Element root = document.createElement("Questions");
	    document.appendChild(root);
	    List<Question> listemp = new ArrayList<>();
	    listemp.add(new Question("q1", "r1"));
	    listemp.add(new Question("q2", "r1"));
	    listemp.add(new Question("q3", "r3"));
	    listemp.add(new Question("q4", "r4"));
	    for (int i = 0; i < 4; i++) {
	        
	    
	    // employee element
	    Element question = document.createElement("question");
	   
	    root.appendChild(question);
	   
	    // set an attribute to staff element
	    Attr attr = document.createAttribute("id");
	    attr.setValue(listemp.get(i).getId());
	    question.setAttributeNode(attr);
	   
	    //you can also use staff.setAttribute("id", "1") for this
	   
	    // quest element
	    Element quest = document.createElement("quest");
	    quest.appendChild(document.createTextNode(listemp.get(i).getQuestion()));
	    question.appendChild(quest);
	   
	    // reponse element
	    Element reponse = document.createElement("reponse"); 
	    reponse.appendChild(document.createTextNode(listemp.get(i).getReponse()));
	    question.appendChild(reponse);
	    }

	 // create the xml file
	 //transform the DOM Object to an XML File
	 TransformerFactory transformerFactory = TransformerFactory.newInstance();
	 Transformer transformer = transformerFactory.newTransformer();
	 DOMSource domSource = new DOMSource(document);
	 StreamResult streamResult = new StreamResult(new File(xmlFilePath));

	 // If you use
	 // StreamResult result = new StreamResult(System.out);
	 // the output will be pushed to the standard output ...
	 // You can use that for debugging

	 transformer.transform(domSource, streamResult);

	 System.out.println("Done creating XML File");

	 } catch (ParserConfigurationException pce) {
	 pce.printStackTrace();
	 } catch (TransformerException tfe) {
	 tfe.printStackTrace();
	 }
	}
	}
