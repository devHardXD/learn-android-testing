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
        int a = 5;
        int b = 3;

        SecondActivity secondActivity = Robolectric.buildActivity(SecondActivity.class).create().get();

        int result = secondActivity.hitung(a, b);
        assertEquals(8, result);
    }
}

