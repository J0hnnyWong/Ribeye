package com.Johnny.ribeye.model;

public class BasicResponseModel<T> {

    private final String status;
    private final T content;

    public BasicResponseModel(String status, T content) {
        this.status = status;
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public T getContent() {
        return content;
    }
}
