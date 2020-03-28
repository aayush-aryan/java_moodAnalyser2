package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_MoodAnalyser {

        @Test
        public void return_Sad_Mood(){
            MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
            String actual = moodAnalyser.analyseMood();
            String expected= "SAD";
            Assert.assertEquals(expected,actual);
        }
        @Test
        public void return_Happy_Mood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in Happy mood");
        String actual = moodAnalyser.analyseMood();
        String expected= "HAPPY";
        Assert.assertEquals(expected,actual);
    }

}
