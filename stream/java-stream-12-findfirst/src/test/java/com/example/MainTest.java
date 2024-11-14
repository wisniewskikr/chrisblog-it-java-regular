package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFindFirstExample() {

        List<Message> messages = Main.getMessages();                      // Given

        Message result = Main.findFirstExample(messages);                 // When

        assertEquals(Long.valueOf(1), result.getId());                  // Then

    }

}
