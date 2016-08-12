package homeTask19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAX {
	public static void main(String args[]) {

		boolean x = false;
		boolean y = false;
		boolean unit = false;
		int count = 0;

		String xStr = new String();
		String yStr = new String();
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/homeTask19/Test.xml"));

			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("pointList")) {
						System.out.println("pointList");
					} else if (reader.getLocalName().equals("point")) {
						count++;
					} else if (reader.getLocalName().equals("x")) {
						x = true;
					} else if (reader.getLocalName().equals("y")) {
						y = true;
					} else if (reader.getLocalName().equals("unit")) {
						unit = true;
					}
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (x) {
						xStr = xStr.concat(reader.getText());
						x = false;
					} else if (y) {

						yStr = yStr.concat(reader.getText());
						y = false;
					} else if (unit) {
						xStr = xStr.concat(reader.getText());
						yStr = yStr.concat(reader.getText());
						unit = false;
					}
				} else if (res == XMLStreamConstants.END_ELEMENT) {
					if (reader.getLocalName().equals("point")) {
						System.out.println("point " + count + ": " + xStr + ", " + yStr);
						xStr = "";
						yStr = "";
					}
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
