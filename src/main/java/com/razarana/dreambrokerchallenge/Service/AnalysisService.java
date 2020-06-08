package com.razarana.dreambrokerchallenge.Service;

import com.razarana.dreambrokerchallenge.Model.AnalysisResult;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class AnalysisService {


    public AnalysisResult analyzeData(String data){
        AnalysisResult result= new AnalysisResult();


        //add text length with and without spaces to the result
        result.setTextLength(analyzeTextLength(data));
        //add number of words in the data to the result
        result.setWordCount(analyzeWordCount(data));

        //count char freq
        result.setCharacterCount(analyzeCharCount(data));



        return result;
    }

    private HashMap<String,Integer> analyzeTextLength(String data){
        HashMap<String,Integer> lengths=new HashMap<String,Integer>();

        //length with spaces
        lengths.put("withSpaces",data.length());

        //omitting spaces
        data=data.replaceAll(" ","");

        //length after omitting spaces
        lengths.put("withoutSpaces",data.length());

        return lengths;
    }

    private int analyzeWordCount(String data){
        String temp[]=data.trim().split(" ");
        return temp.length;

    }

    private Map analyzeCharCount(String data){

        Map<Character,Integer> charFreq = new HashMap<Character,Integer>();
        if (data != null) {
            for (Character c : data.toCharArray()) {
                Integer count = charFreq.get(c);
                int newCount = (count==null ? 1 : count+1);
                charFreq.put(c, newCount);
            }
        }


        return charFreq;

    }
}
