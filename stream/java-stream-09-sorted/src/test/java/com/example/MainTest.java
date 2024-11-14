package com.example;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSortedAscExample() {

        List<Message> messages = Main.getMessages();                                    // Given

        List<Message> results = Main.sortedAsc(messages);                               // When

        assertEquals(Long.valueOf(1), results.get(0).getId());                  // Then

    }

    @Test
    public void testSortedDescExample() {

        List<Message> messages = Main.getMessages();                                    // Given

        List<Message> results = Main.sortedDesc(messages);                               // When

        assertEquals(Long.valueOf(4), results.get(0).getId());                   // Then

    }

}
