package org.example.jaxb.esia;

import lombok.*;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {
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

public class ESIAFindAccountRequest {
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

