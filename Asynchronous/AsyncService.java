package org.demo.second;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public CompletableFuture<String> getAsyncData() throws InterruptedException {
        System.out.println("Async method is running");
        Thread.sleep(5000);
        return CompletableFuture.completedFuture("Async data");
    }

}
