package com.example.firstdemo.utils;

import java.util.List;

public class SuccessResponse<T> extends Response{
    protected T object;

    public SuccessResponse(int statusCode, T object) {
        super(statusCode);
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
