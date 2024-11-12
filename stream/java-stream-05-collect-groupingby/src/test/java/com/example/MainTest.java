package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MainTest {

    @Test
    public void testToSetExample() {

        List<Message> messages = Main.getMessages();                    // Given

        Map<Long, String> results = Main.toMapExample(messages);        // When

        assertEquals(messages.size(), results.size());                  // Then

    }

}
