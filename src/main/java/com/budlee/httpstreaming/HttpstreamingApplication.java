package com.budlee.httpstreaming;

import com.budlee.httpstreaming.client.SampleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.beans.AppletInitializer;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class HttpstreamingApplication {

    //    @Bean
//    public GreeterStreamingService greeterStreamingService(){
//        return new GreeterStreamingService();
//    }
    @Autowired
    SampleClient sampleClient;

    @Bean
    public void getLaterBean() {
        AtomicReference<Integer> i = new AtomicReference<>(1);
        final ThreadPoolTaskScheduler threadpool = new ThreadPoolTaskScheduler();
        threadpool.initialize();
//        threadpool.scheduleAtFixedRate(() -> {
//            sampleClient.callGreeter("Thing " + i.getAndSet(i.get() + 1));
//        }, 10000);
        threadpool.scheduleAtFixedRate(() -> {
            sampleClient.callGreeter2("Thing " + i.getAndSet(i.get() + 1));
        }, 10000);
    }

    public static void main(String[] args) {
        SpringApplication.run(HttpstreamingApplication.class, args);
    }

}

