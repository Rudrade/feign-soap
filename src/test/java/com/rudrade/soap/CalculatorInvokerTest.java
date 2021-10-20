package com.rudrade.soap;

import com.rudrade.soap.invoker.CalculatorInvoker;
import com.rudrade.soap.response.AddResponse;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorInvokerTest {

    @Test
    public void addIntTest() {
        CalculatorInvoker oInvoker = new CalculatorInvoker();
        AddResponse oResponse = oInvoker.addValues(1, 3);
        Assert.assertEquals(4, (int) oResponse.getResult());
    }

}
