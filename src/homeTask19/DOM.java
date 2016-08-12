package homeTask19;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOM {
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("src/homeTask19/Test.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());
		NodeList nList = root.getChildNodes();
		int count = 0;
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i) instanceof Element) {
				count++;
				String xStr = new String();
				String yStr = new String();
				NodeList nListTwo = nList.item(i).getChildNodes();
				for (int j = 0; j < nListTwo.getLength(); j++) {
					if (nListTwo.item(j).getNodeName().equals("x")) {
						xStr = xStr.concat(nListTwo.item(j).getFirstChild().getNodeValue());
					} else if (nListTwo.item(j).getNodeName().equals("y")) {
						yStr = yStr.concat(nListTwo.item(j).getFirstChild().getNodeValue());
					} else if (nListTwo.item(j).getNodeName().equals("unit")) {
						xStr = xStr.concat(nListTwo.item(j).getFirstChild().getNodeValue());
						yStr = yStr.concat(nListTwo.item(j).getFirstChild().getNodeValue());
					}
				}
				System.out.println(nList.item(i).getNodeName() + " " + count + ": " + xStr + ", " + yStr);
			}
		}
	}
}
