package com.rudrade.soap.invoker;

import com.rudrade.soap.client.CalculatorClient;
import com.rudrade.soap.logger.RequestLogger;
import com.rudrade.soap.request.AddRequest;
import com.rudrade.soap.request.DivideRequest;
import com.rudrade.soap.request.MultiplyRequest;
import com.rudrade.soap.request.SubtractRequest;
import com.rudrade.soap.response.AddResponse;
import com.rudrade.soap.response.DivideResponse;
import com.rudrade.soap.response.MultiplyResponse;
import com.rudrade.soap.response.SubtractResponse;
import feign.Feign;
import feign.Logger;
import feign.jaxb.JAXBContextFactory;
import feign.soap.SOAPDecoder;
import feign.soap.SOAPEncoder;
import feign.soap.SOAPErrorDecoder;

public class CalculatorInvoker {

    private final CalculatorClient ivCalculatorClient;

    public CalculatorInvoker() {
        JAXBContextFactory oFactory = new JAXBContextFactory.Builder()
                .withMarshallerJAXBEncoding("UTF-8")
                .withMarshallerSchemaLocation("http://www.dneonline.com/schema.xsd")
                .build();

        Feign.Builder oBuilder = Feign.builder()
                .encoder(new SOAPEncoder(oFactory))
                .decoder(new SOAPDecoder(oFactory))
                .logger(new RequestLogger())
                .logLevel(Logger.Level.FULL)
                .errorDecoder(new SOAPErrorDecoder());

        ivCalculatorClient = oBuilder.target(CalculatorClient.class, "http://www.dneonline.com");
    }

    public AddResponse add(int intA, int intB) {
        return ivCalculatorClient.add(new AddRequest(intA, intB));
    }

    public SubtractResponse subtract(int intA, int intB) {
        return ivCalculatorClient.subtract(new SubtractRequest(intA, intB));
    }

    public MultiplyResponse multiply(int intA, int intB) {
        return ivCalculatorClient.multiply(new MultiplyRequest(intA, intB));
    }

    public DivideResponse divide(int intA, int intB) {
        return ivCalculatorClient.divide(new DivideRequest(intA, intB));
    }

}
