    package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyser_Exception;
import com.moodanalyser.MoodAnalyser_Factory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class TestCase_MoodAnalyser{
    @Test
    public void givenMoodAnalyserClassNameShouldReturnMoodAnalyserObjectUSingDefaultConstructor(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            Constructor<?> moodAnalyserConstructor = MoodAnalyser_Factory.getConstructor();
            MoodAnalyser anotherMoodAnalyserObject = (MoodAnalyser) MoodAnalyser_Factory.createMoodAnalyserObject(moodAnalyserConstructor);
            Assert.assertEquals(true,  moodAnalyser.isEqualsObject(anotherMoodAnalyserObject));
        } catch (MoodAnalyser_Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyserClassNameShouldReturnMoodAnalyserObjectUSingParameterizeConstructor(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            Constructor<?> moodAnalyserConstructor = MoodAnalyser_Factory.getConstructor(String.class);
            MoodAnalyser anotherMoodAnalyserObject = (MoodAnalyser) MoodAnalyser_Factory.createMoodAnalyserObject(moodAnalyserConstructor,"i am happy");
            Assert.assertTrue(moodAnalyser.isEqualsObject(anotherMoodAnalyserObject));
        } catch (MoodAnalyser_Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenImproperConstructorParameterShouldThrowMoodAnalyserException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            Constructor<?> moodAnalyserConstructor = MoodAnalyser_Factory.getConstructor(Integer.class);
            MoodAnalyser_Factory.createMoodAnalyserObject(moodAnalyserConstructor);

        } catch ( MoodAnalyser_Exception e) {
            Assert.assertEquals("NO_SUCH_METHOD_ERROR", e.getMessage());
        }
    }

}
