package question3;

import java.io.File;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CreateXMLFileJava {
	public static final String xmlFilePath = "xmlfile.xml";
	 public static void main(String argv[]) {
	Employe[] e=new Employe[4];
	e[0]=new Employe("1","Amin","Trigui",30,2500.0F);
	e[1]=new Employe("2","Salah","Chaari",22,1500.0F);
	e[2]=new Employe("3","Amir","be Fraj",24,2000.0F);
	e[3]=new Employe("4","Ahmed","Frikha",25,2250.0F);

	 try {

	 DocumentBuilderFactory documentFactory =
	 DocumentBuilderFactory.newInstance();

	 DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

	 Document document = documentBuilder.newDocument();

	 // root element
	 Element root = document.createElement("company");
	 document.appendChild(root);
     for(int i =0;i<4;i++) {
	 // employee element
	 Element employee = document.createElement("employee");

	 root.appendChild(employee);

	 // set an attribute to staff element
	 Attr attr = document.createAttribute("id");
	 attr.setValue(e[i].getId());
	 employee.setAttributeNode(attr);

	 //you can also use staff.setAttribute("id", "1") for this

	 // firstname element
	 Element firstName = document.createElement("firstname");
	 firstName.appendChild(document.createTextNode(e[i].getFirstname()));
	 employee.appendChild(firstName);

	 // lastname element
	 Element lastname = document.createElement("lastname"); 
	 lastname.appendChild(document.createTextNode(e[i].getLastname()));
	 employee.appendChild(lastname);

	 // email element
	 Element age = document.createElement("age");
	 age.appendChild(document.createTextNode(e[i].getAge()));
	 employee.appendChild(age);

	 // department elements
	 Element salaire = document.createElement("salaire");
	 salaire.appendChild(document.createTextNode(e[i].getSalaire()));
	 employee.appendChild(salaire);
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
	 NodeList nodeList = document.getDocumentElement().getChildNodes();
     NodeList company = document.getElementsByTagName("employee");

	 //récupérer le nœud employee numéro i
	 for (int i =0;i<4;i++) {
	 Node employee = company.item(i);
	 if (employee.getNodeName().equals("salaire"))
	 employee.setTextContent("3000") ; }
	 System.out.println("Done creating XML File");
	 } catch (ParserConfigurationException pce) {
	 pce.printStackTrace();
	 } catch (TransformerException tfe) {
	 tfe.printStackTrace();
	 }
	//récupérer tous les nœuds sous la racine

	 } 
	 } 

	 

 
	 

 