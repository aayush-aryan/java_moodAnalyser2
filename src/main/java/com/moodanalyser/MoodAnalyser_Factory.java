package com.moodanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyser_Factory {
    public static Constructor<?> getConstructor(Class<?> ...param) throws MoodAnalyser_Exception{
        try{
            Class<?> moodAnalyserClass = Class.forName("com.moodAnalyser.java.MoodAnalyser");
            return moodAnalyserClass.getConstructor(param);
        } catch (ClassNotFoundException e) {
            throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_CLASS,"NO_SUCH_CLASS_ERROR");
        } catch (NoSuchMethodException e) {
            throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_METHOD,"NO_SUCH_METHOD_ERROR");
        }
    }
    public static Object createMoodAnalyserObject(Constructor<?> constructor,Object ...message) throws MoodAnalyser_Exception {
        try {
            return constructor.newInstance(message);

        } catch (IllegalAccessException e) {
            throw new MoodAnalyser_Exception("IllegalAccessException");
        } catch (InstantiationException | InvocationTargetException e) {
            throw new MoodAnalyser_Exception("InstantiationException | InvocationTargetException e");
        }
    }
}