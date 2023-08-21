package entyties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "doc")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Document {
    String type;
    String series;
    String number;
    String issueDate;
    String expiryDate;
    String issuedBy;
}
