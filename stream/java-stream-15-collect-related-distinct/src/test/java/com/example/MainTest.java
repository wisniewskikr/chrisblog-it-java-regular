package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFilterExample() {

        List<Message> messages = Main.getMessages();                                    // Given

        List<String> results = Main.distinctExample(messages);                          // When

        assertEquals(2, results.size());                                       // Then

    }

}
