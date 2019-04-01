package com.testing.blue;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("yellow")
public interface YellowClient {
    @GetMapping("/word")
    ResponseEntity<String> getRandomWords();
}
