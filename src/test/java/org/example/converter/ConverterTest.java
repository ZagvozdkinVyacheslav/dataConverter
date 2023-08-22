package org.example.converter;

import org.example.jaxb.esia.ESIAFindAccountRequest;
import org.example.jaxb.esia.ESIAFindAccountResponse;
import org.junit.jupiter.api.Assertions;
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
        System.out.println(pojo.getFirstName());
        Assertions.assertEquals("Никита",pojo.getFirstName());
    }

    /*@Test
    void pojoToJson() throws IOException, JAXBException {
        Converter<ESIAFindAccountResponse> converter = new Converter<>();
        var pojo = Converter.xmlToPojo("src/main/resources/esia_xml/response.xml", ESIAFindAccountResponse.class);
       converter.pojoToJson(pojo, "src/main/resources/json_files/test_response.json");
        StringBuilder sb = new StringBuilder();
        try(FileReader reader = new FileReader("src/main/resources/json_files/test_response.json");) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null){
                sb.append(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //по идее идентичны, но нет
        Assertions.assertEquals("{\"accounts\":[],\"errorStatusInfos\":[{\"code\":\"ESIA-020002\",\"message\":\"Пользователь не найден\"}]}",sb);
    }*/


}