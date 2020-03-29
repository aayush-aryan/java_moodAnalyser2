package com.moodanalyser;

public class MoodAnalyser_Exception extends Exception{
    public MoodAnalyser_Exception(ExceptionType enteredNull, String null_mood) {
        super(null_mood);
        this.type=type;
    }

    enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY
    }
    public ExceptionType type;


}
