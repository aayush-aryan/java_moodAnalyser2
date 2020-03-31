package com.moodanalyser;

public class MoodAnalyser_Exception extends Exception {

    public enum ExceptionType{
        ENTERED_NULL,ENTERED_EMPTY,NO_SUCH_CLASS,NO_SUCH_METHOD,NO_ACCESS
        ,METHOD_INVOCATION_ISSUE,OBJECT_CREATION_ISSUE
    }
    public ExceptionType type;
    public  MoodAnalyser_Exception(ExceptionType type, String message){
        super(message);
        this.type=type;
    }

}

