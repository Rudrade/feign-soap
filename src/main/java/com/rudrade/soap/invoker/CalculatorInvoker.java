package com.rudrade.soap.invoker;

import com.rudrade.soap.client.CalculatorClient;
import com.rudrade.soap.logger.RequestLogger;
import com.rudrade.soap.request.AddRequest;
import com.rudrade.soap.response.AddResponse;
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
                .withMarshallerSchemaLocation("http://www.dneonline.com http://www.dneonline.com/schema.xsd")
                .build();

        Feign.Builder oBuilder = Feign.builder()
                .encoder(new SOAPEncoder(oFactory))
                .decoder(new SOAPDecoder(oFactory))
                .logger(new RequestLogger())
                .logLevel(Logger.Level.FULL)
                .errorDecoder(new SOAPErrorDecoder());

        ivCalculatorClient = oBuilder.target(CalculatorClient.class, "http://www.dneonline.com");
    }

    public AddResponse addValues(int intA, int intB) {
        return ivCalculatorClient.calculateValues(new AddRequest(intA, intB));
    }

}
