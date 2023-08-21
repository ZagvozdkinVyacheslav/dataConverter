package converterPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import entyties.EsiaFindAccRequest;
import lombok.NoArgsConstructor;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

@NoArgsConstructor
public class Converter {

    public void xmlToJsonFiles(String xmlPath, String jsonPath){

    }
    public static EsiaFindAccRequest xmlToPojo(String xmlPath){
        File xmlFile = new File(xmlPath);
        try {
            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(EsiaFindAccRequest.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            EsiaFindAccRequest request = (EsiaFindAccRequest) jaxbUnmarshaller.unmarshal(xmlFile);
            return request;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    public static void pojoToJson(EsiaFindAccRequest obj, String jsonPath){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(jsonPath), obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
