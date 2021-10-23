package com.ooad.rasika.Average_Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

public class AppTest {
    
	private Average average;
    private int[] list={1, 2, 3, 4, 5};

    
    @Test
    public void KNegative() {
        assertEquals(0, average.average(-1, list));
    }

    @Test
    public void KZero() {
        assertEquals(0, average.average(0, list));
    }

    @Test
    public void KPositive() {
        assertEquals(2, average.average(3, list));
    }

    @Test
    public void ListNull() {
    	Assertions.assertThrows(NullPointerException.class, () -> average.average(3, null));
    }

    @Test
    public void ListEmpty() {
        average.average(3, new int[]{})


    }
    @Test
    public void KGreater() {
        assertEquals(2, average.average(6, list));
    }

    /*@Test
    public void FailureTestCase() {
    	assertEquals(2.5, average.average(4, list));
    }*/



   
}
