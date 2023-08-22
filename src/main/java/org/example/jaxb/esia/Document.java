package org.example.jaxb.esia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {
        "type",
        "series",
        "number",
        "issueDate",
        "expiryDate",
        "issuedBy"
})
@XmlRootElement(name = "doc")
public class Document {
    String type;
    String series;
    String number;
    String issueDate;
    String expiryDate;
    String issuedBy;

    void beforeUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("Before Unmarshaller Callback");
    }

    void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("After Unmarshaller Callback");
    }
}