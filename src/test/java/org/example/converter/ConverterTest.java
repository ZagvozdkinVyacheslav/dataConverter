package org.example.converter;

import org.example.jaxb.esia.ESIAFindAccountRequest;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;
import java.io.IOException;

class ConverterTest {

    @Test
    void xmlToJsonFiles() {
    }

    @Test
    void xmlToPojo() throws IOException, JAXBException {
        var pojo = Converter.xmlToPojo("src/main/resources/esia_xml/request.xml", ESIAFindAccountRequest.class);
        System.out.println(pojo.toString());

    }

    /*@Test
    void pojoToJson() throws IOException, JAXBException {
        var pojo = Converter.xmlToPojo("src/main/resources/esia_xml/request.xml", ESIAFindAccountRequest.class);
        Converter.pojoToJson(pojo, "src/main/resources/json_files_directory/request.json");
    }*/
}