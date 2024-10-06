package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class JavaLambda implements RequestHandler<Input, Output> {


    @Override
    public Output handleRequest(Input input, Context context) {
        String response = "enronces que mas".concat(input.getName());
        Output output = new Output();
        output.setResponse(response);
        return null;
    }
}