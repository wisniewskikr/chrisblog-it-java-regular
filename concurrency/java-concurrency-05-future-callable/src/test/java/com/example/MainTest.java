package com.example;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class MainTest {

    @Test
    public void getMessageClassicTest() throws InterruptedException, ExecutionException {

        Main main = new Main();                                     // Given
        
        String message = main.getMessageClassic();                  // When

        assertEquals("Hello World, Stranger", message);    // Then

    }

    @Test
    public void getMessageAbstractMethodTest() throws InterruptedException, ExecutionException {

        Main main = new Main();                                     // Given
        
        String message = main.getMessageAbstractMethod();           // When

        assertEquals("Hello World, Stranger", message);    // Then

    }

    @Test
    public void getMessageLambdaTest() throws InterruptedException, ExecutionException {

        Main main = new Main();                                     // Given
        
        String message = main.getMessageLambda();                   // When

        assertEquals("Hello World, Stranger", message);    // Then

    }

}
