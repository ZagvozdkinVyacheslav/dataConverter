package converterPackage;

import entyties.EsiaFindAccRequest;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void xmlToJsonFiles() {
    }

    @Test
    void xmlToPojo() {
        EsiaFindAccRequest pojo =  Converter.xmlToPojo("src/main/resources/esia_xml/request.xml");
        System.out.println(pojo.toString());

    }

    @Test
    void pojoToJson() {
        EsiaFindAccRequest pojo =  Converter.xmlToPojo("src/main/resources/esia_xml/request.xml");
        Converter.pojoToJson(pojo,"src/main/resources/json_files_directory/request.json");
    }
}