package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testMaxExample() {

        List<Message> messages = Main.getMessages();                      // Given

        Message result = Main.maxExample(messages);                       // When

        assertEquals(Long.valueOf(4), result.getId());                  // Then

    }

}
