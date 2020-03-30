package com.moodanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyser_Factory {
    public static MoodAnalyser createMoodAnalyserObject(String className, Class<?>... param) throws MoodAnalyser_Exception, IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            Class<?> moodAnalyserClass = Class.forName(className);
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(param);
            return (MoodAnalyser) moodConstructor.newInstance("i am happy");
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_ERROR");
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_ERROR");
        }
    }
}