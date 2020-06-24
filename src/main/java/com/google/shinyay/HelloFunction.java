package com.google.shinyay;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.sql.Timestamp;

public class HelloFunction implements HttpFunction {
    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) throws Exception {
        httpResponse.getWriter().write("Hello, my Function at " + new Timestamp(System.currentTimeMillis()).toString());
    }
}
