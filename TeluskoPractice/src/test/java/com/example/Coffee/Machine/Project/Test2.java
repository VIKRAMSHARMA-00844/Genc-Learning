package com.example.Coffee.Machine.Project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test2 {

    @Test
    public void Sample_Equal()
    {
        int expected=5;
        int actual=2+3;

        assertEquals(expected, actual);
    }
}
