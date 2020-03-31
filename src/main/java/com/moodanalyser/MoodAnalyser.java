package com.moodanalyser;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(){
        message = "happy";
    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(String msg) throws MoodAnalyser_Exception {
        return analyseMood();
    }
    public String analyseMood() throws MoodAnalyser_Exception {
        try {
            if(message.length()==0)
                throw  new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.ENTERED_EMPTY,"EMPTY MOOD");
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        }catch(NullPointerException e){
            throw  new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.ENTERED_NULL,"NULL MOOD");
        }
    }
    public boolean isEqualsObject(Object another){
        return this.getClass().equals(another.getClass());
    }



}