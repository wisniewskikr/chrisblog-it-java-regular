package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testNoneMatchExample() {

        List<Message> messages = Main.getMessages();                               // Given

        boolean result = Main.noneMatchExample(messages);                           // When

        assertEquals(false, result);                                       // Then

    }

}
