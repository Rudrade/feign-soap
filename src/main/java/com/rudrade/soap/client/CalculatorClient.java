package com.rudrade.soap.client;

import com.rudrade.soap.request.AddRequest;
import com.rudrade.soap.request.DivideRequest;
import com.rudrade.soap.request.MultiplyRequest;
import com.rudrade.soap.request.SubtractRequest;
import com.rudrade.soap.response.AddResponse;
import com.rudrade.soap.response.DivideResponse;
import com.rudrade.soap.response.MultiplyResponse;
import com.rudrade.soap.response.SubtractResponse;
import feign.Headers;
import feign.RequestLine;

@Headers({ "Content-Type: text/xml;charset=UTF-8" })
public interface CalculatorClient {

    @RequestLine("POST /calculator.asmx")
    AddResponse add(AddRequest request);

    @RequestLine("POST /calculator.asmx")
    SubtractResponse subtract(SubtractRequest request);

    @RequestLine("POST /calculator.asmx")
    MultiplyResponse multiply(MultiplyRequest request);

    @RequestLine("POST /calculator.asmx")
    DivideResponse divide(DivideRequest request);

}
