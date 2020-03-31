package com.moodanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserReflector {

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
        } catch (InstantiationException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.OBJECT_CREATION_ISSUE,"OBJECT_CREATION_ISSUE");
        } catch (InvocationTargetException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.METHOD_INVOCATION_ISSUE,"METHOD_INVOCATION_ISSUE");
        } catch (IllegalAccessException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_ACCESS,"NO_ACCESS");
        }
        }
public static Object invokeMethod(Object moodAnalyseObject, String methodName) throws MoodAnalyser_Exception {
        try {
        return moodAnalyseObject.getClass().getMethod(methodName).invoke(moodAnalyseObject);
        } catch (NoSuchMethodException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD_ERROR");
        } catch (IllegalAccessException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_ACCESS, "NO_ACCESS");
        } catch (InvocationTargetException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.METHOD_INVOCATION_ISSUE, "METHOD_INVOCATION_ISSUE");
        }
        }
public static void setFieldValue(Object obj, String fieldName, String fieldValue) throws MoodAnalyser_Exception {
        try {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, fieldValue);
        } catch (NoSuchFieldException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_SUCH_FIELD, "NO_SUCH_FIELD");
        } catch (IllegalAccessException e) {
        throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.NO_ACCESS, "NO_ACCESS");
        }

    }

}
