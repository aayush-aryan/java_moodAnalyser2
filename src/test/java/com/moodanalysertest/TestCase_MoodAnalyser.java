    package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyser_Exception;
import com.moodanalyser.MoodAnalyser_Factory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

    public class TestCase_MoodAnalyser{
        @Test
        public void moodAnalyser_ClassName_Return_MoodAnalyserObject(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            try {
                MoodAnalyser anotherMoodAnalyserObject = MoodAnalyser_Factory.createMoodAnalyserObject("com.moodAnalyser.MoodAnalyser",String.class);
                Assert.assertTrue(moodAnalyser.isEqualsObject(anotherMoodAnalyserObject));
            } catch (MoodAnalyser_Exception | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        @Test
        public void classNameImproper_ThrowMood_AnalyserException() {
            try {
                MoodAnalyser_Factory.createMoodAnalyserObject("com.moodAnalyser.MindAnalyser",String.class);
                System.out.println(" not exception");
            } catch (MoodAnalyser_Exception | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                Assert.assertEquals("NO_SUCH_CLASS_ERROR", e.getMessage());
            }
        }
        @Test
        public void constructorParameter_Throw_moodAnalyser_Exception() {
            try {
                MoodAnalyser moodAnalyser = MoodAnalyser_Factory.createMoodAnalyserObject("com.moodAnalyser.MoodAnalyser",Integer.class);
            } catch (MoodAnalyser_Exception | IllegalAccessException | InvocationTargetException | InstantiationException e) {
                Assert.assertEquals("NO_SUCH_METHOD_ERROR", e.getMessage());
            }
        }
}
