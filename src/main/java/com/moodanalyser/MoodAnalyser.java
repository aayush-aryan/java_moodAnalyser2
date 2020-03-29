package com.moodanalyser;

public class MoodAnalyser {

    String message;
    MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message =message;
    }

    public String analyseMood(){
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
            return "HAPPY";
        }
        catch(Exception ex){
            return "HAPPY";
        }

    }

}
