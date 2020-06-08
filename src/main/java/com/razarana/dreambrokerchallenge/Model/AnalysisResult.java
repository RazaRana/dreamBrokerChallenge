package com.razarana.dreambrokerchallenge.Model;


import java.util.HashMap;
import java.util.Set;


public class AnalysisResult {



    HashMap <String,Integer> textLength;
    int wordCount;
    Set characterCount;

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

    public Set getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(Set characterCount) {
        this.characterCount = characterCount;
    }

}
