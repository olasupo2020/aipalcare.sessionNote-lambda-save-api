package com.aipalcare.sessionNotes.lambda.save.api;


import com.aipalcare.sessionNotes.lambda.save.api.models.LambdaRequest;
import com.aipalcare.sessionNotes.lambda.save.api.models.LambdaResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SaveSessionApi  implements RequestHandler<LambdaRequest, LambdaResponse> {
    @Override
    public LambdaResponse handleRequest(LambdaRequest input, Context context) {
        context.getLogger().log(toString());
        LambdaResponse response = new LambdaResponse();
        response.setMessage("Successfully Saved!:" + input.toString() );
    
        return response;
    }
}

