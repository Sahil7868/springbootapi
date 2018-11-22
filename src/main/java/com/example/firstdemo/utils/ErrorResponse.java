package com.example.firstdemo.utils;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse extends Response{

    private List<String> messages;

    public ErrorResponse(int statusCode) {
        super(statusCode);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void addMessage(String message){
        if(messages==null)
            messages=new ArrayList<>();
        messages.add(message);
    }
}
