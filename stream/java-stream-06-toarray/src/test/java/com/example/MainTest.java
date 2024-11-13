package com.example;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MainTest {

    @Test
    public void testGroupingByExample() {

        List<Message> messages = Main.getMessages();                                    // Given

        Map<String, List<Message>> results = Main.groupingByExample(messages);          // When

        assertEquals(2, results.size());                                       // Then

    }

}
