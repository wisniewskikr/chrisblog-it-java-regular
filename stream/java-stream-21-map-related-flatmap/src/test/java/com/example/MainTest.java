package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFlatMapExample() {

        List<Message> messages = Main.getMessages();                                    // Given

        List<String> results = Main.flatMapExample(messages);                           // When

        assertEquals(8, results.size());                                       // Then

    }

}
