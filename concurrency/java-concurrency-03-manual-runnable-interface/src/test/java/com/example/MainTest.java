package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void getMessageTest() throws InterruptedException {

        Main main = new Main();                                     // Given
        
        String message = main.getMessage();                         // When

        assertEquals("Hello World, Stranger", message);    // Then

    }

}
