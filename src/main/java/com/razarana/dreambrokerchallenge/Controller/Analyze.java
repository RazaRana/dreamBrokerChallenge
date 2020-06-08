package com.razarana.dreambrokerchallenge.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Analyze {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String welcomeMessage() {
        return "welcome";
    }

    @PostMapping("/analyze")
    public String analysisString(@RequestBody String data) {
        return "";
    }
}
