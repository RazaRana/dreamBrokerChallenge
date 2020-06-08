package com.razarana.dreambrokerchallenge.Model;

import java.util.HashMap;
import java.util.Map;


public class AnalysisResult {



    HashMap <String,Integer> textLength;
    int wordCount;
    Map characterCount;

    public AnalysisResult(){
        textLength=new HashMap<>();
        wordCount=0;

    }


    public HashMap<String, Integer> getTextLength() {
        return textLength;
    }

    public void setTextLength(HashMap<String, Integer> textLength) {
        this.textLength = textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Map getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(Map characterCount) {
        this.characterCount = characterCount;
    }

}
