package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    
    public static void main( String[] args ) {

        List<Message> messages = getMessages();

        Set<Message> results = toSetExample(messages);

        results.forEach(System.out::println);
        
    }

    public static List<Message> getMessages() {

        List<Message> messages = new ArrayList<>();

        messages.add(new Message(1L, "Hello", "EN", Arrays.asList(new User(1L, "John"), new User(2L, "Mark"))));
        messages.add(new Message(2L, "Good Morning", "EN", Arrays.asList(new User(1L, "John"), new User(3L, "Paul"))));
        messages.add(new Message(3L, "Witaj", "PL", Arrays.asList(new User(1L, "John"), new User(2L, "Mark"))));
        messages.add(new Message(4L, "Dzien Dobry", "PL", Arrays.asList(new User(1L, "John"), new User(3L, "Paul"))));

        return messages;

    }

    public static Set<Message> toSetExample(List<Message> messages) {

        Set<Message> results = messages.stream().collect(Collectors.toSet());
        return results;

    }

}