package services.dom;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParser {

    private static final Logger LOGGER = LogManager.getLogger(DomParser.class);

    public static void airportsXML(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src/main/resources/airport.xml");
            document.getDocumentElement().normalize();
            Element root = document.getDocumentElement();
            LOGGER.log(Level.INFO, root);
            NodeList airportList = document.getElementsByTagName("airport");
            for (int i = 0; i < airportList.getLength(); i++) {
                Node node = airportList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element match = (Element) node;
                    String id = match.getAttribute("id");
                    NodeList tables = match.getChildNodes();
                    for (int j = 0; j < tables.getLength(); j++) {
                        Node n = tables.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;

                            LOGGER.info("Airport " + id + ":" +
                                    name.getTagName() + "=" + name.getTextContent());
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}