package com.budlee.httpstreaming.client;

import com.budlee.httpstreaming.CalculatorGrpc;
import com.budlee.httpstreaming.CalculatorOuterClass;
import com.budlee.httpstreaming.GreeterGrpc;
import com.budlee.httpstreaming.GreeterOuterClass;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.MethodDescriptor;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Component
public class SampleClient {


    public void callGreeter(String name) {
        String ipAddress = "127.0.0.1";
        int portNumber = 6565;

        final ManagedChannel channel = ManagedChannelBuilder.forAddress(ipAddress, portNumber)
                .usePlaintext()
                .build();

        final GreeterGrpc.GreeterFutureStub stub = GreeterGrpc.newFutureStub(channel);
        GreeterOuterClass.HelloRequest helloRequest = GreeterOuterClass.HelloRequest.newBuilder()
                .setName(name)
                .build();
        final ListenableFuture<GreeterOuterClass.HelloReply> helloReplyListenableFuture = stub.sayHello(helloRequest);
        try {
            final GreeterOuterClass.HelloReply helloReply = helloReplyListenableFuture.get();
            System.out.println(helloReply.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void callGreeter2(String name) {
        String ipAddress = "127.0.0.1";
        int portNumber = 6565;

        var channel = ManagedChannelBuilder.forAddress(ipAddress, portNumber)
                .usePlaintext()
                .build();


        var helloRequest = GreeterOuterClass.HelloRequest.newBuilder()
                .setName(name)
                .build();
        var greeterStub = GreeterGrpc.newStub(channel);
        greeterStub.sayHello2(helloRequest, new StreamObserver<GreeterOuterClass.HelloReply>() {
            @Override
            public void onNext(GreeterOuterClass.HelloReply value) {
                System.out.println("Stream result" + value.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                System.out.println(t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Ended");
            }
        });

//
//        final GreeterGrpc.GreeterFutureStub stub = GreeterGrpc.newFutureStub(channel);
//        GreeterOuterClass.HelloRequest helloRequest = GreeterOuterClass.HelloRequest.newBuilder()
//                .setName(name)
//                .build();
//        final ListenableFuture<GreeterOuterClass.HelloReply> helloReplyListenableFuture = stub.sayHello(helloRequest);
//        try {
//            final GreeterOuterClass.HelloReply helloReply = helloReplyListenableFuture.get();
//            System.out.println(helloReply.getMessage());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }

}
