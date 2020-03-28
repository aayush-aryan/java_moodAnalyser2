package com.moodanalyser;

public class MoodAnalyser {

    String message;
    MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message=message;
    }

    public String analyseMood(){
        if(message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }

}
