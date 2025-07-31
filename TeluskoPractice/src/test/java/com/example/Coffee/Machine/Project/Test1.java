package com.example.Coffee.Machine.Project;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void Sample_Equals() {
        String expected = "Hello, World!";
        String actual = "Hello, World!";

        // Using JUnit's assertEquals to compare expected and actual values
        org.junit.Assert.assertEquals(expected, actual);
    }


    @Ignore("Disabled for demonstration purposes")
    @Test
    public void Assert_Equal()
    {
        int expected=5;
        int actual=2+3;

        assertEquals(expected, actual);
    }
}