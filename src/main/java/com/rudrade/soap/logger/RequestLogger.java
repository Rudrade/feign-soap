package com.rudrade.soap.logger;

import feign.Logger;

public class RequestLogger extends Logger {

    @Override
    protected void log(String s, String s1, Object... objects) {
        System.out.println(String.format(s1, objects));
    }
}
