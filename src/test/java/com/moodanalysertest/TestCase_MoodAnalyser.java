package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import com.moodanalyser.MoodAnalyser_Exception;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_MoodAnalyser {

    @Test
    public void Empty_Mood_Throw_MoodAnalyser_Exception(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyser_Exception e) {
            Assert.assertEquals("EMPTY MOOD", e.getMessage());
        }
    }

    @Test
    public void Null_Mood_Throw_MoodAnalyser_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyser_Exception e) {
            Assert.assertEquals("NULL MOOD", e.getMessage());
        }
    }
}