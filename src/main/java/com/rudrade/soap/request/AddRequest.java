package com.rudrade.soap.request;

import com.rudrade.soap.util.DATA;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Add", namespace = DATA.NAMESPACE_TEMPURI)
@XmlAccessorType(XmlAccessType.FIELD)
public class AddRequest {

    @XmlElement(name = "intA", namespace = DATA.NAMESPACE_TEMPURI)
    private Integer intA;

    @XmlElement(name = "intB", namespace = DATA.NAMESPACE_TEMPURI)
    private Integer intB;

}
