package com.example.testingdebugginge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class hitungTest {
    @Test
    public void testHitung() {
        // Mock input values
        int a = 5;
        int b = 3;

        // Create an instance of SecondActivity using Robolectric
        SecondActivity secondActivity = Robolectric.buildActivity(SecondActivity.class).create().get();

        // Call the method
        int result = secondActivity.hitung(a, b);

        // Verify that the result is correct
        assertEquals(8, result);
    }
}

