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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "MultiplyResponse", namespace = DATA.NAMESPACE_TEMPURI)
@XmlAccessorType(XmlAccessType.FIELD)
public class MultiplyResponse {

    @XmlElement(name = "MultiplyResult", namespace = DATA.NAMESPACE_TEMPURI)
    private int result;

}
