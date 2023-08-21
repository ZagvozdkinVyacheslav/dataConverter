package entyties;

import lombok.*;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",namespace = "src/main/resources/esia_xsd",propOrder = {
        "RoutingCode",
        "SnilsOperator",
        "ra",
        "lastName",
        "firstName",
        "doc",
        "email",
        "mobile",
        "snils"
})
@XmlRootElement(name = "ESIAFindAccountRequest")

public class EsiaFindAccRequest {
    private String RoutingCode;
    private String SnilsOperator;
    private Integer ra;
    private String lastName;
    private String firstName;
    private Document doc;
    private String email;
    private String mobile;
    private String snils;

}
