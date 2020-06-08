package com.razarana.dreambrokerchallenge.Model;

import java.util.HashMap;
import java.util.Map;


public class AnalysisResult {

    HashMap <String,Integer> textLength;
    int wordCount;
    HashMap characterCount[];

    AnalysisResult(){
        textLength=new HashMap<>();
        wordCount=0;

    }

}
