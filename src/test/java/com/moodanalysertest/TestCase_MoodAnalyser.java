    package com.moodanalysertest;

    import com.moodanalyser.MoodAnalyserReflector;
    import com.moodanalyser.MoodAnalyser_Exception;
    import org.junit.Assert;
    import org.junit.Test;

    import java.lang.reflect.Constructor;
public class TestCase_MoodAnalyser{
    @Test
    public void givenHappyMessageUsingReflectionWhenProperShouldReturnHappyMood() {
        try {
            Constructor<?> moodAnalyserConstructor = MoodAnalyserReflector.getConstructor(String.class);
            Object obj = MoodAnalyserReflector.createMoodAnalyserObject(moodAnalyserConstructor,"i am in happy mood");
            Object mood = MoodAnalyserReflector.invokeMethod(obj, "analyseMood");
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyser_Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenHappyMessageWhenImProperMethodShouldThrowMoodAnalyserException() {
        try {
            Constructor<?> moodAnalyserConstructor = MoodAnalyserReflector.getConstructor(String.class);
            Object obj = MoodAnalyserReflector.createMoodAnalyserObject(moodAnalyserConstructor,"i am in happy mood");
            MoodAnalyserReflector.invokeMethod(obj, "analyseMind");
        } catch (MoodAnalyser_Exception e) {
            Assert.assertEquals("NO_SUCH_METHOD_ERROR",e.getMessage());
        }
    }

}
