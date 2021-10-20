package com.rudrade.soap;

import com.rudrade.soap.invoker.CalculatorInvoker;
import com.rudrade.soap.response.AddResponse;
import com.rudrade.soap.response.DivideResponse;
import com.rudrade.soap.response.MultiplyResponse;
import com.rudrade.soap.response.SubtractResponse;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorInvokerTest {

    private static final CalculatorInvoker invoker;
    static {
        invoker = new CalculatorInvoker();
    }

    @Test
    public void addTest() {
        AddResponse oResponse = invoker.add(1, 3);
        Assert.assertEquals(4, oResponse.getResult().intValue());
    }

    @Test
    public void subtractTest() {
        SubtractResponse oResponse = invoker.subtract(1, 3);
        Assert.assertEquals(-2, oResponse.getResult().intValue());
    }

    @Test
    public void multiplyTest() {
        MultiplyResponse oResponse = invoker.multiply(2, 3);
        Assert.assertEquals(6, oResponse.getResult());
    }

    @Test
    public void divideTest() {
        DivideResponse oResponse = invoker.divide(4, 2);
        Assert.assertEquals(2, oResponse.getResult());
    }

}
