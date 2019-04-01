package com.testing.yellow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class YController {

    @Value("${words}")
    private String [] wordsList;

    @GetMapping("/word")
    public ResponseEntity<String> getRandomWords(){
        int randomIndex = new Random().nextInt(wordsList.length);
        return ResponseEntity.ok(wordsList[randomIndex]);
    }

}
