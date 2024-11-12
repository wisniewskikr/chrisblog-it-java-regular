package com.example;

import java.util.List;

public class Message {
    
    private Long id;
    private String text;
    private String language;
    private List<User> users;

    public Message(Long id, String text, String language, List<User> users) {
        this.id = id;
        this.text = text;
        this.language = language;
        this.users = users;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", text=" + text + ", language=" + language + ", users=" + users + "]";
    }     

}