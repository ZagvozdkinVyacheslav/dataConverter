package converterPackage;

import entyties.EsiaFindAccRequest;
import lombok.NoArgsConstructor;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

@NoArgsConstructor
public class Converter {

    public void xmlToJsonFiles(String xmlPath, String jsonPath){

    }
    public static EsiaFindAccRequest xmlToPojo(String xmlPath) throws IOException, SAXException, ParserConfigurationException, JAXBException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File( xmlPath));

        JAXBContext jaxbContext 	= JAXBContext.newInstance( EsiaFindAccRequest.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        EsiaFindAccRequest request = (EsiaFindAccRequest) jaxbUnmarshaller.unmarshal(document);
        return request;
    }
}
