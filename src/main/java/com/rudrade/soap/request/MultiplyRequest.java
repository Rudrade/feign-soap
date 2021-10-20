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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "Multiply", namespace = DATA.NAMESPACE_TEMPURI)
@XmlAccessorType(XmlAccessType.FIELD)
public class MultiplyRequest {

    @XmlElement(name = "intA", namespace = DATA.NAMESPACE_TEMPURI)
    private int intA;

    @XmlElement(name = "intB", namespace = DATA.NAMESPACE_TEMPURI)
    private int intB;

}
