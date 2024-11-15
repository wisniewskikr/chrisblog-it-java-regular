package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class MainTest {

    @Test
    public void testLimitExample() {

        List<Message> messages = Main.getMessages();                    // Given

        List<Message> results = Main.limitExample(messages);            // When

        assertEquals(3, results.size());                       // Then

    }

}
