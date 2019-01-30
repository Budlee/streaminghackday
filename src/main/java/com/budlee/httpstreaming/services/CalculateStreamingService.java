package com.budlee.httpstreaming.services;

import com.budlee.httpstreaming.CalculatorGrpc;
import com.budlee.httpstreaming.CalculatorOuterClass;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class CalculateStreamingService extends CalculatorGrpc.CalculatorImplBase {
    @Override
    public void calculate(CalculatorOuterClass.CalculatorRequest request, StreamObserver<CalculatorOuterClass.CalculatorResponse> responseObserver) {

        CalculatorOuterClass.CalculatorResponse.Builder resultBuilder = CalculatorOuterClass.CalculatorResponse.newBuilder();
        switch (request.getOperation()){
            case ADD:
                resultBuilder.setResult(request.getNumber1()+request.getNumber2());
                break;
            case SUBTRACT:
                resultBuilder.setResult(request.getNumber1()-request.getNumber2());
                break;
            case MULTIPLY:
                resultBuilder.setResult(request.getNumber1()*request.getNumber2());
                break;
            case DIVIDE:
                resultBuilder.setResult(request.getNumber1()/request.getNumber2());
                break;
            case UNRECOGNIZED:
                break;
        }
        responseObserver.onNext(resultBuilder.build());
        responseObserver.onCompleted();

    }
}
