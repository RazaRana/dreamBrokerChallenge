package com.razarana.dreambrokerchallenge.Controller;

import com.razarana.dreambrokerchallenge.Service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Analyze {

    @Autowired
    AnalysisService analysisService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String welcomeMessage() {
        return "welcome";
    }

    @PostMapping("/analyze")
    public String analysisString(@RequestBody String data) {
        return analysisService.analyzeData(data);
    }
}
