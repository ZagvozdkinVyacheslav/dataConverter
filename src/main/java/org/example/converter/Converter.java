package org.example.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.jaxb.esia.ESIAFindAccountRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class Converter {

    private Converter() {
    }

    public static <T> T xmlToPojo(String xmlPath, Class<T> classType) throws IOException, JAXBException {

        String xmlString = Files.readString(Paths.get(xmlPath), StandardCharsets.UTF_8);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(classType);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new StreamSource(new StringReader(xmlString)), classType).getValue();
        } catch (UnmarshalException ex) {
            log.error(ex.getMessage());
            throw new IllegalArgumentException("Could not unmarshall xml string");
        }
    }

    public static void pojoToJson(ESIAFindAccountRequest obj, String jsonPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(jsonPath), obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
