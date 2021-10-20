package com.rudrade.soap.client;

import com.rudrade.soap.request.AddRequest;
import com.rudrade.soap.response.AddResponse;
import feign.Headers;
import feign.RequestLine;

@Headers({ "Content-Type: text/xml;charset=UTF-8" })
public interface CalculatorClient {

    @RequestLine("POST /calculator.asmx")
    AddResponse calculateValues(AddRequest request);

}
