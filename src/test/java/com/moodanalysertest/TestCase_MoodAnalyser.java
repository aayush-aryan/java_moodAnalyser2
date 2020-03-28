package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class TestCase_MoodAnalyser {

        @Test
        public void return_Sad_Mood(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String actual = moodAnalyser.analyseMood("i am in sad mood");
            String expected= "SAD";
            Assert.assertEquals(expected,actual);
        }
        @Test
        public void return_Happy_Mood(){
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String actual = moodAnalyser.analyseMood("i am in any mood");
            String expected= "HAPPY";
            Assert.assertEquals(expected,actual);
        }

}
