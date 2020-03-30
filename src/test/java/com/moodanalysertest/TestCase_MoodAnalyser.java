    package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyser_Exception;
import com.moodanalyser.MoodAnalyser_Factory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

    public class TestCase_MoodAnalyser {


        private MoodAnalyser_Factory MoodAnalyserFactory;

        @Test
        public void givenMoodAnalyserClassNameShouldReturnMoodAnalyserObject(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            try {
                MoodAnalyser anotherMoodAnalyserObject = MoodAnalyser_Factory.createMoodAnalyserObject("com.moodAnalyser.MoodAnalyser");
                Assert.assertEquals(true,  moodAnalyser.isEqualsObject(anotherMoodAnalyserObject));
            } catch (MoodAnalyser_Exception | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        @Test
        public void givenClassNameImproperShouldThrowMoodAnalyserException() {
            try {
                MoodAnalyser_Factory.createMoodAnalyserObject("com.moodAnalyser.MoodAnalyser");
                System.out.println(" not exception");
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException | MoodAnalyser_Exception e) {
                Assert.assertEquals("NO_SUCH_CLASS_ERROR", e.getMessage());
            }
        }
        @Test
        public void givenImproperConstructorParameterShouldThrowMoodAnalyserException() {
            try {
                MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyserObject("com.moodAnalyser.java.MoodAnalyser", Integer.class);
            } catch (MoodAnalyser_Exception | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                Assert.assertEquals("NO_SUCH_METHOD_ERROR", e.getMessage());
            }
        }
}
