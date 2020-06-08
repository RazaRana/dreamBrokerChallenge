package com.razarana.dreambrokerchallenge.Controller;

import com.razarana.dreambrokerchallenge.Model.AnalysisResult;
import com.razarana.dreambrokerchallenge.Service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
        return analysisService.analyzeData(text);
    }
}
