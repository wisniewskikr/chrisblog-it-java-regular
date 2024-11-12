package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.junit.Test;

public class MainTest {

    @Test
    public void testToSetExample() {

        List<Message> messages = Main.getMessages();                    // Given

        Set<Message> results = Main.toSetExample(messages);             // When

        assertEquals(messages.size(), results.size());                  // Then

    }

}
