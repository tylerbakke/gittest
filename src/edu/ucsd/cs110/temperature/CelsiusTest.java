package edu.ucsd.cs110.temperature;

import static org.junit.Assert.*;
import org.junit.Test;

public class CelsiusTest {
    private float delta = 0.001f;
    @Test
    public void testCelsius(){
        float value = 12.34f;
        Celsius temp = new Celsius(value);
        assertEquals(value, temp.getValue(), delta);
    }
    @Test
    public void testCelsiusToString(){
        float value = 12.34f;
        Celsius temp = new Celsius(value);
        String string = temp.toString();
        String beginning = "" + value;
        String ending = " C";
        // Verify the suffix of the formatted string
        assertTrue(string.startsWith(beginning));
        // Verify the prefix of the formatted string
        assertTrue(string.endsWith(ending));
        // Verify the middle of the formatted string
        int endIndex = string.indexOf(ending);
        // (Hint: what is the length of the middle of the string?)
        assertTrue(string.substring(0, endIndex).equals(beginning));
    }
    @Test
    public void testCelsiusToCelsius()
    {
        Celsius temp = new Celsius(0);
        Temperature convert = temp.toCelsius();
        assertEquals(0, convert.getValue(), delta);
    }
    @Test
    public void testCelsiusToFahrenheit(){
        Celsius temp = new Celsius(0);
        Temperature convert = temp.toFahrenheit();
        assertEquals(32, convert.getValue(), delta);
        temp = new Celsius(100);
        convert = temp.toFahrenheit();
        assertEquals(212, convert.getValue(), delta);
    }
}