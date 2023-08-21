package entyties;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "ESIAFindAccountRequest")
@XmlAccessorType(XmlAccessType.PROPERTY)
@ToString
public class EsiaFindAccRequest {
    private String routingCode;
    private String snilsOperator;
    private Integer ra;
    private String lastName;
    private String firstName;
    private Document doc;
    private String email;
    private String mobile;
    private String snils;
}
