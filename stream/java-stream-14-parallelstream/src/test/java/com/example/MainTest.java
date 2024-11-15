package com.example;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testFindAnyExample() {

        List<Message> messages = Main.getMessages();                     // Given

        Message result = Main.findAnyExample(messages);                  // When

        assertNotNull(result);                                           // Then

    }

}
