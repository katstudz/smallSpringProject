package com.testing.blue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController
{
    @Autowired
    private YellowClient yellowClient;

    @GetMapping("getFromYellow")
    public ResponseEntity<String > getFromYellow(){
        String yellowWord = yellowClient.getRandomWords().getBody();
        return ResponseEntity.ok("XD " + yellowWord);
    }
}
