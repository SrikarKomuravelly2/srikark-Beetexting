package org.demo.second;

import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Async")
public class MyController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/executeAsync")
    public CompletableFuture<String> executeAsync() throws InterruptedException {

        System.out.println("request thread++" + Thread.currentThread().getName());
                return asyncService.getAsyncData();
    }


}
