package com.budlee.httpstreaming.services;

import com.budlee.httpstreaming.GreeterGrpc;
import com.budlee.httpstreaming.GreeterOuterClass;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@GRpcService
public class GreeterStreamingService extends GreeterGrpc.GreeterImplBase {


    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void sayHello2(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        for (int i : IntStream.range(0,20).boxed().collect(Collectors.toUnmodifiableList())) {
            responseObserver.onNext(replyBuilder.build());
        }
        responseObserver.onCompleted();
    }
}
