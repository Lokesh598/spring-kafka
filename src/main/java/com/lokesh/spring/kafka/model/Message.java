package com.lokesh.spring.kafka.model;

public class Message {
    private static final long serialVersionUID = 1L;
    private String message;

    public Message() {}
    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
