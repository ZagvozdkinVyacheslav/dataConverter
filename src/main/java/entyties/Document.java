package entyties;

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
@XmlType(name = "", propOrder = {
        "type",
        "series",
        "number",
        "issueDate",
        "expiryDate",
        "issuedBy"
})
public class Document {
    @XmlElement(name = "type")
    String type;
    @XmlElement(name = "series")
    String series;
    @XmlElement(name = "number")
    String number;
    @XmlElement(name = "issueDate")
    String issueDate;
    @XmlElement(name = "expiryDate")
    String expiryDate;
    @XmlElement(name = "issuedBy")
    String issuedBy;

    void beforeUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("Before Unmarshaller Callback");
    }

    void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("After Unmarshaller Callback");
    }
}
