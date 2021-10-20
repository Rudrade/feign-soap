package com.rudrade.soap.response;

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
@XmlRootElement(name = "SubtractResponse", namespace = DATA.NAMESPACE_TEMPURI)
@XmlAccessorType(XmlAccessType.FIELD)
public class SubtractResponse {

    @XmlElement(name = "SubtractResult", namespace = DATA.NAMESPACE_TEMPURI)
    private Integer result;

}
