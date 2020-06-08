package com.razarana.dreambrokerchallenge.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.razarana.dreambrokerchallenge.Model.AnalysisResult;
import com.razarana.dreambrokerchallenge.Service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AnalysisController {

    @Autowired
    AnalysisService analysisService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String welcomeMessage() {
        return "welcome";
    }

    @PostMapping("/analyze")
    public AnalysisResult analysisString(@RequestBody String text) {

        //to fix this curl command problem of double quotes
        text=text.replace("'{text:","");
        text=text.replace("}'","");


        return analysisService.analyzeData(text);


    }
}
