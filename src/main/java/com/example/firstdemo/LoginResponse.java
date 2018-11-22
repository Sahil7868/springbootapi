package com.example.firstdemo;

public class LoginResponse {

    private boolean status;
    private user_details data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public user_details getData() {
        return data;
    }

    public void setData(user_details data) {
        this.data = data;
    }
}
