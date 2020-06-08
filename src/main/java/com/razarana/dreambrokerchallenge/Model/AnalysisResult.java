package com.razarana.dreambrokerchallenge.Model;


import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


public class AnalysisResult {



    TreeMap <String,Integer> textLength;
    int wordCount;
    Set characterCount;

    public AnalysisResult(){
        textLength=new TreeMap<>();
        wordCount=0;

    }


    public TreeMap<String, Integer> getTextLength() {
        return textLength;
    }

    public void setTextLength(TreeMap<String, Integer> textLength) {
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
